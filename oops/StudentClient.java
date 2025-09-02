package oops;

import java.util.Scanner;

public class StudentClient {
    public static void main(String[] args) {
        student keshav = new student();
        keshav.name = "Keshav";
        keshav.Gender = "Male";
        keshav.age = 21;
        keshav.adress = "123 Street, City";
        keshav.roll_no = 101;
        keshav.student_info();
        System.out.println();
        student ramesh = new student();
        ramesh.name = "Ramesh";
        ramesh.Gender = "Male";
        ramesh.age = 22;
        ramesh.adress = "456 Avenue, City";
        ramesh.roll_no = 102;
        ramesh.student_info();

    }
}
