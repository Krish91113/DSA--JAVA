// import java.util.*;
// public class string {
//     // public static void printLetters(String str){
//     //     for(int i=0;i<str.length();i++){
//     //         System.out.print(str.charAt(i) + " ");
//     //     }
//     // }
//     // public static void main(String[] args) {
        // char arr[] = {"a","b","c"};
//     //     // String str = ("abc");
//     //     // String str2 = new String("xyz");
//     //     // Scanner sc = new Scanner(System.in);
//     //     // String str3 = sc.nextLine();
//     //     // System.out.println(str3);
//     //     String str = "Krish Baranwal";
//     //     printLetters(str);
//     // }

//     // check if string is palindrome
//     public static boolean isPalindrome(String str){
//         for(int i=0;i<str.length();i++){
//             int n = str.length();
//             if(str.charAt(i) != str.charAt(n-1-i)){
//                 // not a palindrome 
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         String str = "krish";
//          System.out.println(isPalindrome(str));
//     }
// }

// Find shortest path
// public class string {
//     public static float getShortestPath(String str){
//         int x=0,y=0;
//         for(int i=0;i<str.length();i++){
//             int dir = str.charAt(i);
//             if(dir == 'W'){
//                 x--;
//             }else if(dir == 'S'){
//                 y--;
//             }else if(dir == 'E'){
//                 x++;
//             }else{
//                 y++;
//             }
//         }
//         int x2 = x*x;
//         int y2 = y*y;
//         return (float)Math.sqrt(x2+y2);
//     }

//     public static void main(String[] args) {
//         String str = "WNEENESENNN";
//         System.out.println(getShortestPath(str));
//     }
// }
// Strings : .equals isliye use krte hai because == dekhta hai ki jo string ka likhne ka tarika object same hai kya if nahi hai to wo alag show krdeta hai
// Substring
// public class string {
//         public static String subString(String str,int ei,int si){
//                 String substr = "";
//                 for(int i=si; i<ei;i++){
//                         substr = substr + str.charAt(i);
//                 }
//                 return substr;
//         }

//         public static void main(String[] args) {
//                 String str = "HelloWorld";
//                 System.out.println(subString(str, 5, 3));
//         }
// }
// public class string {

//         public static void main(String[] args) {
//                 String fruits [] = {"apple","mango","banana"};
//                 String largest = fruits[0];
//                 for(int i=1;i<fruits.length;i++){
//                         if(largest.compareTo(fruits[i])< 0){
//                                 largest = fruits[i];
//                         }
//                 }
//                 System.out.println(largest);
//         }
// }

// public class string {

//         public static void main(String[] args) {
//                 StringBuilder sb = new StringBuilder("");
//                 for(char ch='a';ch<='z';ch++){
//                         sb.append(ch);
//                 }
//                 System.out.println(sb);
                
//         }
// }
// Convert letters to uppercase
// public class string {
//         public static String toUpperCase(String str){
//                 StringBuilder sb = new StringBuilder("");
//                 char ch = Character.toUpperCase(str.charAt(0));
//                 sb.append(ch);
//                 for(int i=1;i<str.length();i++){
//                         if(str.charAt(i) == ' ' && i<str.length()-1){
//                                 sb.append(str.charAt(i));
//                                 i++;
//                                 sb.append(Character.toUpperCase(str.charAt(i)));
//                         }else{
//                                 sb.append(str.charAt(i));
//                         }
//                 }
//                 return sb.toString();
//         }

//         public static void main(String[] args) {
//                 String str = "hi , i am krish";
//                 System.out.println(toUpperCase(str));
//         }
// }

// leetcode 709 : TO lowerCase
// public class Solution {
//         public static String toLowerCase(String str){
//                 StringBuilder sb = new StringBuilder("");
//                 for(int i=0;i<str.length();i++){
//                         if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
//                                 sb.append(Character.toLowerCase(str.charAt(i)));
//                         }else{
//                                 sb.append(str.charAt(i));
//                         }
//                 }
//                 return sb.toString();
//         }

//         public static void main(String[] args) {
//                 String str = "Hello";
//                 System.out.println(toLowerCase(str));
//         }
// }
// public class string {
//     public static String toLowerCase(String s) {
//         String str = s.toLowerCase();
//         return str;
//     }
//     public static void main(String[] args) {
//         String str = "KRISH";
//         System.out.println(toLowerCase(str));
//     }
// // }

// public class string{
//     public static void main(String[] args) {
//         String str = "hello";
//         String str2 = "hello"; 
//         System.out.println(isEqual(str, str2));
//         System.out.println(s.charAt(0));
//     }
//     public static boolean isEqual(String str, String str2) {
//         if(str.length() != str2.length()){
//             return false;
//         }
//         if(str == str2){
//             return true;
//         }
//         for(int i=9;i<str.length();i++){
//             if(str.charAt(i) != str2.charAt(i)){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// public class string {
//     public static int lengthOfLastWord(String s) {
//         int ans = 0;
//         int i = s.length() - 1;
//         while(i>=0 && s.charAt(i) == ' ') {
//             i--;
//         }
//         while(i>=0 && s.charAt(i) != ' ') {
//             ans++;
//             i--;
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         String s = "Hello World";
//         System.out.println(lengthOfLastWord(s));
//     }
// }
//Palindorme
// import java.util.*;
// public class string {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         System.out.println(str);
//         System.out.println(isPalindrome(str));
//     }
//     public static boolean isPalindrome(String str){
//         int i = 0;
//         int j = str.length()-1;
//         while(i<j){
//             if(str.charAt(i) != str.charAt(j)){
//                 return false; 
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
// }

// public class string {
//     public static void main(String[] args) {
//         String str = "hello";
//         System.out.println(10 + str  + 20 + 30);
//     }
// }
// Print all palindromic substrings

// public class string {
//     public static String printPalindromeSubstrings(String s) {
//         int max=0,start=0,end=0;
        
//         for(int i=0;i<s.length();i++){
//             for(int j=i;j<s.length();j++){
//                 if(isPalindrome(s.substring(i,j))==true){
//                    max = j-i+1;
//                    start=i;
//                    end=j;
//                 }
//             }
//         }
//         return s.substring(start,end+1);
//     }
//      public static boolean isPalindrome(String str){
//         int i = 0;
//         int j = str.length() - 1;
//         while(i < j) {
//             if(str.charAt(i) != str.charAt(j)) {
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         String s = "nitin";
//         System.out.println(printPalindromeSubstrings(s));
//     }
// }

// public class string{
//     public static void subString(String s){
//         for(int length = 1; length<=s.length();length++){
//             for(int j=length ; j<=s.length();j++){
//                 int i = j - length ;
//                 System.out.print(s.substring(i,j)+" ");
//             }
//             System.out.println( );
//         }
//     }
//     public static void main(String[] args) {
//         String s = "83415";
//         subString(s);
//     }
// }

public class string {
    public static boolean validPalindrome(String s){
        boolean ans = true;
        int i= 0;
        int j = s.length() - 1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                if(s.charAt(i) == s.charAt(j-1)){
                    return ans;
                }
                ans = false;
                return ans;
            }
            i++;
            j--;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(validPalindrome(s));
    }
}