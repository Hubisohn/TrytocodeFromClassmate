package com.manu;

public class Main {

    public static void main(String[] args) {

        Auto am1 = new Auto();
        am1 = (Auto) am1.car_start();

        if(am1 == null) {
            System.out.println("Dieses Fahrzeug ist kaputt!");
        }else {
            am1.Info();
        }

        System.out.println(am1.scheibenstatus);

        Motorrad mm1 = new Motorrad();
        System.out.println(mm1.SitzStoff);

        mm1 = (Motorrad) mm1.mot_start();

        if(mm1 == null){
            System.out.println("Dieses Fahrzeug ist kaputt!");
        }else{
            mm1.Info();
            mm1.wheele();
        }


        Formel1 fm1 = new Formel1();

        fm1.formel1_start();
        fm1.formel1_start();
        fm1.formel1_start();

        if(fm1 == null){
            System.out.println("Der Formel1 wagen ist kaputt gegangen!");
        }else{
            fm1.Info();
        }


    }
}
