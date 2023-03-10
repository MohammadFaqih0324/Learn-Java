package com.latihan;

public class TernaryOperator {
    public static void main(String[] args) {

        // Tanpa Ternary Operator
//        var nilai = 80;
//        String ucapan;
//
//        if(nilai >= 75){
//            ucapan = "Selamat Anda Lulus";
//        } else{
//            ucapan = "Silahkan Coba Lagi";
//        }

//        System.out.println(ucapan);

        // Dengan Ternary Operator
        var nilai = 80;
        String ucapan = nilai >= 85 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";

        System.out.println(ucapan);

    }
}
