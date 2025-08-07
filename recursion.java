// // public class recursion {
// //     public static int fact(int n){
// //         if(n == 0){
// //             return 1;
// //         }
// //         int fn = fact(n-1);
// //         return n * fn ;
// //     }
// //     public static void main(String[] args) {
// //         int n= 5;
// //         System.out.println(fact(n));
// //     }
// // }

// public class recursion{
//     public static int pow(int x , int n){
//         if(n == 0){
//             return 1;
//         }
//         int ans = pow(x, n-1);
//         return ans * x;
//     }
//     public static void main(String[] args) {
//         int x = 2;
//         int n = 4;
//         System.out.println(pow(x, n));
//     }
// }

// // public class recursion{
// //     public static int guessNumber(int n) {
// //         int pick = 1;
// //         int start = 1;
// //         int end = n;
// //         while(start <= end){
// //             int mid =  (start + end)/2;
// //             if(mid == pick){
// //                 return mid ;
// //             }else if (mid < pick){
// //                 start = mid + 1;
// //             }else{
// //                 end = mid - 1;
// //             }
// //         }
// //         return -1;
// //     }
// //     public static void main(String[] args) {
// //         int n = 1;
// //         System.out.println(guessNumber(n));
// //     }

// // public class recursion{
// //     public static int findFirstOccurence(int arr[] ,int i, int item ){
// //         if(i < 0){
// //             return -1;
// //         }
// //         if(arr[i] == item){
// //             return i;
// //         }
        
// //         return findFirstOccurence(arr, i-1, item);
// //     }
// //     public static void main(String[] args) {
// //         int arr [] ={2,3,5,3,7,11,3,11,8};
// //         int item = 9;
// //         int i = arr.length - 1;
// //         System.out.println(findFirstOccurence(arr, i, item));
// //     }
// // }

// // public class recursion {
//     public static int fibonacii(int n){
//         if(n==0  || n==1){
//             return n;
//         }
//         int f1 = fibonacii(n - 1);
//         int f2 = fibonacii(n-2);
//         return f1 + f2;
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fibonacii(n));

//     }
// // }

// // public class recursion {
// //     static int count = 0;
// //     public static int PrintSubsequence(String ques, String ans){
// //         if(ques.length() == 0){
// //             System.out.print(ans + " ");
// //             return 1;
// //         }
// //         char ch = ques.charAt(0);
// //         int a1= PrintSubsequence(ques.substring(1), ans);
// //         int b1 = PrintSubsequence(ques.substring(1), ans + ch);
// //         return a1+b1;
// //     }
// //     public static void main(String[] args) {
// //         String ques= "abc";
// //         String ans = "";
// //         System.out.println("\n" +PrintSubsequence(ques, ans));
        
// //     }
// // }

// // public class recursion {
// //     public static void Printanswer(int n, String ans){
// //         if(n==0){
// //             System.out.print(ans + " ");
// //             return;
// //         }
// //         if(ans.length() ==0 || ans.charAt(ans.length()-1 )!= 'H'){
// //             Printanswer(n-1, ans+ "H");
// //         }
        
// //         Printanswer(n-1, ans+"T");
// //     }

// //     public static void main(String[] args) {
// //         int n = 3;
// //         Printanswer(n, "");
        
// //     }
// // }

// // public class recursion {
// //     public static int longsetSubarray(int arr[], int k){
// //         int maxlength = Integer.MAX_VALUE;
// //         int index =-1;
// //         for(int i=0; i<arr.length;i++){
// //             int sum = 0;
// //             for(int j=i;j<arr.length;j++){
// //                 sum+= arr[j];
// //                 if(sum == k){
// //                     index = Math.min(maxlength, j-i+1);
// //                     maxlength = index;
// //                 }
// //             }
// //         }
// //         return index;
// //     }

// //     public static void main(String[] args) {

// //         int arr[] = {48,99,37,4,-31};
// //         int k = 140;
// //         System.out.println(longsetSubarray(arr, k));
// //     }
// // }

// public class recursion {
//     public static void PrintString(String ques, String ans , String a2){
//         String a3 = "";
//         if(ques.length() == 0){
//             a3 = ans;
//             System.out.print(a3 + " ");
//             return;
//         }
//         for(int i=0;i<ques.length();i++){
//             char ch = ques.charAt(i);
//             String s1 = ques.substring(0, i);
//             String s2 = ques.substring(i+1);
//             PrintString(s1+s2, ans+ch , "");
//         }
//         checkInculsion(ques, a3, a2);
//     }
//     public static boolean checkInculsion(String ques , String a3, String a2){
//        if(a3.equals(a2)){
//         return true;
//        }
//        return false;
//     }
//     public static void main(String[] args) {
//         String ques = "eidbaooo";
//         String a2 = "ab";
//         // PrintString(ques, "" , a2);
//         checkInculsion(ques, a2, "");
//     }
// }

// public class recursion {
//     public static void PrintPath(int cc , int cr , int er , int ec, String ans){
//         if(cr==er && cc == ec){
//             System.out.print(ans + " ");
//             return;
//         }
//         if(cr>er || cc>ec){
//             return;
//         }
//         PrintPath(cc + 1, cr, er, ec, ans + "H");
//         PrintPath(cc, cr + 1, er, ec, ans + "V");
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         int m = 3;
//         PrintPath(0,0,n-1,m-1,"");
//     }
// }

// letter cimbunatuon of phon numbers

import java.util.ArrayList;
import java.util.List;

public class recursion {
    
    public static void Printanswer(String ques, String ans, List<String> ll){

        if(ques.length() == 0){
            ll.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String press = code[ch-48];
        for(int i= 0 ;i<press.length();i++){
            Printanswer(ques.substring(1), ans + press.charAt(i), ll);
        }
    }
    public static void main(String[] args) {
        String ques = "23";
        List<String> ll = new ArrayList<>();
        Printanswer(ques, "", ll);
        
        System.out.println(ll);
    }
}
