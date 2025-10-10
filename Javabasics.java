import java.util.*;
public class Javabasics {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
   /*  System.out.print("Enter your age:");
    int age = sc.nextInt();
    if(age>=18){
        System.out.println("It can drive and vote");
    }
    else{
        System.out.println("cannot drive and vote");
    }*/

    // Print the largest of two numbers
    /*System.out.print("Enter the first number:");
    int a = sc.nextInt();
    System.out.print("Enter the second number:");
    int b = sc.nextInt();
    System.out.print("The largest number among two is:");
    if(a>b){
        System.out.println(a);
    }else{
        System.out.println(b);
    }*/

    // Print if the no is odd or even 
    /*System.out.print("Enter a number:");
    int a = sc.nextInt();
    if(a % 2 == 0){
        System.out.print("Even number");
    }
    else{
        System.out.print("Odd Number");
    }*/

    // Income tax Calculator
    /*System.out.print("Enter your income:");
    int income = sc.nextInt();
    int tax;
    if(income < 500000){
        tax = 0;
    }
    else if (income >500000 && income < 100000){
        tax = (int) (income * (0.2));
    }
    else{
        tax = (int) (income * (0.3));
    }
    System.out.print("Total tax in rupees:");
    System.out.print(tax);*/

    // Print the largesst of three
    /*  System.out.print("Enter first number:");
    int a = sc.nextInt();
    System.out.print("Enter Second number:");
    int b = sc.nextInt();
    System.out.print("Enter third number:");
    int c = sc.nextInt();
    if(a>b && a>c){
        System.out.print("The largest number is: " + a);
    }
    else if (b>a && b>c){
        System.out.print("The largest number is :" + b);
    }
    else{
        System.out.print("The largest number is :" + c);
    }*/
    /*int marks = sc.nextInt();
    String type = (marks>=33)? "Passs":"Fail";
    System.out.println(type);*/
    //Calculator
    System.out.print("Enter a:");
    int a = sc.nextInt();
    System.out.print("Enter b:");
    int b = sc.nextInt();
    System.out.print("Enter operator :");
    char operator = sc.next().charAt(0);
    switch(operator){
        case '+' : System.out.println(a+b);
        break;
        case '-' : System.out.println(a-b);
        break;
        case '*' : System.out.println(a*b);
        break;
        case '/' : System.out.println(a/b);
        break;
        default : System.out.println("W");
    }
}
}