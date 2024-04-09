package by.itstep.javalesson.task01.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharWorker {
    public static void write(String fileName) {


        try(Writer stream = new FileWriter(fileName)) {
            for (int i = 0; i < 128; i++) {
                stream.write(i);
            }

     //       if (stream != null){
     //           stream.flush();
     //           stream.close();
     //       }
            stream.close();
        } catch (IOException exception){
            System.out.println(exception);
        }

    }
}
