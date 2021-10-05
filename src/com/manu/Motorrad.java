package com.manu;

import java.util.Scanner;

public class Motorrad extends Fahrzeug{

    Scanner scanner = new Scanner(System.in);

    String SitzStoff = new String();


    public Motorrad(){
        SitzStoff = set_sitzstoff();
    }

    private String set_sitzstoff() {
        String stoff = new String();

        System.out.println("Bitte geben Sie ein, aus welchem Stoff ihr sitz bestehen soll:");
        stoff = scanner.nextLine();

        return stoff;
    }

    public Fahrzeug mot_start() {
        if(driver.equalsIgnoreCase("Motorrad")){
            super.start_vehi("Ja");
            return this;
        }else {
            System.out.println("Dein Motorrad ist kaputt gegangen!");
            return null;
        }
    }

    public void wheele(){
        System.out.println("Whooo das Motorad macht einen wheele");
    }

}
