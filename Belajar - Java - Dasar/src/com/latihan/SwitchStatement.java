package com.latihan;

public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "D";

//        switch (nilai){
//            case "A" :
//                System.out.println("Wow, Anda Lulus Dengan Baik");
//                break;
//            case "B" :
//            case "C" :
//                System.out.println("Nilai Anda Cukup Baik");
//                break;
//            case "D" :
//                System.out.println("Anda Tidak Lulus");
//                break;
//            default:
//                System.out.println("Mungkin Anda Salah Jurusan");
//        }

        // Switch dengan Java Lambda JDK.14
//        switch (nilai){
//            case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
//            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
//            case "D" -> System.out.println("Anda Tidak Lulus");
//            default -> {
//                System.out.println("Mungkin Anda Salah Jurusan");
//            }
//        }


        // Switch dengan "yield" JDK.14
        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Mungkin Anda Salah Jurusan";
            }
        }

        System.out.println(ucapan);
    }
}
