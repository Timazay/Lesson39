package by.itstep.javalesson.task01.controller;

import by.itstep.javalesson.task01.model.BinaryWorker;
import by.itstep.javalesson.task01.model.CharWorker;
import by.itstep.javalesson.task01.model.entity.Student;
import by.itstep.javalesson.task01.model.logic.StudentBinaryWorker;
import by.itstep.javalesson.task01.model.logic.StudentWorker;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alex", 20, 9, true),
                new Student("Mike", 18, 8, true),
                new Student("Tim", 16, 10, true)
        };

        String fileName = "D:/Timofey/example.bin";

        StudentBinaryWorker.write(fileName, students);

        List<Student> list = StudentBinaryWorker.read(fileName);

        System.out.println(list);

////////////////

        String fileName1 = "D:/Timofey/student.txt";

        StudentWorker.write(fileName1, students);


        List<Student> list1 = StudentWorker.read(fileName1);
        for (Student student : list1) {
            System.out.println(student);
        }

        //     String binaryFileName = "D:\\Timofey\\test.byn";
        //     BinaryWorker.write(binaryFileName);
        //    String text = BinaryWorker.read(binaryFileName);
        //    System.out.println(text);

        //     String charFileName = "D:\\Timofey\\test.txt";
        //     CharWorker.write(charFileName);
        //     String buf = CharWorker.read(charFileName);
        //    System.out.println(buf);
    }

}

