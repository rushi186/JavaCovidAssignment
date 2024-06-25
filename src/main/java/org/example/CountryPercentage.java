package org.example;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryPercentage {
    public static String calculatePercentage(int part, int total) {
        return total > 0 ? String.format("%.2f%%", (part / (double) total) * 100) : "0%";
    }

    public static void main(String[] args) throws IOException {
        CsvParser csvParser = new CsvParser();
        CSVParser csvFile = csvParser.getParseFile("F:\\qnaProject\\NewStreamOperation\\covid-assignment\\data\\country_wise_latest.csv");
        List<CountryStatistics> countryStatistics = new ArrayList<>();
        for (CSVRecord csvRecord : csvFile) {
            String country = csvRecord.get(0);
            int confirmed = Integer.parseInt(csvRecord.get(1));
            int deaths = Integer.parseInt(csvRecord.get(2));
            int recoverd = Integer.parseInt(csvRecord.get(3));
            int totalActive = Integer.parseInt(csvRecord.get(4));
            if ((deaths / confirmed * 100) < 15) {
                String deathsPercentage = calculatePercentage(deaths, confirmed);
                String recoverdPercentage = calculatePercentage(recoverd, confirmed);
                String activepercentage = calculatePercentage(totalActive, confirmed);
                countryStatistics.add(new CountryStatistics(
                        country,
                        confirmed,
                        deathsPercentage,
                        recoverdPercentage,
                        activepercentage));
            }
        }
        for (CountryStatistics statistics : countryStatistics) {
                System.out.println("-------------");
                System.out.println("County:" + statistics.getCountryName());
                System.out.println("Total-Confirmed:" + statistics.getTotalConfirmedCases());
                System.out.println("Death-Percentage:" + statistics.getDeathsPercentage());
                System.out.println("Recovered-Percentage:" + statistics.getRecoveredPercentage());
                System.out.println("Active-Percentage:" + statistics.getActivePercentage());
        }
    }
}
