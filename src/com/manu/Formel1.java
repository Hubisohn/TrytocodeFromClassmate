package com.manu;

public class Formel1 extends Fahrzeug{

    int reifennutzung;

    public Formel1(){
        reifennutzung = 3;
    }

    public Fahrzeug formel1_start() {
        if(driver.equalsIgnoreCase("Formel1")){
            super.start_vehi("Ja");
            reifennutzung -= 1;
            if(reifennutzung == 0){
                System.out.println("Dein Auto ist kaputt gegangen! (Reifenstatus bei " + reifennutzung + ")");
                return null;
            }
            return this;
        }else {
            System.out.println("Dein Auto ist kaputt gegangen!");
            return null;
        }
    }

}
