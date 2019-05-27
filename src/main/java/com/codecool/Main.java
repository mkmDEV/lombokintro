package com.codecool;

import com.codecool.model.Student;
import com.codecool.model.Teacher;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("John",
                "john@codecool.com",
                LocalDate.of(1987,2,12));

        printStudent(student);

        Student builtStudent = Student.builder()
                .email("new@codecool.com")
                .birthDate(LocalDate.of(1990, 3, 19))
                .build();

        printStudent(builtStudent);

        Teacher peter = Teacher.builder()
                .name("Peter")
                .student(student)
                .student(builtStudent)
                .build();

        System.out.println(peter);

    }

    private static void printStudent(Student student) {
        System.err.println("==========");
        System.out.println(student.getBirthDate());
        System.out.println(student);
        System.err.println("==========");
    }
}