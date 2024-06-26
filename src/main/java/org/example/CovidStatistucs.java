package org.example;

import org.apache.commons.csv.CSVParser;

import java.io.IOException;
import java.util.Scanner;

public class CovidStatistucs {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        CsvParser csvParser=new CsvParser();
        CsvParser csvParser1=new CsvParser();

        CSVParser countryWiseFile=csvParser.getParseFile("F:\\qnaProject\\NewStreamOperation\\covid-assignment\\data\\country_wise_latest.csv");
        CSVParser dayWise=csvParser1.getParseFile("F:\\qnaProject\\NewStreamOperation\\covid-assignment\\data\\day_wise.csv");
        int choice=0;
        do {
            System.out.println("________Enter__Choice_______");
            System.out.println("--------------------");
            System.out.println("1. ALl Country Wise data");
            System.out.println("2. All country Percentage wise data");
            System.out.println("3. All death in world wise");
            System.out.println("4. ALl Death after a FEB. ");
            System.out.println("5. Sorted data by Year wise");
            System.out.println("6----queit-----------------");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("County Wise Data");
                    BasicCSVReader basicCSVReader=new BasicCSVReader();
                    basicCSVReader.getAllData(countryWiseFile);
                    break;
                case 2:
                    System.out.println("Percentage Wise Data");
                    CountryPercentage countryPercentage=new CountryPercentage();
                    countryPercentage.countryPercentageCalculator(countryWiseFile);
                    break;
                case 3:
                    System.out.println("All death in Wrold");
                    GetAllCountryDeath getAllCountryDeath=new GetAllCountryDeath();
                    getAllCountryDeath.allDeath(countryWiseFile);
                    break;
                case 4:
                    System.out.println("Death after Feburay");
                    DeathAfterFeb deathAfterFeb=new DeathAfterFeb();
                    deathAfterFeb.getDeathAfterFeb(dayWise);
                    break;
                case 5:
                    System.out.println("Sorted Data");
                    SortRecord sortRecord=new SortRecord();
                    sortRecord.getSortedData(dayWise);
                    break;
                case 6:
                    System.out.println("Queit");
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }while(choice!=6);


    }
}
