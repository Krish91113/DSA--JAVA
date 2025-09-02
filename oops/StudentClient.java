package oops;

import java.util.Scanner;

public class StudentClient {
    public static void main(String[] args) {
        student s = new student();
        s.Gender = "Male";
        s.name = "John";
        s.age = 20;
        s.adress = "123 Main St";
        s.roll_no = 101;
        s.student_info();

    }
}
