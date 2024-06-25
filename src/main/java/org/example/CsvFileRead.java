package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvFileRead  {

    public static List<Map<String, String>> parseCsvToJson(String fileName) {
        List<Map<String, String>> data = new ArrayList<>();
        try (CSVReader reader = new CSVReaderBuilder(new FileReader(fileName)).withSkipLines(0).build()) {
            String[] headers = reader.readNext(); // Read the header line
            String[] line;
            while ((line = reader.readNext()) != null) {
                Map<String, String> row = new HashMap<>();
                for (int i = 0; i < headers.length; i++) {
                    row.put(headers[i], line[i]);
                }
                data.add(row);
            }
            System.out.println("CSV parsed successfully");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
        return data;
    }

    public static String calculatePercentage(double part, double total) {
        return String.format("%.2f%%", (part / total) * 100);
    }

    public static void main(String[] args) {
        String fileName = "F:\\qnaProject\\NewStreamOperation\\covid-assignment\\data\\country_wise_latest.csv" ;
        List<Map<String, String>> data = parseCsvToJson(fileName);
        System.out.println(data);

        double part = 25;
        double total = 100;
        String percentage = calculatePercentage(part, total);
        System.out.println("Percentage: " + percentage);
    }
}
