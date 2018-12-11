package com.company;

import java.io.Serializable;

public class Main implements Serializable {
    public static void main(String[] args) {
        State state1 = new State("Ukraine", "KIEV", "Europe", 300000, 32000);
        State state2 = new State("Russia", "Moscow", "EUROPE", 327000, 171000);
        State state3 = new State("France", "Parish", "Europe", 2700000, 22000);
        State state4 = new State("Germany", "Berlin", "EUROPE", 327000000, 1710000);
        State state5 = new State("Canada", "Ottawa", "North America", 247000000, 3232000);
        State state6 = new State("Australia", "Канберра", "Австралия", 237000000, 332000);
        State state7 = new State("Japan", "Токио", "Asia", 297000000, 932000);

//        System.out.println(state1.show());

//        stateArraylist myState = new stateArraylist();
//
//        myState.addStateList(state1);
//        myState.addStateList(state2);
//        myState.addStateList(state3);
//        myState.addStateList(state4);
//        myState.addStateList(state5);
//        myState.addStateList(state6);
//        myState.addStateList(state7);
//
//        myState.sortCountryContinents("Europe", 1);
//        myState.searchByOccupiedSpaceOver(330000);
//        myState.showStatesList();
//        myState.deleteAllCountryPopulationLess(30000000);

        saveDataFileBin file = new saveDataFileBin();
        file.saveData(state3);
        file.readData();
        file.recovery();
    }
}
