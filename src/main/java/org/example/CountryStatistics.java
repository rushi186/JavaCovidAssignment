package org.example;

public class CountryStatistics {
    private String countryName;
    private int totalConfirmedCases;
    private String deathsPercentage;
    private String recoveredPercentage;
    private String activePercentage;

    public CountryStatistics(String countryName, int totalConfirmedCases, String deathsPercentage, String recoveredPercentage, String activePercentage) {
        this.countryName = countryName;
        this.totalConfirmedCases = totalConfirmedCases;
        this.deathsPercentage = deathsPercentage;
        this.recoveredPercentage = recoveredPercentage;
        this.activePercentage = activePercentage;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getTotalConfirmedCases() {
        return totalConfirmedCases;
    }

    public String getDeathsPercentage() {
        return deathsPercentage;
    }

    public String getRecoveredPercentage() {
        return recoveredPercentage;
    }

    public String getActivePercentage() {
        return activePercentage;
    }

    @Override
    public String toString() {
        return "CountryStatistics{" +
                "countryName='" + countryName + '\'' +
                ", totalConfirmedCases=" + totalConfirmedCases +
                ", deathsPercentage='" + deathsPercentage + '\'' +
                ", recoveredPercentage='" + recoveredPercentage + '\'' +
                ", activePercentage='" + activePercentage + '\'' +
                '}';
    }
}
