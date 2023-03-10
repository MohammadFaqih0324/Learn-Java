package com.latihan;

public class MethodParameter {
    public static void main(String[] args) {

        sayHello("Mohamad","Faqih");
        sayHello("Hapis","Wijayanto");
        sayHello("Kiwil","Krispy");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
