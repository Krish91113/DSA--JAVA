// import java.util.*;
// public class functions {
   /*  public static void sumofnumber(int a,int b){
        int sum = a + b;
        System.out.println("sum is " + sum);
        System.out.println("a is :" +a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int num1 = sc.nextInt();
       // int num2 = sc.nextInt();
        int a = 4;
        System.out.println("a is:" +a);
        sumofnumber(2,4);*/
       /*  public static void productofno(int a , int b){
            int product = a * b;
            System.out.println("Product of two number is :" +product);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            productofno(num1, num2);
        }*/ 
        /*public static int factorial (int n){
            int f =1;
            for(int i=1;i<=n;i++){
                f = f*i;
            }
            return f;
        }
        public static int binCoeff (int n,int r){
           int fact_n = factorial(n);
            int fact_r = factorial(r);
           int c = factorial(n - r);
            int d = fact_n/(fact_r* c);
            return d;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value of n");
            int num1 = sc.nextInt();
            System.out.println("Enter value of r");
            int num2 = sc.nextInt();
            System.out.println("the binary coefficient is: "+binCoeff(num1, num2));
        }*/
        // Function overloading
       /* public static float sum(float a,float b){
            return a + b;
        }
        public static int sum(int a ,int b, int c){
            return a + b + c;
        }
        public static void main(String args[]){
            System.out.println(sum(3,4,5 ));
            System.out.println(sum(2,4 ));
        }*/

        // Prime no
        // public static boolean isPrime(int n){
        //     boolean isPrime = true;
        //     for(int i=2;i<=(n-1);i++){
        //         if(n % i == 0){
        //             isPrime = false;
        //             break;
        //         }
        //     }
        //      return isPrime;
        // }
        // public static void main(String[] args) {
        //     System.out.println(isPrime());
        // }
         
        // Binary to decimal

        // public static void binTodec(int n){
        //     int myNum =n;
        //     int pow = 0;
        //     int dec = 0;
        //     while( n > 0){
        //         int lastDigit = n % 10;
        //         dec = dec + (lastDigit *(int) Math.pow(2, pow));
        //         pow++;
        //         n = n/10;
        //     }
        //     System.out.println("decimal of " +myNum + " =" +dec);
        // }
        // public static void main(String[] args) {
        //     binTodec(101);
        // }

        // Decimal to binary
    //     public static void decTobin(int n){
    //         int bin=0;
    //         int pow =0;
    //         int rem = 0;
    //         while(n>0){
    //             rem = n % 2;
    //             bin= bin +( rem * (int) Math.pow(10, pow));
    //             pow++;
//     //             n = n/2;
//     //         }
//     //         System.out.println("Binary no is:" +bin);
//     //     }
//     //     public static void main(String[] args) {
//     //         decTobin(12);
//     //     }
//     // }

//     // COunt prime numbers

//     public class functions{
       
//     public static boolean isLongPressedName(String name, String typed) {
//         // Initialize pointers for name (i) and typed (j)
//         int i = 0, n = name.length(), m = typed.length();

//         // Loop through each character in 'typed'
//         for (int j = 0; j < m; ++j) {
//             // If current chars match, move both pointers
//             if (i < n && name.charAt(i) == typed.charAt(j)) {
//                 ++i;
//             } 
//             // If no match, check if it's a long-pressed repeat
//             else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
//                 return false; // Not a valid long-pressed name
//             }
//         }

//         // Check if we've traversed the entire 'name'
//         return i == n;
//     }
//      public static void main(String[] args) {
//         String name = "alex";
//         String typed = "aaleex";
//         System.out.println(isLongPressedName(name, typed));
//      }  
// }