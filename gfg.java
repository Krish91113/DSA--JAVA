// // // // public class gfg {
    
// // // //    public static int floorSqrt(int n) {
// // // //         int i = 1;
// // // //         int j = n;
// // // //         int ans = 0;
        
// // // //         while(i <= j){
// // // //             int mid = (i + j) / 2;
// // // //             long square = (long)mid * mid;  

// // // //             if(square == n){
// // // //                 return mid;
// // // //             } else if(square < n){
// // // //                 ans = mid;      
// // // //                 i = mid + 1;
// // // //             } else {
// // // //                 j = mid - 1;
// // // //             }
// // // //         }
// // // //         return ans;
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         int n = 15;
// // // //         System.out.println(floorSqrt(n));
// // // //     }

// // // // }

// // // public class gfg {
// // //     public static int firstRepeated(int arr[]){
// // //         int ans = Integer.MAX_VALUE;
// // //         for(int i=0;i<arr.length;i++){
// // //             for(int j=i+1;j<arr.length;j++){
// // //                 if(arr[i] == arr[j]){
// // //                     ans = Math.min(ans, i+1);
// // //                     return ans;
// // //                 }
// // //             }
// // //         }
// // //         return -1;
// // //     }

// // //     public static void main(String[] args) {
// // //         int arr [] = {1, 2, 3, 4};
// // //         System.out.println(firstRepeated(arr));
// // //     }
// // // }

// // public class gfg {
// //     public static double posAverag(int arr[]){
       
    
// //         int sum = 0;
// //         double avg = 0;
// //         int no  = 0;
// //         for(int i = 0;i<arr.length;i++){
// //             if(arr[i]>0){
// //                 sum+=arr[i];
// //                 no++;
// //                 avg = sum/no;
// //             }
// //         }
// //         return avg;
// //     }

// //     public static void main(String[] args) {
// //         int arr [] ={-12,8,-7,6,12,-9,14};
// //         System.out.println(posAverag(arr));
// //     }
// // }

// // Count digits
// // User function Template for Java

// // public class gfg  {
// //    public static int evenlyDivides(int n) {
// //         int count = 0;
// //         int original = n;
// //         while(n>0){
// //             int end = n % 10;
// //             if(end !=0 && original % end == 0){
// //                 count++;
// //             }
// //             n = n / 10;
// //         }
// //         return count;
// //     }
// //     public static void main(String[] args) {
// //         int n= 42;
// //         System.out.println(evenlyDivides(n));
// //     }
// // }

// // public class gfg {
// //     public static int sumSubstrings(String s){
// //         int sum = 0;
// //         for(int i=0;i<s.length();i++){
// //             for(int j=i;j<s.length();j++){
// //                 sum += Integer.parseInt(s.substring(i, j+1));
// //             }
// //         }
// //         return sum;
// //     }
// //     public static void main(String[] args) {
// //         String s = "6759";
// //         System.out.println(sumSubstrings(s));
// //     }
// // }

// // anagram

// import java.util.Arrays;

// public class gfg {
//     public static boolean areAnagrams(String s, String t){
//         if(s.length()!=t.length()) return false;
//         char arr1[] = s.toCharArray();
//         char arr2[] = t.toCharArray();
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         for(int i=0;i<arr1.length;i++){
//             if(arr1[i]!=arr2[i]){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         String s = "listen";
//         String t = "silent";
//         System.out.println(areAnagrams(s, t));
//     }
// }

import java.util.Arrays;

public class gfg {

    public static void main(String[] args) {
        String s = "character";
        char arr [] = s.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
    }
}