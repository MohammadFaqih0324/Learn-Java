package com.latihan;

public class MethodVariableArgument {
    public static void main(String[] args) {

        // Method Variable Tanpa Argument
        int[] values = {80, 50, 50 ,50};
        sayCongrats("Faqih", values);

        // Method Variable Menggunakan Argument
        sayCongrats("Egy", 80,70,95);
    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for(var value: values){
            total += value;
        }
        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
