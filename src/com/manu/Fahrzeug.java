package com.manu;

import sun.misc.Signal;

import java.sql.SQLOutput;
import java.util.Scanner;

public abstract class Fahrzeug {

    Scanner scanner = new Scanner(System.in);

    String color = new String();
    String driver = new String();
    int speed;
    String fahrzeugtyp = new String();
    String numbersign = new String();

    public Fahrzeug(){
        driver = setDriver();
        numbersign = setNumbersign();
        color = setColor();
    }

    private String setColor() {

        String yono;
        String col = "white";


        System.out.println("Möchten Sie Farbe wechseln?");
        yono = scanner.nextLine();

        if(yono.equalsIgnoreCase("Ja") || yono.equalsIgnoreCase("Nein")){
            if(yono.equalsIgnoreCase("Ja")){
                System.out.println("Bitte geben Sie ihre gewünschte Farbe ein:");
                col = scanner.nextLine();
            }else {
                System.out.println("Ok, ihr Fahrzeug erhält die Standartfarbe: " + col);
            }
            }else{
            System.out.println("Ungültige Eingabe! Ihr Fahrzeug erhält die Standartfarbe! " + col);
        }

        return col;

    }

    private String setNumbersign() {

        String numbers;

        System.out.println("Please enter your Numbersign: ");
        numbers = scanner.nextLine();

        return numbers;
    }


    public String setDriver(){

        System.out.println("Please select your Driver (Auto / Formel1 / Motorrad):\n ");
        driver = scanner.nextLine();

        if(driver.equalsIgnoreCase("Auto")){
            System.out.println("Du hast dich für den Autofahrer entschieden!");
        }else if(driver.equalsIgnoreCase("Formel1")){
            System.out.println("Du hast dich für den Formel1 - Fahrer entscheiden!");
        }else if(driver.equalsIgnoreCase("Motorrad")){
            System.out.println("Du hast dich für den Motorrad - Fahrer entschieden!");
        }

        return driver;
    }

    public Auto star_car(){return null;}

/*    public String create_Fahr() {
        System.out.println("Bitte entscheide dich für ein Fahrzeug (Auto / Formel1 / Motorrad):\n");
        fahrzeugtyp = scanner.nextLine();

        if (fahrzeugtyp.equalsIgnoreCase("Auto")) {
            System.out.println("Du hast dich für das Auto entschieden!");
        } else if (fahrzeugtyp.equalsIgnoreCase("Formel1")) {
            System.out.println("Du hast dich für das Formel1 - Auto entscheiden!");
        } else if (fahrzeugtyp.equalsIgnoreCase("Motorrad")) {
            System.out.println("Du hast dich für das Motorrad entschieden!");
        }

        return fahrzeugtyp;
    }
*/
    public void reifen_move(){
        System.out.println("Car is driving!");
        speed = 1;
    }

    public void Info(){
        System.out.println("------Info------");
        System.out.println(driver);
        System.out.println(numbersign);
        System.out.println(color);
        System.out.println("------Info------");
    }

    public String start_vehi(String working){


        return "Dein Auto fährt";
    }

}