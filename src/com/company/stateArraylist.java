package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class stateArraylist implements Serializable {
    private List<State> listState = new ArrayList<>();

    public void addStateList(State listState) {
        this.listState.add(listState);
    }

    public void deleteAllCountryPopulationLess(int population) {
        int counterItems = 0;
        int i = 0;
        if (listState.size() != 0)
            while (i < listState.size()) {
                if (listState.get(i).getPopulation() < population) {
                    listState.remove(listState.get(i));
                    counterItems++;
                } else {
                    i++;
                }
            }
        else
            System.out.println("No records");

        if (counterItems != 0)
            System.out.println("Removed " + counterItems + " countries whose number was less than the specified " + population + ".");
        else
            System.out.println("Population greater than given");
    }

    public void searchNameCapital(String capital) {
        if (listState.size() != 0) {
            for (State state : listState)
                if (state.getCapital().equalsIgnoreCase(capital))
                    System.out.println(state);
        } else
            System.out.println("Data not found");
    }

    public void searchByOccupiedSpaceOver(int square) {
        for (int i = 0; i < listState.size(); i++) {
            if (listState.get(i).getSquare() > square) {
                System.out.println(listState.get(i));
                System.out.println("------------------");
            }
        }
    }

    public void sortCountryContinents(String continent, int n) {
        if (n == 1)
            listState.sort(Comparator.comparing(State::getNameCountry));
        else if (n == 2)
            listState.sort(Comparator.comparing(State::getSquare));
        else if (n == 3)
            listState.sort(Comparator.comparing(State::getPopulation));
        for (State state : listState)
            if (state.getContinent().equalsIgnoreCase(continent)) {
                System.out.println(state);
                System.out.println("------------------");
            }
    }

    public void showStatesList() {
        if (listState.size() != 0)
            for (State state : listState) {
                System.out.println(state);
                System.out.println("------------------");
            }
        else
            System.out.println("No records");
    }
}
