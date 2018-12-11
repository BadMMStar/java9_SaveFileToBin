package com.company;

import java.io.*;

public class saveDataFileBin {
    public void saveData(Object obj) {

        try (ObjectOutputStream oosMain = new ObjectOutputStream(new FileOutputStream("states.bin"));
             ObjectOutputStream oosReserve = new ObjectOutputStream(new FileOutputStream("statesReserve.bin")))
        {
            // write to main file
            oosMain.writeObject(obj);

            // write to reserve file
            oosReserve.writeObject(obj);

        } catch (IOException e) {
            System.out.println("Error records data");
        }
    }

    public void readData() {
        try (ObjectInputStream oisMain = new ObjectInputStream(new FileInputStream("states.bin"));
             ObjectInputStream oisReserve = new ObjectInputStream(new FileInputStream("statesReserve.bin"))) {

            State stateMain = (State) oisMain.readObject();
            State stateReserve = (State) oisReserve.readObject();


            System.out.println("Data of main file: \n --------------\n" + stateMain);
            System.out.println("\nData of reserve file: \n --------------\n" + stateReserve);

        } catch (IOException e) {
            System.out.println("Error records data");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }

    public void recovery() {
        try (ObjectOutputStream oosMain = new ObjectOutputStream(new FileOutputStream("states.bin"));
             ObjectInputStream oisReserve = new ObjectInputStream(new FileInputStream("statesReserve.bin")))
        {
            State stateReserve = (State) oisReserve.readObject();
            oosMain.writeObject(stateReserve);

        } catch (IOException e) {
            System.out.println("Error records data");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}

