 import java.util.*;
 public class pq {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // factorial of number
//         /*System.out.println("Enter number:");
//         int n = sc.nextInt();
//         int factorial = 1;
//         for(int i=1;i<=n;i++){
//             factorial = factorial * i;
//         }
//         System.out.println("The factorial of number is :" + factorial);*/
//         // Multiplication
//        /* System.out.println("Enter number :");
//         int n = sc.nextInt();
        
//         for(int i=10;i>=1;i--){
//             System.out.println(n + " * " + i  + " = " + (n*i));
//         }*/
//         // count no in a digit
//       /*   System.out.print("Enter numbers:");
//         int n = sc.nextInt();
//         int count = 0;
//         while(n>0){
//             n = n/10;
//             count ++;
//         }
//         System.out.println(count);*/
//         for(int line = 1; line<=4;line++){
//             //one line
//             for(int star =1 ;star<=line;star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//----------Palindrome in java------------\\

// public class pq {
//     public static boolean isPalindrome(int x) {
//         int palindrome = 0;
//         int c = x;
//         boolean isPalindrome = false;
//         while(x>0){
//             int lastDigit = x % 10;
//             palindrome = (palindrome * 10) + lastDigit;
//             x = x/10;
//         }
//         if(palindrome == c){
//             isPalindrome = true;
//         }
//         return isPalindrome;
//     }
//     public static void main (String args[]){
//         System.out.println(isPalindrome(121));
//     }
// }

//---------------Reverse an array----------\\
// public static void reverse(int num[]){
//     int first = 0;
//     int last = num.length - 1 ;
//     while(first < last){
//         int temp = num[last];
//         num[last] = num[first];
//         num[first] = temp;
//         first ++;
//         last -- ;
//     }
// }
// public static void main (String args[]){
//     int num[] = {2,4,6,8,10};
//     reverse(num);
//     for(int i = 0;i<num.length;i++){
//         System.out.print(num[i]+" ");
//     }
// }

// Pair an array
// public static void pair(int num[]){
//     for(int i =0;i<num.length;i++){
//         int curr = num[i];
//         for(int j =i+1;j<num.length;j++){
//             System.out.print("(" + curr + "," + num[j] + ")");
//         }
//         System.out.println();
//     }
// }
// public static void main(String[] args) {
//     int num [] = {2,4,6,8,10};
//     pair(num);
// }

//Maxium subarray
// public static void maxsumSubarray(int arr[]){
//     int maxSum = Integer.MIN_VALUE;
//     int currSum = 0;
//     for(int i = 0 ;i<arr.length;i++){
//         int start = i;
//         for(int j = i;j<arr.length;j++){
//             int end = j;
//             currSum = 0;
//             for(int k = start ; k<=end;k++){
//                 currSum = currSum + arr[k];
//             }
//             if(maxSum < currSum){
//                 maxSum = currSum;
//             }
//         }
//     }
//     System.out.println("max sum of subarray is:" +maxSum);
// }
// public static void main(String[] args) {
//     int arr[] = {2,4,6,8,10};
//     maxsumSubarray(arr);
// }
}