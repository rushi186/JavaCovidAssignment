package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import javax.swing.text.DateFormatter;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortRecord {
    public void getSortedData(CSVParser csvParser) throws IOException {
        CSVParser csvFile=csvParser;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        List<CovidRecord> records=new ArrayList<>();
        for(CSVRecord csvRecord:csvFile)
        {
            String dateStr = csvRecord.get(0);
            LocalDate date = LocalDate.parse(dateStr, formatter);
            String confirmed=csvRecord.get(1);
            String death=csvRecord.get(2);
            String recovered=csvRecord.get(3);
            String active=csvRecord.get(4);

            CovidRecord covidRecord=new CovidRecord(date,confirmed,death,recovered,active);
            records.add(covidRecord);
        }
        Collections.sort(records, Comparator.comparing(CovidRecord::getDate));
        for (CovidRecord covidRecord:records)
        {
            System.out.println(covidRecord);
        }
    }
}
