package com.example.kotlin_test;

import java.time.LocalDate;

public class JavaGetterSetterExample {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "스티버로저스";

//        student.setName("스티브로저스");
        student.setBirthDate(LocalDate.of(1918, 7, 4));

//        System.out.println("student.getName() = " + student.getName());
        System.out.println("student.getName() = " + student.name );
        System.out.println("student.getBirthDate() = " + student.getBirthDate());
        System.out.println("student.getAge() = " + student.getAge());
    }
}
