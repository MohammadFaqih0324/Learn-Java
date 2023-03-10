package com.latihan.application;

import com.latihan.MyData;

public class WildcardApp {

    public static void main(String[] args) {

        print(new MyData<Integer>(100));
        print(new MyData<String>("Faqih"));
        print(new MyData<MultipleConstraintApp>(new MultipleConstraintApp()));
    }

    public static void print(MyData<?> myData){
        System.out.println(myData.getData());
    }
}