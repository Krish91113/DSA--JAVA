import java.util.*;
public class operators {
//     public static void main (String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     System.out.println("add = " + (a+b));
//     System.out.println("Multiply = " + (a*b));
//     System.out.println("subtract = " + (a-b));
//     System.out.println("Divide = " + (a/b));
//     System.out.println("Modulus = " + (a %b));
// }
// public static int twoSums(int arr[] ,int target){
//     int sums = 0;
//     int index = 0;
//     for(int i =0 ; i<arr.length;i++){
//         index = i;
//         sums = sums + arr[i];
//         if(sums == target){
//           System.out.println(i);
//         }
//     }
//     return sums;
// }
// public static void main(String[] args) {
//     int arr[] = {2,7,11,15};
//     int target = 9;
//     twoSums(arr, target);
// }
// 



    public static boolean validMountainArray(int[] arr) {
        int i=0,n=arr.length;
        while(i+1 < n && arr[i]<arr[i+1]){
            i++;
        }
        if(i==0||i==n-1){
            return false;
        }
        while(i+1<n && arr[i]>arr[i+1]){
            i++;
        }
        return i==n-1;
    }
    public static void main(String[] args) {
        int arr[] = {0,3,2,1};
        System.out.println(validMountainArray(arr));
    }
}
