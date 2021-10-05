package com.manu;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Auto extends Fahrzeug{

    Scanner scanner = new Scanner(System.in);

    String scheibenstatus = "Oben";

    public void scheiben_state(){
        scheibenstatus = scheiben_move();
    }

    public String scheiben_move(){

        String updown;

        System.out.println("Wie wollen Sie die Scheiben verstellen? (Unten / Oben)");
        updown = scanner.nextLine();

        while(!updown.equalsIgnoreCase("Unten") || !updown.equalsIgnoreCase("Oben")){
            System.out.println("Illegaler zustand! Neue eingabe:");
            updown = scanner.nextLine();
        }

        return updown;

    }

    public String possible_crash(){return null;}

    public String car_speeding(){return null;}

    public Fahrzeug car_start() {
        if(driver.equalsIgnoreCase("Auto")){
            super.start_vehi("Ja");

            Random rand = new Random();

            if((rand.nextInt() % 2) == 0){
                System.out.println("Du wurdest geblitzt. Jetzt bist du am Arsch");
            }else{
                System.out.println("Du wurdest nicht geblitzt!");
            }

            return this;
        }else {
            System.out.println("Dein Auto ist kaputt gegangen!");
            return null;
        }
    }
}
