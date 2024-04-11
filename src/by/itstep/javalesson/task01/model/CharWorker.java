package by.itstep.javalesson.task01.model;

import java.io.*;

public class CharWorker {
    public static void write(String fileName) {


        try (Writer writer = new FileWriter(fileName);
        BufferedWriter stream = new BufferedWriter(writer)) {
            for (int i = 0; i < 130; i++) {
                stream.write(i);
            }

            //       if (stream != null){
            //           stream.flush();
            //
            //       }
        } catch (IOException exception) {
            System.out.println(exception);
        }

    }

    public static String read(String fileName) {
        StringBuilder builder = new StringBuilder();

        try (Reader reader = new FileReader(fileName);
        BufferedReader stream = new BufferedReader(reader)) {

            int number;
            while ((number = stream.read()) != -1){
                builder.append(number).append(" ");
            }


            //       if (stream != null){
            //           stream.flush();
            //
            //       }
        } catch (IOException exception) {
            System.out.println(exception);
        }
        return builder.toString();
    }
}
