package com.latihan;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // Membuka file

        // byte stream -> FileInputStream
        // character stream -> FileReader

        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader      charFileInput = new FileReader("input.txt");

        FileOutputStream byteFIleOutput = new FileOutputStream("outputByte.txt");
        FileWriter       charFIleOutput = new FileWriter("outputChar.txt");

        // Membaca file

        // byte file
        int buffer = byteFileInput.read();

        while(buffer != -1){
            System.out.print((char)buffer);
            byteFIleOutput.write(buffer);
            buffer = byteFileInput.read();
        }

        System.out.println("\n");
        // char file
        buffer = charFileInput.read();

        while(buffer != -1) {
            System.out.print((char) buffer);
            charFIleOutput.write(buffer);
            buffer = charFileInput.read();
        }

        // menutup file

        byteFileInput.close();
        charFileInput.close();
        byteFIleOutput.close();
        charFIleOutput.close();
    }
}
