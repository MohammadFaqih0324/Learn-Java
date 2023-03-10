package com.latihan;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Panggil nama: ");
        input = inputUser.next();

        // Ekspresinya berupa satuan (int,long,byte,short), String, atau enum
        switch(input){
            case"jono":
                System.out.println("Saya jono dan hadir Boss!!!");
                break;
            case"joni":
                System.out.println("Saya joni dan hadir Boss!!!");
                break;
            case"juno":
                System.out.println("Saya juno dan hadir Boss!!!");
                break;
            default:
                System.out.println(input + " Tidak Hadir Boss!!!");
        }
        System.out.println("Selesai program");
    }
}
