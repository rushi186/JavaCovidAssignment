package org.example;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
public class GetAllCountryDeath {
    public void allDeath(CSVParser csvParser) throws IOException {
        int Alldeaths=0;
        CSVParser csvFile =csvParser;
        for(CSVRecord csvRecord:csvFile)
        {
            String deaths=csvRecord.get(3);
            Alldeaths+=Integer.parseInt(deaths);
        }
        System.out.println(Alldeaths);
    }
}
