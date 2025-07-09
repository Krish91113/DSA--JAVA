// import java.util.*;
// public class array {
//     // public static int update(int marks[],int key){
//     //     for(int i=0;i<marks.length;i++){
//     //         if(marks[i] == key){
//     //             return i;
//     //         }
//     //         return -1;
//     //     }
//     // }
//     // public static void main(String[] args) {
//     //     // int marks[] = new int[50];
//     //     // Scanner sc = new Scanner(System.in);
//     //     // marks[0] = sc.nextInt();//physics
//     //     // marks[1] = sc.nextInt();//checm
//     //     // marks[2] = sc.nextInt();//bio
//     //     // System.out.println("physics :" + marks[0]);
//     //     // System.out.println("chem :" + marks[1]);
//     //     // System.out.println("bio:" + marks[2]);
//     //     // // marks[1] = marks[1] + 82;
//     //     // // System.out.println("chem :" +marks[1]);
//     //     // int percentage = marks[0] + marks[1] + marks[2] ;
//     //     // percentage = percentage / 3;
//     //     // System.out.println("Percentage :" +percentage);
//     //     // int marks[] = {97,98,99};
//     //     // int nonChangable = 5;
//     //     // System.out.println(nonChangable);
//     //     // update(marks,nonChangable);
//     //     // for(int i=0;i<marks.length;i++){
//     //     //     System.out.print(marks[i] +" ");
//     //     // }
//     //     // System.out.println();
//     // }
    
//     // Linear search
//     // public static int linearSearch(int marks[],int key){
//     //     for(int i=0;i<marks.length;i++){
//     //         if(marks[i]==key){
//     //             return i;
//     //         }
//     //     }
//     //      return -1;
//     // }
//     // public static void main(String[] args) {
//     //     int marks[] = {97,96,97,90,94,93,91};
//     //     int index =linearSearch(marks, 93);
//     //     if(index == -1){
//     //         System.out.println("not found");
//     //     }else{
//     //         System.out.println("Index found:" +index);
//     // }
//     // }
//     // public static int linearSearch(String food[],String key){
//     //     for(int i=0; i<food.length;i++){
//     //         if(food[i] == key){
//     //             return i;
//     //         }
//     //     }
//     //     return -1;
//     // }
//     // public static void main(String[] args) {
//     //     String food[] = {"Dosa","Idli","Sambhar","Chutney","Sabdwich"};
//     //     int index = linearSearch(food, "Sabdwich");
//     //     if(index==-1){
//     //         System.out.println("Not found");
//     //     }else{
//     //         System.out.println("Found at index:" +index);
//     //     }
//     // }
   
//     // Largest number in array
//     // public static int getLargest(int number[]){
//     //     int largest = Integer.MIN_VALUE;
//     //     for(int i=0;i<number.length;i++){
//     //         if(largest<number[i]){
//     //             largest = number[i];
               
//     //         }
            
//     //     }
//     //     return largest;
//     // }
//     // public static void main(String[] args) {
//     //     int number[] = {1,2,6,3,5};
//     //     System.out.println("the largest number is:" +getLargest(number));
//     // }
    
//     // Binary search
//     // public static int binarySearch(int number[],int key){
//     //     int start = 0;
//     //     int end = number.length-1;
//     //     while(start<=end){
//     //         int mid = (start + end) / 2;
//     //         if(number[mid] == key){
//     //             return mid;
//     //         }
//     //         if(number[mid]<key){
//     //             start = mid+1;
//     //         }else{
//     //             end = mid -1;
//     //         }
//     //     }
//     //     return -1;

//     // }
//     // public static void main(String[] args) {
//     //     int number [] = {2,4,6,8,10,12,14};
//     //     int key = 10;
//     //     System.out.println("Index is:" +binarySearch(number, key));
//     // }
//     //---------------Reverse an array----------\\
// // public static void reverse(int num[]){
// //     int first = 0;
// //     int last = num.length - 1 ;
// //     while(first < last){
// //         int temp = num[last];
// //         num[last] = num[first];
// //         num[first] = temp;
// //         first ++;
// //         last -- ;
// //     }
// // }
// // public static void main (String args[]){
// //     int num[] = {2,4,6,8,10};
// //     reverse(num);
// //     for(int i = 0;i<num.length;i++){
// //         System.out.print(num[i]+" ");
// //     }
// // }

// // Pair an array
// // public static void pair(int num[]){
// //     for(int i =0;i<num.length;i++){
// //         int curr = num[i];
// //         for(int j =i+1;j<num.length;j++){
// //             System.out.print("(" + curr + "," + num[j] + ")");
// //         }
// //         System.out.println();
// //     }
// // }
// // public static void main(String[] args) {
// //     int num [] = {2,4,6,8,10};
// //     pair(num);
// // }

