package com.company.lampa;

public class Lampa {
        boolean czySwieci;

        public void wlacz(){
            czySwieci = true;
        }

        public void wylacz(){
            czySwieci = false;
        }

        public void wypisz(){
            if(czySwieci){
                System.out.println("Swieci");
            }
            else {
                System.out.println("Nie swieci");
            }
        }


    }
