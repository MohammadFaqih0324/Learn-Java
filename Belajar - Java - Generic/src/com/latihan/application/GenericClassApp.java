package com.latihan.application;

import com.latihan.MyData;

public class GenericClassApp {

    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("Faqih");
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
