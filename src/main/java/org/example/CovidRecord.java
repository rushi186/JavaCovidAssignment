package org.example;

import java.time.LocalDate;

public class CovidRecord {
    private LocalDate date;
    private String confirmed;
    private String deaths;
    private String recovered;
    private String active;

    public CovidRecord(LocalDate date, String confirmed, String deaths, String recovered, String active) {
        this.date = date;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.recovered = recovered;
        this.active = active;
    }

    public LocalDate getDate() {
        return date;
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

    public String getActive() {
        return active;
    }

    @Override
    public String toString() {
        return "CovidRecord{" +
                "date=" + date +
                ", confirmed='" + confirmed + '\'' +
                ", deaths='" + deaths + '\'' +
                ", recovered='" + recovered + '\'' +
                ", active='" + active + '\'' +
                '}';
    }
}