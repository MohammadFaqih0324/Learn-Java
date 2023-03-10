package com.latihan.application;

import com.latihan.util.ArrayHelper;

public class ArrayHelperApp {

    public static void main(String[] args) {

        String[] names = {"Mohamad", "Faqih", "Rahakbauw"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println(
                ArrayHelper.<String>count(names)
        );

        System.out.println(
                ArrayHelper.count(numbers)
        );
    }
}
