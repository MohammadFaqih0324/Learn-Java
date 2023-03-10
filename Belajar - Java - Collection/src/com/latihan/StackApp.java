package com.latihan;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Faqih");
        stack.push("Egy");
        stack.push("Hapis");

        for(var value= stack.pop(); value != null; value = stack.pop()){
            System.out.println(value);
        }
    }
}
