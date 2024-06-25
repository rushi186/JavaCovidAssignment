package org.example;

import java.time.LocalDate;

public class CountryCovid {
    private String country;
    private String confirmed;
    private String deaths;
    private String recovered;

    public CountryCovid(String country, String confirmed, String deaths, String recovered) {
        this.country = country;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.recovered = recovered;
    }

    public String getCountry() {
        return country;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public String getDeaths() {
        return deaths;
    }

    public String getRecovered() {
        return recovered;
    }

    @Override
    public String toString() {
        return "CountryCovid{" +
                "country='" + country + '\'' +
                ", confirmed='" + confirmed + '\'' +
                ", deaths='" + deaths + '\'' +
                ", recovered='" + recovered + '\'' +
                '}';
    }
}

