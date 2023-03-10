package com.latihan;

import java.util.Scanner;

public class Main {

    public static  void main(String[] args){

        // kesimpulannya adalah
        // perklaian atau pembagian akan di lakukan terlebih dahulu

        // jika di lakukan perkalian dan pembagian, maka akan di lakukan operasinya dari kiri ke kanan

        int hasil = 5 * 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        // menggunakan pengelompokkan operasi dengan (  )
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        // menghitung persamaan kuadrat
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m,x,c;

        System.out.print("nilai x = ");
        x = userInput.nextInt();
        System.out.print("gradient m = ");
        m = userInput.nextInt();
        System.out.print("nilai c = ");
        c = userInput.nextInt();

        int y = m * x * x + c;

        System.out.print("nilai y = " + y);


    }
}
