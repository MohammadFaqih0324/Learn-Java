package com.latihan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // membuat sebuah object untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        // sebuah program sederhana untuk menebak sebuah angka
        int nilaibenar = 10;
        int nilaitebakan;
        boolean statustebakan;

        System.out.print("masukan nilai tebakan anda: ");
        nilaitebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah: " + nilaitebakan);

        // operasi logika
        statustebakan = (nilaitebakan == nilaibenar);
        System.out.println("tebakan anda: " + statustebakan);

        // operasi aljabar boolean (and / or)

        System.out.print("masukan nilai di antara 4 dan 9: ");
        nilaitebakan = inputUser.nextInt();

        statustebakan = (nilaitebakan > 4) && (nilaitebakan < 9);

        /*
           a | b | c
           0   0   0
           0   1   0
           1   0   0
           1   1   1

        */

        System.out.println("tebakan anda : " + statustebakan);





    }

}
