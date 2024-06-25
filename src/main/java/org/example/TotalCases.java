package org.example;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TotalCases {
    public static void main(String[] args) throws IOException {
        CsvParser csvParser = new CsvParser();
        CSVParser csvFile = csvParser.getParseFile("F:\\qnaProject\\NewStreamOperation\\covid-assignment\\data\\country_wise_latest.csv");
        List<CountryCovid> covidList = new ArrayList<>();
        for (CSVRecord csvRecord : csvFile) {
            String country = csvRecord.get(0);
            String confirmed = csvRecord.get(1);
            String deaths = csvRecord.get(2);
            String recoverd = csvRecord.get(3);
            CountryCovid countryCovid = new CountryCovid(country, confirmed, deaths, recoverd);
            covidList.add(countryCovid);
        }
        for (CountryCovid countryCovid : covidList) {
            System.out.println(countryCovid);
        }
        int totalConfirmedCases = covidList.stream()
                .mapToInt(m -> Integer.parseInt(m.getConfirmed()))
                .sum();

        int totalDeaths = covidList.stream()
                .mapToInt(m -> Integer.parseInt(m.getDeaths()))
                .sum();
        int recovered = covidList.stream()
                .mapToInt(m -> Integer.parseInt((m.getRecovered())))
                .sum();

        System.out.println("Total Confirmed Cases: " + totalConfirmedCases);
        System.out.println("Total Deaths: " + totalDeaths);
        System.out.println("Total Recoverd:" + recovered);
    }
}
