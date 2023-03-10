package com.latihan;

public class Main {



    public static void main(String[] args) {

        // void itu artinya hampa

        System.out.println(simpel());

        fungsiVoid("apa pun");

    }
    // fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input) {
        System.out.println(input);
    }
    // fungsi atau method dengan kembalian
    // sehingga menggunakan reutrn untuk
    // mengembalikan nilainya (10.0f)
    private static float simpel(){
        return 10.0f;
    }
}
