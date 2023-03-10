package com.latihan;

import java.io.*;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) throws IOException {

        long timeStart, timeFinish;

        // Membaca dari file
        FileInputStream byteInput = new FileInputStream("input.txt");
        System.out.println(byteInput.available());

        // menghitung waktu pembacaan
        timeStart = System.nanoTime();
        System.out.println(byteInput.readAllBytes());
        timeFinish =System.nanoTime();
        System.out.println("time = " + (timeFinish - timeStart));  
        byteInput.close();

        // Membaca dari memory
        FileInputStream byteInput2 = new FileInputStream("input.txt");
        BufferedInputStream bufferInput = new BufferedInputStream(byteInput2);

        bufferInput.mark(200);
        // Menghitung waktu pembacaan
        timeStart =System.nanoTime();
        System.out.println(bufferInput.readAllBytes());
        timeFinish = System.nanoTime();
        System.out.println("time = " + (timeFinish - timeStart));

        // baca ulang
        bufferInput.reset();
        byte[] data = bufferInput.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);
        bufferInput.close();
        byteInput2.close();

        // Menulis dengan buffered output

        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);

        // write data berupa byte
        bufferedOutput.write(data, 0, data.length);
        bufferedOutput.flush();

        bufferedOutput.close();
        byteOutput.close();
    }
}
