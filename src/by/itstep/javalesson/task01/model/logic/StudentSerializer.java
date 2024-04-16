package by.itstep.javalesson.task01.model.logic;

import by.itstep.javalesson.task01.model.entity.Student;

import java.io.*;

public class StudentSerializer {
    public static void serialize(String fileName, Student student) {
        try(ObjectOutputStream stream = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(fileName)))) {

            stream.writeObject(student);
            stream.flush();

        } catch (IOException exception){
            System.out.println(exception);
        }
    }

    public static Student deserialize(String fileName) {
        Student st = null;
        try(ObjectInputStream stream = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(fileName)))) {

          st = (Student) stream.readObject();


        } catch (ClassNotFoundException | IOException exception){
            System.out.println(exception);
        }
        return st;
    }
}
