package com.latihan;

public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Mohamad";
        stringArray[1] = "Faqih";
        stringArray[2] = "Egy";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] namaNama = {
                "Mohamad", "Faqih", "Egy"
        };

        namaNama[0] = null;

        int[] arrayInt = {
                1,2,3,4,5,6,7,8,9,10
        };

        Long[] arrayLong = {
            10L, 20L, 30L, 40L
        };

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Mohamad","Faqih"},
                {"Egy","Hapis"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][1]);
    }
}
