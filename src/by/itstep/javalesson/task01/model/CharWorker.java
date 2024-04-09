package by.itstep.javalesson.task01.model;

import java.io.*;

public class CharWorker {
    public static void write(String fileName) {


        try (Writer stream = new FileWriter(fileName)) {
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

        try (Reader stream = new FileReader(fileName)) {

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
