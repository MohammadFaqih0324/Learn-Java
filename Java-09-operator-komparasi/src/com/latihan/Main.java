package com.latihan;

public class Main {

    public static void main(String[] args) {

        // operator komparasi...ini akan menghasilkan nilai boolean

        int a,b;
        boolean hasilkomparasi;

        // operator equal atau persamaan
        System.out.println("----PERSAMAAN----");
        a = 10;
        b = 10;
        hasilkomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b, hasilkomparasi);

        a = 12;
        b = 10;
        hasilkomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b, hasilkomparasi);

        // operator not equal atau tidak persamaan
        System.out.println("----PERTIDAKSAMAAN----");
        a = 10;
        b = 10;
        hasilkomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b, hasilkomparasi);

        a = 12;
        b = 10;
        hasilkomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b, hasilkomparasi);

        // operator less than atau kurang dari
        System.out.println("----KURANG DARI----");
        a = 10;
        b = 10;
        hasilkomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b, hasilkomparasi);

        a = 12;
        b = 10;
        hasilkomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b, hasilkomparasi);

        // operator greater than atau lebih dari
        System.out.println("----LEBIH DARI----");
        a = 10;
        b = 10;
        hasilkomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b, hasilkomparasi);

        a = 12;
        b = 10;
        hasilkomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b, hasilkomparasi);

        // operator less than equal atau kurang dari sama dengan
        System.out.println("----KURANG DARI SAMA DENGAN----");
        a = 9;
        b = 10;
        hasilkomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b, hasilkomparasi);

        a = 10;
        b = 10;
        hasilkomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b, hasilkomparasi);


        a = 12;
        b = 10;
        hasilkomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b, hasilkomparasi);

        // operator greater than equal atau lebih dari sama dengan
        System.out.println("----LEBIH DARI SAMA DENGAN---");
        a = 9;
        b = 10;
        hasilkomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b, hasilkomparasi);

        a = 10;
        b = 10;
        hasilkomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b, hasilkomparasi);


        a = 12;
        b = 10;
        hasilkomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b, hasilkomparasi);








    }
}
