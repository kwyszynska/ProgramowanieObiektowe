package com.company.lampa;

public class Main {

    public static void main(String[] args) {
        Lampa l1 = new Lampa();
        l1.wlacz();
        l1.wypisz();

        Lampa l2 = new Lampa();
        l2.wlacz();
        l2.wypisz();
        l2.wylacz();
        l2.wypisz();
    }
}
