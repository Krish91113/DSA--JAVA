import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int counter = 1;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter ++;
        }*/

        // Print no from 1 to n
       /*  System.out.print("Enter number:");
        int n = sc.nextInt();
        int counter = 1;
        while (counter <= n){
            System.out.print(counter + " ");
            counter ++;
        }
        System.out.println();*/
        // printf sum of first n natural number
        /*int n = sc.nextInt();
        int sum = 0;
        int i =1;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("sum is :" +sum);*/

       /* for(int i=1;i<=10;i++){
            System.out.println("hello world");
        }*/ 
        
        /*for(int i=1;i<=4;i++){
            System.out.println("****");*/ 
            
            // Reverse of a number
            /*int n = sc.nextInt();
            int lastdigit;
            while(n>0){
                lastdigit = n % 10;
                System.out.print(lastdigit + " ");
                n = n/10;
            }
            System.out.println();*/
           /*int n = 10899;
            int rev = 0;
            while(n>0){
                int lastDigit = n % 10;
                rev = (rev * 10) + lastDigit;
                n = n / 10;
            }
            System.out.println(rev); */ 
            do{
                int n = sc.nextInt();
                if(n % 10 == 0){
                    continue;
                }
                System.out.println(n);
            }while(true); 
            
            
        }
    }

