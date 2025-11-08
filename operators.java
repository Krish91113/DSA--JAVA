// import java.util.*;
// public class operators {
// //     public static void main (String args[]){
// //     Scanner sc = new Scanner(System.in);
// //     int a = sc.nextInt();
// //     int b = sc.nextInt();
// //     System.out.println("add = " + (a+b));
// //     System.out.println("Multiply = " + (a*b));
// //     System.out.println("subtract = " + (a-b));
// //     System.out.println("Divide = " + (a/b));
// //     System.out.println("Modulus = " + (a %b));
// // }
// // public static int twoSums(int arr[] ,int target){
// //     int sums = 0;
// //     int index = 0;
// //     for(int i =0 ; i<arr.length;i++){
// //         index = i;
// //         sums = sums + arr[i];
// //         if(sums == target){
// //           System.out.println(i);
// //         }
// //     }
// //     return sums;
// // }
// // public static void main(String[] args) {
// //     int arr[] = {2,7,11,15};
// //     int target = 9;
// //     twoSums(arr, target);
// // }
// // 



//     public static boolean validMountainArray(int[] arr) {
//         int i=0,n=arr.length;
//         while(i+1 < n && arr[i]<arr[i+1]){
//             i++;
//         }
//         if(i==0||i==n-1){
//             return false;
//         }
//         while(i+1<n && arr[i]>arr[i+1]){
//             i++;
//         }
//         return i==n-1;
//     }
//     public static void main(String[] args) {
//         int arr[] = {0,3,2,1};
//         System.out.println(validMountainArray(arr));
//     }
// }

public class operators{

    public static int thirdMax(int[] nums) {
        long firstmax=Long.MIN_VALUE;   //consider long min
        long secmax=Long.MIN_VALUE;
        long thirdmax=nums[0];
       // if(nums.length==2){return Math.max(nums[0],nums[1]);} //if no thirdmin return max
       // if(nums.length==1){return nums[0];} //last wale m handle hogya dono edgecase
      for(int i=0;i<nums.length;i++){
        if(nums[i]>firstmax){ //if got ele greater than 1rd update sec and third as well 
            thirdmax=secmax;
            secmax=firstmax;
            firstmax=nums[i];
        }
        else if(nums[i]>secmax &&nums[i]<firstmax){ //if got ele big than sec update third ele
            thirdmax=secmax;
            secmax=nums[i];


        }
        else if(nums[i]>thirdmax && nums[i]<secmax){
            thirdmax=nums[i]; //if any new ele smaller than sec but bigger than third update third
        }

      } 
      if(thirdmax==Long.MIN_VALUE || secmax==Long.MIN_VALUE){return (int)firstmax;} //edge if no third  return firstmax
      return (int)thirdmax;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        System.out.println(thirdMax(nums));  // Output: 1

        int[] nums2 = {1, 2};
        System.out.println(thirdMax(nums2));  // Output: 2

        int[] nums3 = {2, 2, 3, 1};
        System.out.println(thirdMax(nums3));  // Output: 1
    }
}