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
public class string {
        public static String toUpperCase(String str){
                StringBuilder sb = new StringBuilder("");
                char ch = Character.toUpperCase(str.charAt(0));
                sb.append(ch);
                for(int i=1;i<str.length();i++){
                        if(str.charAt(i) == ' ' && i<str.length()-1){
                                sb.append(str.charAt(i));
                                i++;
                                sb.append(Character.toUpperCase(str.charAt(i)));
                        }else{
                                sb.append(str.charAt(i));
                        }
                }
                return sb.toString();
        }

        public static void main(String[] args) {
                String str = "hi , i am krish";
                System.out.println(toUpperCase(str));
        }
}