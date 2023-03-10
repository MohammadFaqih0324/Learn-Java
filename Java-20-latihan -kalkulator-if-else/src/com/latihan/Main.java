package com.latihan;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // a operator b
        Scanner inputUser;
        float a,b,hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("inputUser: " + a + " " + operator + " " + b);

        // Operator tersedia * / + -

        if (operator == '+'){
            // penjumlahan
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-'){
            // pengurangan
            hasil = a - b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*'){
            // perkalian
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        }else if (operator == '/'){
            // pembagian
            if (b == 0){
                System.out.println("Pembagi nol menghasilkan tak terhingga");
            } else{
                hasil = a / b;
                System.out.println("hasil = " + hasil);
            }
        } else{
            System.out.println("Operator tidak di temukan");
        }
    }
}
