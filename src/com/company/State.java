package com.company;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class State implements Serializable {
    private String nameCountry;
    private String capital;
    private String continent;
    private int population;
    private int square;

    public State(String nameCountry, String capital, String continent, int population, int square) {
        this.setNameCountry(nameCountry);
        this.setCapital(capital);
        this.setContinent(continent);
        this.setPopulation(population);
        this.setSquare(square);
    }

    public void setNameCountry(String nameCountry) {
        Pattern exampleCountry = Pattern.compile("^([А-Яа-я]+)|([A-Za-z]+)$");
        Matcher isExampleCountry = exampleCountry.matcher(nameCountry);
        if (isExampleCountry.matches())
            this.nameCountry = nameCountry;
        else
            System.out.println("ERROR");
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setCapital(String capital) {
        Pattern exampleCapital = Pattern.compile("^([А-Яа-я]+)|([A-Za-z]+)$");
        Matcher isExampleCapital = exampleCapital.matcher(capital);
        if (isExampleCapital.matches())
            this.capital = capital;
        else
            System.out.println("ERROR");
    }

    public String getCapital() {
        return capital;
    }

    public void setContinent(String continent) {
        this.continent = continent;
        for(Continent i: Continent.values()){
            if(continent.equalsIgnoreCase(i.toString()))
                this.continent = i.toString();
        }
    }

    public String getContinent() { return continent; }


    public void setPopulation(int population) {
        if (population >= 0)
            this.population = population;
        else
            System.out.println("You entered a negative number");
    }

    public int getPopulation() {
        return population;
    }

    public void setSquare(int square) {
        if (square >= 0)
            this.square = square;
        else
            System.out.println("You entered a negative number");
    }

    public int getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "Country: " + nameCountry + "\n" +
                "Capital: " + capital + "\n" +
                "Continent: " + continent + "\n" +
                "Population: " + population + "\n" +
                "Square: " + square;
    }
}
