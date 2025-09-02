package oops;

public class student {

    String name ;
    String Gender ;
    int age;
    String adress;
    int roll_no;

    public void student_info(){
        System.out.println("Student Name: " + name);
        System.out.println("Gender: " + Gender);
        System.out.println("Age: " + age);
        System.out.println("Address: " + adress);
        System.out.println("Roll No: " + roll_no);
    }
    static {
        System.out.println("Student class loaded.");
    }
}

