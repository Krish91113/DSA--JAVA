package oops;

import java.util.Scanner;

public class StudentClient {
    public static void main(String[] args) {
        student s = new student();
        s.age=20;
        s.name="Ankit";
        s.Intro_yourSelf();

        student s1 = new student();
        s1.age=22;
        s1.name="Pilkit";
        s1.Intro_yourSelf();

    }
}
