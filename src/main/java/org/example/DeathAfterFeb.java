/**
 * Problem 7
 *
 * Get all deaths that happened after 29 Feb 2020
 *
 * output: 1000
 */
package org.example;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DeathAfterFeb {
     public void  getDeathAfterFeb(CSVParser csvParser)throws IOException {
      int  deathAfterFeb=0;
        CSVParser csvFile=csvParser;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate cutoffDate = LocalDate.of(2020, 2, 29);
        for (CSVRecord csvRecord:csvFile)
        {
            String datestr=csvRecord.get(0);
            LocalDate date=LocalDate.parse(datestr,formatter);
              if(date.isAfter(cutoffDate))
              {
                  String deaths= csvRecord.get(2);
                  deathAfterFeb+=Integer.parseInt(deaths);
              }
        }
        System.out.println(deathAfterFeb);
    }
}
