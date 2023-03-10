package com.latihan;

public class LatihanLagi {
    public static void main(String[] args) {

        int a = 3;
        int b = 2;
        int c = 6;
        int d = 7;
        int e = 5;

        System.out.println("START");

        if (a == 1) {

            if (b == 2) {

                if (c == 3) {
                    System.out.println("ekspresi 5 true");
                } else {
                    System.out.println("eksprsi 5 false");
                }
            } else {
                System.out.println("eksprsi 2 false");
            }
        }else{
            if (d == 4){
                System.out.println("ekspresi 3 true");
            } else{
                if (e == 6){
                    System.out.println("ekspresi 4 true");
                } else{
                    System.out.println("ekspresi 4 false");
                }
            }
        }
        System.out.println("END");
    }
}
