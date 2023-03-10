package com.latihan;

import java.util.*;

public class UjiCoba {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.println("Ini adalah awal program\n");

        //Menggunakan for loop
        System.out.println("Menggunakan FOR LOOP\n");
        int x ,y ,total1;
        System.out.print("Masukkan nilai awal = ");
        x = inputUser.nextInt();
        System.out.print("Masukkan nilai akhir = ");
        y =  inputUser.nextInt();

        for (total1 = 0; x <= y; x++){
            System.out.println("Ditambah " + x + " Menjadi " + total1);
            total1 = total1 + x;
        }

        System.out.println("\n");

        // menggunakan do while
        System.out.println("Menggunakan DO WHILE\n");
        int a , b, total2;
        System.out.print("Masukkan nilai awal = ");
        a = inputUser.nextInt();
        System.out.print("Masukkan nilai akhir = ");
        b = inputUser.nextInt();

        total2 = 0;
        do{
            total2 = total2 + a;
            System.out.println("Ditambah " + a + " menjadi " + total2);
            a++;
        }while (a <= b);

        System.out.println("\n");

        System.out.println("Ini adalah akhir program");
    }
}
