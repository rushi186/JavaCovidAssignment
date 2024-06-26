package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BasicCSVReader {

    public void getAllData(CSVParser csvParser) throws IOException {
       {
           CSVParser csvFile=csvParser;
            for (CSVRecord csvRecord : csvFile) {
                     String country = csvRecord.get(0);
                     String confirmed = csvRecord.get(1);
                     String deaths = csvRecord.get(2);
                     String recovered = csvRecord.get(3);
                     System.out.println("Record No - " + csvRecord.getRecordNumber());
                     System.out.println("---------------");
                     System.out.println("country : " + country);
                     System.out.println("Confirmed : " + confirmed);
                     System.out.println("Deaths : " + deaths);
                     System.out.println("Recovered: " + recovered);
                     System.out.println("---------------\n\n");

            }
        }
    }
}
