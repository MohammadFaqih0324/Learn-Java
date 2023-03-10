package com.latihan;

public class ForEach {
    public static void main(String[] args) {

        System.out.println("=====Tanpa For Each=====");
        String[] names = {
                "Mohamad ", "Faqih ", "Egy ",
                "Programmer ", "Zaman ", "Now\n"
        };

        for(var i = 0; i < names.length; i++){
            System.out.print(names[i]);
        }

        System.out.println("=====For Each=====");
        for(var name: names){
            System.out.print(name);
        }
    }
}
