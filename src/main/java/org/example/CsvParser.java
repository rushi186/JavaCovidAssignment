package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CsvParser {

    public CSVParser getParseFile(String path) throws IOException {
        String SAMPLE_CSV_FILE_PATH = path;
        Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
        return new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());
    }
    public static String calculatePercentage(int part, int total) {
        return total > 0 ? String.format("%.2f%%", (part / (double) total) * 100) : "0%";
    }

}
