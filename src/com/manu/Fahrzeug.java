package com.manu;

import sun.misc.Signal;

import java.util.Scanner;

public abstract class Fahrzeug {

    Scanner scanner = new Scanner(System.in);

    String color = new String();
    String driver = new String();
    int speed;
    String fahrzeugtyp = new String();
    String numbersign = new String();

    public Fahrzeug(){
        setDriver();

    }

    public void setDriver(){

        System.out.println("Please select your Driver:\n ");
        driver = scanner.nextLine();

        if(driver.equalsIgnoreCase("Auto")){
            System.out.println("Du hast dich für den Autofahrer entschieden!");
        }else if(driver.equalsIgnoreCase("Formel1")){
            System.out.println("Du hast dich für den Formel1 - Fahrer entscheiden!");
        }else if(driver.equalsIgnoreCase("Motorrad")){
            System.out.println("Du hast dich für den Motorrad - Fahrer entschieden!");
        }
    }

    public void create_Fahr(){
        System.out.println("Bitte entscheide dich für ein Fahrzeug:\n");
        fahrzeugtyp = scanner.nextLine();
    }

    public void reifen_move(){
        System.out.println("Car is driving!");
        speed = 1;
    }

    public String start_car(){return null;}

    public Auto create_Auto(){return null;}

    public Motorrad create_Motorrad(){return null;}

    public Formel1 create_Formel1(){return null;}
}