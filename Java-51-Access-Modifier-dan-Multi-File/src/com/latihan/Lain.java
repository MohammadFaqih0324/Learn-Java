package com.latihan;

public class Lain {

    // bagian ini dapat di akses oleh siapapun
    public static void methodPublic() {
        System.out.println("Lain:public");
        Lain.methodPrivate();
    }

    // ini hanya di akses oleh class yang bersangkutan
    private static void methodPrivate() {
        System.out.println("Lain:private");
    }

    // ini hnaya dapat di akses oleh class dan package yang sama
    static void methodDefault() {
        System.out.println("Lain:default");
    }

    // ini hanya dapat di akses oleh class dalam package yang sama
    // dan subclassnya
    protected static void methodProtected() {
        System.out.println("Lain:protected");
    }
}

