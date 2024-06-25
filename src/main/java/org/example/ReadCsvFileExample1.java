package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCsvFileExample1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File( "F:\\qnaProject\\NewStreamOperation\\covid-assignment\\data\\country_wise_latest.csv"));
        sc.useDelimiter(",");
        while (sc.hasNext())
        {
            System.out.println(sc.next());
        }
        sc.close();
    }
}
