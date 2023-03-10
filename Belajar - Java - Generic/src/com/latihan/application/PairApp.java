package com.latihan.application;

import com.latihan.Pair;

public class PairApp {

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<String, Integer>("faqih",100);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
