package com.latihan;

public class LatihanNested {

    public static void main(String[] args) {

        int a = 5;
        int b = 8;
        int c = 10;

        System.out.println("start");

        //ekpresi 1
        if (a == 4) {
            System.out.println("ekspresi 1 true");
        } else {
            if (b == 7) {
                System.out.println("ekspresi 2 true");
            } else {
                if (c == 9) {
                    System.out.println("ekspresi 3 true");
                } else {
                    System.out.println("ekspresi 3 false");
                }
                System.out.println("finish");
            }
        }
    }
}
