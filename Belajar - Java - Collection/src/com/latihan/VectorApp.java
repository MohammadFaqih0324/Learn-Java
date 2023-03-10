package com.latihan;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> list = new Vector<>();

        list.add("Faqih");
        list.add("Egy");
        list.add("Hapis");

        for(var value : list){
            System.out.println(value);
        }
    }
}
