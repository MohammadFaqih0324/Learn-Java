package com.latihan;

public class Main {

    public static void main(String[] args) {

//        for (inisialisai; kondisi; step nilai){
//
//            aksi;
//        }

        System.out.println("awal program");

        System.out.println("lopp pertama");
        for (int nilai = 0; nilai <= 10; nilai++){

            System.out.println("for loop ke-" + nilai);
        }

        System.out.println("lopp kedua");
        for (int nilai = 0; nilai < 10; nilai++) {

            System.out.println("for loop ke-" + nilai);
        }

        System.out.println("lopp ketiga");
        for (int nilai = 10; nilai >= 5; nilai--) {

            System.out.println("for loop ke-" + nilai);
        }

        System.out.println("lopp keempat");
        int nilai = 0;
        for (;nilai < 10;){

            System.out.println("for loop ke-" + nilai);
            nilai++;
        }
        System.out.println("akhir program");
    }
}


//        int nilai = 0;
//        for (; true ;){
//
//            System.out.println("for loop ke-" + nilai);
//            nilai++;
//        }


