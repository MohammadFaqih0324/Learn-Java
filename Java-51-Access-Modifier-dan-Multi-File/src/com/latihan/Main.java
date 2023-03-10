package com.latihan;

import kelasterbuka.util.MemahamiJava;

public class Main {

    public static void main(String[] args) {

        // public, private, default, dan protected

        // dengan access modifier public, dapat di akses
        Lain.methodPublic();

        // dengan access modifier private, tidak dapat di akses
        // Lain:private();

        // karena ada dalam package yang sama, maka dapat di akses
        Lain.methodDefault();

        // karena ada dalam package yang sama, maka dapat di akses
        Lain.methodProtected();

        MemahamiJava.javaPublic();
    }
}