package by.itstep.javalesson.task01.model.logic;

import by.itstep.javalesson.task01.model.entity.Student;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class StudentXMLSerializer {
    public static void serialize(String fileName, Student student) {
        try(XMLEncoder stream = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(fileName)))) {

            stream.writeObject(student);
            stream.flush();

        } catch (IOException exception){
            System.out.println(exception);
        }
    }

    public static Student deserialize(String fileName) {
        Student st = null;
        try(XMLDecoder stream = new XMLDecoder(
                new BufferedInputStream(
                        new FileInputStream(fileName)))) {

            st = (Student) stream.readObject();


        } catch (IOException exception){
            System.out.println(exception);
        }
        return st;
    }
}
