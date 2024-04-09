package by.itstep.javalesson.task01.controller;

import by.itstep.javalesson.task01.model.BinaryWorker;
import by.itstep.javalesson.task01.model.CharWorker;

import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
   //     String binaryFileName = "D:\\Timofey\\test.byn";
   //     BinaryWorker.write(binaryFileName);
    //    String text = BinaryWorker.read(binaryFileName);
    //    System.out.println(text);

        String charFileName = "D:\\Timofey\\test.txt";
       // CharWorker.write(charFileName);
        String buf = CharWorker.read(charFileName);
       System.out.println(buf);
    }
}
