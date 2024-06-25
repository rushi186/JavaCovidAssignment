package org.example;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
public class GetCSVfileDeath {
    public static void main(String[] args) throws IOException {
        int Alldeaths=0;
        CsvParser csvParser = new CsvParser();
        CSVParser csvFile = csvParser.getParseFile("F:\\qnaProject\\NewStreamOperation\\covid-assignment\\data\\country_wise_latest.csv");
        for(CSVRecord csvRecord:csvFile)
        {
            String deaths=csvRecord.get(3);
            Alldeaths+=Integer.parseInt(deaths);
        }
        System.out.println(Alldeaths);
    }
}
