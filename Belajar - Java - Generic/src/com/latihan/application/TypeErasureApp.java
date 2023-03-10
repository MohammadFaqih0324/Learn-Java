package com.latihan.application;

import com.latihan.MyData;

public class TypeErasureApp {

    public static void main(String[] args) {

        MyData myData = new MyData("Faqih");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();

    }
}