// //Maxium subarray
// // public static void maxsumSubarray(int arr[]){
// //     int maxSum = Integer.MIN_VALUE;
// //     int currSum = 0;
// //     for(int i = 0 ;i<arr.length;i++){
// //         int start = i;
// //         for(int j = i;j<arr.length;j++){
// //             int end = j;
// //             currSum = 0;
// //             for(int k = start ; k<=end;k++){
// //                 currSum = currSum + arr[k];
// //             }
// //             if(maxSum < currSum){
// //                 maxSum = currSum;
// //             }
// //         }
// //     }
// //     System.out.println("max sum of subarray is:" +maxSum);
// // }
// // public static void main(String[] args) {
// //     int arr[] = {2,4,6,8,10};
// //     maxsumSubarray(arr);
// // }

// // Kadanes algorithm
// // public static int Kadanes(int numbers[]){
// //     int ms = Integer.MIN_VALUE;
// //     int cs = 1;
// //     for(int i= 0;i<numbers.length;i++){
// //         cs = cs * numbers[i];
// //         if(cs < 0){
// //             cs = 1;
// //         }
// //         else if (cs==0) {
// //             ms = 0;
// //         }
// //         ms = Math.max(ms, cs);
// //     }
// //     if(numbers[])
// //     System.out.println("The maximum Product of subarray is :" +ms);
// //     return ms;
// // }
// // public static void main(String[] args) {
// //     int numbers[] ={-2};
// //     Kadanes(numbers);
// // }
// // }
 
// // Seecond largest number in array 
// // public static int secondlargest(int arr[]){
// //         int slargest = Integer.MIN_VALUE;
// //         int largest = arr[0];
// //         for(int i=1;i<arr.length;i++){
// //             if(arr[i]>largest){
// //                 slargest = largest;
// //                 largest = arr[i];
// //             }
// //             else if(arr[i]<largest && arr[i]>slargest){
// //                 slargest = arr[i];
// //             }
// //         }
// //         return slargest;
// // }
// // public static void main(String[] args) {
// //     int arr[] ={1,2,4,7,7,5};
// //     System.out.println("Second largest element is:" +secondlargest(arr));
// // }

// // checck if array is sorted
// // public static boolean isSorted(int[] nums){
// //     for(int i=1;i<nums.length;i++){
// //         if(nums[i]>=nums[i-1]){

// //         }else{
// //             return false;
// //         }
// //     }
// //     return true;
// // }
// // public static void main(String[] args) {
// //     int nums[] ={2,1,3,4};
// //     System.out.println("Is the array sorted? " + isSorted(nums));

// // }

// // // trapped rain water
// public static int trappedWater(int height[]){
//     int n = height.length;
//     int leftMax []= new int[n];
//     leftMax[0] = height[0];
//     for(int i=1;i<n;i++){
//         leftMax[i] = Math.max(height[i], leftMax[i-1]);
//     }
//     int rightMax []= new int[n];
//     rightMax[n-1] = height[n - 1];
//     for(int i=(n-2);i>=0;i--){
//         rightMax[i] = Math.max(height[i],rightMax[i+1] );
//     }
//     int trappedWater = 0;
//     for(int i=0;i<n;i++){
//         int waterLevel = Math.min(leftMax[i], rightMax[i]);
//         trappedWater += waterLevel - height[i];
//     }
//     return trappedWater;
// }
// public static void main(String[] args) {
//     int height [] = {4,2,0,6,3,2,5};
//     System.out.println(trappedWater(height));
// }
// }
// public class array {
//     public static void moveZeroes(int[] arr) {
//         int count = 0; // This keeps track of the position to place the next non-zero

//         // Step 1: Move all non-zero elements to the front
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 arr[count] = arr[i];
//                 count++;
//             }
//         }

//         // Step 2: Fill the rest with zeroes
//         while (count < arr.length) {
//             arr[count] = 0;
//             count++;
//         }

//         // Print the result
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {0, 1, 0, 3, 12};
//         moveZeroes(arr); // Output: 1 3 12 0 0
//     }
// }

// // Find the numbers that appear once other twice
// public class array {
//     public static int getSingleElement(int nums[]){
//         int xor = 0;
//         for(int i= 0; i<nums.length;i++){
//             xor = xor ^ nums[i];
//         }
//         return xor;
//     }
//     public static void main(String[] args) {
//         int nums[] = {1,1,2,3,3,4,4};
//         System.out.println(getSingleElement(nums));
//     }
// }

// Missing numbers
public class array{
    public static void missingNumber(int [] nums){
        Arras.sort(nums);
        int n = nums.length;
        for(int i=1;i<=n;i++){
            int flag = 0;
            for(int j=0;j<n;j++){
                if(nums[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
               System.out.println(i);
            }
        }
        
    }

    public static void main(String[] args) {
        int nums[] ={9,6,4,2,3,5,7,0,1};
        missingNumber(nums);
    }
}
