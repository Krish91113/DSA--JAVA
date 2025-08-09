// public class leetcodeq {
//     public static void maxProductSubarray(int arr[]){
//         int maxProduct = Integer.MIN_VALUE;
//         int currProduct = 1;
//         for(int i=0;i<arr.length;i++){
//             int start = i;
//             for(int j=i;j<arr.length;j++){
//                 int end = j;
//                 currProduct=1;
//                 for(int k=start; k<=end ;k++){
//                     currProduct = currProduct * arr[k];
//                 }
//                 if(maxProduct<currProduct){
//                     maxProduct = currProduct;
//                 }
//             }
//         }
//         System.out.println("Maximum product is:" + maxProduct);
//     }
//     public static void main(String[] args) {
//         int arr[] = {2,3,-2,4};
//         maxProductSubarray(arr);
//     }
// }
// public class leetcodeq{
//     public static int maxSubArray(int [] nums){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;
//         for(int i=0;i<nums.length;i++){
//             cs = cs + nums[i];
//             if(cs < 0){
//                 cs = 0;
//             }
//             ms = Math.max(cs, ms);
//         }
//         System.out.println("maximum sum is:" +ms);
//         return ms;
//     }
//     public static void main(String[] args) {
//         int nums [] = {-2,-3,4,-1,-2,1,5,-3};
//         maxSubArray(nums);
//     }
// }

// import java.lang.reflect.Array;
// import java.util.Arrays;

// public class leetcodeq {
//     public static int[] twoSum(int[] numbers, int target) {
//         int left = 0;
//         int right = numbers.length - 1;

//         while (left < right) {
//             int sum = numbers[left] + numbers[right];
//             if (sum == target) {
//                 return new int[]{left + 1, right + 1}; // 1-based index
//             } else if (sum < target) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
//         return new int[]{}; // no pair found
//     }
//     public static void main(String[] args) {
//         int numbers[] ={2,7,11,15};
//         int target = 9;
//         System.out.println(Arrays.toString(twoSum(numbers, target)));
//     }
// }
// 121 Best time to buy and sell stock

// public class leetcodeq {
//     public static int maxProfit(int prices[]){
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit =0;
//         for(int i=0;i<prices.length;i++){
//             if(buyPrice < prices[i]){
//                 int profit = prices[i] - buyPrice;
//                 maxProfit = Math.max(maxProfit, profit);
//             }
//             else{
//                 buyPrice = prices[i];
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String[] args) {
//         int prices[] = {7,1,5,3,6,4};
//         System.out.println("Maximum profit is: " + maxProfit(prices));
//     }
//}

// 26 Remove Duplicates from Sorted Array
// public class leetcodeq{
//     public static int removeDuplicates(int [] nums){
//         int i=0;
//         for(int j=1;j<nums.length;j++){
//             if(nums[i]!=nums[j]){
//                 nums[i+1] = nums[j];
//                 i++;
//             }
//         }
//         return nums[i+1];
//     }
//     public static void main(String[] args) {
//         int nums[] = {0,0,1,1,1,2,2,3,3,5};
//         System.out.println("Length of array after removing duplicates: " + removeDuplicates(nums));
//     }
// }
// public class leetcodeq{
//     public static int removeDuplicates(int [] nums){
//         int i=0;
//         for(int j=1;j<nums.length;j++){
//             if(nums[i]!=nums[j]){
//                 nums[i+1] = nums[j];
//                 i++;
//                 int a[] = {nums[i],nums[j]};
//                 int b =a;
//                 return b;
//             }
//         }
//         return i+1;
//     }
//     public static void main(String[] args) {
//         int nums[] = {0,0,1,1,1,2,2,3,3,5};
//         System.out.println(removeDuplicates(nums));
//     }
// }

// 344 Reverse a string
// public class leetcodeq {
//     public static void reverseString(char s[]){
//         int first = 0;
//         int last = s.length-1;
//         while(first<last){
//             char temp = s[last];
//             s[last] = s[first];
//             s[first] = temp;
//              first++;
//              last--;
//         }
//         System.out.println(s);
//     }

//     public static void main(String[] args) {
//        char s[] = {'h','e','l','l','o'};
//         reverseString(s);
//     }
// }
// 27 Remove element
// public class leetcodeq {
//     public static int removeElement(int[] nums, int val) {
//         int i = 0;
//         for (int j = 0; j < nums.length; j++) {
//             if (nums[j] != val) {
//                 nums[i] = nums[j];
//                 i++;
//             }
//         }
//         return i;
//     }

//     public static void main(String[] args) {
//         int[] nums = {3, 2, 2, 3};
//         int val = 3;
//         int newLength = removeElement(nums, val);
//         System.out.println("New length: " + newLength);
//         System.out.print("Modified array: ");
//         for (int i = 0; i < newLength; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }
// 80 Remove Diplicate from sorted array 
// public class leetcodeq {
//     public static int removeDuplicates(int nums[]){
//         int i =2 ;
//         for(int j=2;j<nums.length;j++){
//             if(nums[j]!=nums[i-2]){
//                 nums[i] = nums[j];
//                 i++;
//             }
//         }
//         return i;
//     }
//     public static void main(String[] args) {
//         int nums [] = {0,0,1,1,1,1,2,3,3};
//         System.out.println(removeDuplicates(nums));
//     }
// }

// Max subaray
// public class leetcodeq {
//     public static int maxSubArray(int nums[],int target){
//         int currSum = 0;
//         int maxSubseq = 0;
//         for(int i=0;i<nums.length;i++){
//             int start=i;
//             for(int j=i;j<nums.length;j++){
//                 int end = j;
//                for(int k= start;k<=end;k++){
//                 currSum = currSum + nums[k];
//                 if(currSum < target){
//                     maxSubseq++;
//                }
//              }   
//             }
//         }
//         return maxSubseq;
//     }
//     public static void main(String[] args) {
//         int nums [] ={3,5,6,7};
//         int target = 9;
//         System.out.println(maxSubArray(nums,target));
//     }
// }
// public class leetcodeq {
//     public static int searchInsert(int nums[], int target) {
//         int start = 0;
//         int end = nums.length - 1;

//         while (start <= end) {
//             int mid = (start + end) / 2;
//             if (nums[mid] == target) {
//                 return mid;
//             } else if (nums[mid] < target) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }

//         return start; // This is the correct insertion position
//     }

//     public static void main(String args[]) {
//         int nums[] = {1, 3, 5, 6};
//         int target = 7;
//         System.out.println(searchInsert(nums, target)); // Output: 2
//     }
// }
// leetcode 238

// import java.util.Arrays;

// public class leetcodeq {
//     public static int [] productExceptSelf(int nums[]){
//         int n=nums.length;
//         int ans [] = new int[n];
//         int prodL = 1;
//         int prodR = 1;
//         for(int i=n-1;i>=0;i--){
//             ans[i] = prodR;
//             prodR = prodR * nums[i];
//         }
//         for(int i=0;i<n;i++){
//             ans[i] = ans[i] * prodL;
//             prodL = prodL * nums[i];
//         }
//         return ans;
//     }
    
//     public static void main(String[] args) {
//         int nums[] = {1,2,3,4};
//         System.out.println(Arrays.toString(productExceptSelf(nums)));
//     }
// }
// import java.util.*;
// public class leetcodeq {
//     public static boolean isPerfectSquare(int nums,int n){
//         int sqr = n * n;
//         if(sqr == nums){
//             return true;
//         }else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         int nums = 12;
//         int n = 3;
//         System.out.println(isPerfectSquare(nums, n));
//     }
// }

// // 7 Reverse an integer
// public class leetcodeq {
//         public static int reverse(int x){
//             int rev = 0;r̥
//             while(x>0 || x<0){
//                 int lastDigit = x % 10;
//                 rev = (rev * 10 ) + lastDigit ;
//                  x = x /10; 
//             }
//             return rev;
//         }

//     public static void main(String[] args) {
//         int x = 534236469;   
//         System.out.println(reverse(x));
//     }
// }
// MAx Consecutiv ones
// public class leetcodeq {
//     public static int findMaxConsecutiveOnes(int[] nums) {
//         int count = 0;
//         int max = 0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==1){
//                 count ++;
//                 max = Math.max(count,max);
//             }else{
//                 count = 0;
//             }
//         }
//         return max;
        
//     }
//     public static void main (String agrs[]){
//         int nums [] = {1,1,0,1,1,1};
//         System.out.println(findMaxConsecutiveOnes(nums));
//     }
// }
// Valid Paranthesis
// public class leetcodeq {
//     public static boolean validParanthesis(String s){
//         while(true){
//             if(s.contains("{}")){
//                 s = s.replace("{}", "");
//             }else if(s.contains("[]")){
//                 s = s.replace("[]", "");
//             }else if(s.contains("()")){
//                 s = s.replace("()", "");
//             }else{
//                 return s.isEmpty();
//             }
//         }
//     }

//     public static void main(String[] args) {
//         String s = "([)";
//         System.out.println(validParanthesis(s));
//     }
// }

// Solved no that appear twice other than one
// public class leetcodeq {
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



// public class leetcodeq {
//     public static int [] moveZeroes(int nums[]){
//         int j = -1;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0){
//                 j=i;
//                 break;
//             }
//         }
//         if(j==-1) return nums;
//         for(int i=j+1;i<nums.length;i++){
//             if(nums[i]!=0){
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//                 j++;
//             }
//         }
//         return nums;
//     }

//     public static void main(String[] args) {
//         int nums[] = {1,0,2,3,2,0,0,4,5,1};
//         int []result =moveZeroes(nums);
//         System.out.println(Arrays.toString(result));
//     }
// }

//1089: Duplicates at zero

// public class leetcodeq {
//     public static void duplicateZeros(int[] arr) {
//         int n = arr.length;
//         int possibleDups = 0;

//         for (int i = 0; i < n - possibleDups; i++) {
//             if (arr[i] == 0) {
//                 if (i == n - possibleDups - 1) {
//                     arr[n - 1] = 0;
//                     n = n - 1;
//                     break;
//                 }
//                 possibleDups++;
//             }
//         }
//         int last = n - possibleDups - 1;

//         for (int i = last; i >= 0; i--) {
//             if (arr[i] == 0) {
//                 arr[i + possibleDups] = 0;
//                 possibleDups--;
//                 arr[i + possibleDups] = 0;
//             } else {
//                 arr[i + possibleDups] = arr[i];
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {1,0,2,3,0,4,5,0};
//         duplicateZeros(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }

// Missing Number

// import java.util.Arrays;

// import java.util.Arrays;

// public class leetcodeq{
//     public static int missingNumber(int [] nums){
//         Arrays.sort(nums);
//         int n = nums.length;
//         int sumofLe = (n*(n+1))/2;
//         int sumofnums = 0;
//         for(int i=0;i<n;i++){
//             sumofnums = sumofnums + nums[i];
//         }
//         return sumofLe - sumofnums;
//     }

//     public static void main(String[] args) {
//         int nums[] ={1};
//         System.out.println(missingNumber(nums));
//     }
// }

// Majority elements : Moores Voting algorithm
// public class leetcodeq {
//     public static int majorityElement(int[] nums) {
//         int cand = 0;
//         int count = 0;
//         for(int i=0;i<nums.length;i++){
//             if(count == 0){
//                 cand = nums[i];
//             }if(cand == nums[i]){
//                 count ++;
//             }else{
//                 count --;
//             }
//         }
//         return cand;
//     }
//     public static void main (String args[]){
//         int nums[] = {2,2,1,1,1,2,2};
//         System.out.println(majorityElement(nums));
//     }
//}

// first bad version
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
// public class leetcodeq{
//     public static void main(String[] args) {
//         int n = 100;
//         System.out.println(firstBadVersion(n));
//     }
//     public static int firstBadVersion(int n) {
//         int start = 1;
//         int end = n;
//         int ans = 0;
//         while(start<=end){
//             int mid = start + (end-start)/2;
//             if(isBadVersion(mid)==true){
//                 ans = mid;
//                 end = mid - 1;
//             }else {
//                 start = mid + 1;
//             }
//         }
//         return ans;
//     }
//     public static boolean isBadVersion(int mid){
//         return false;
//     }
// }
// Max Subarray sum
// public class array {
//     public static int maxSubArray(int nums[]){
//         int ans = Integer.MIN_VALUE;
//         int sum = 0;
//         for(int i=0;i<nums.length;i++){
//             sum+=nums[i];
//             ans = Math.max(ans, sum);
//             if(sum<0){
//                 sum = 0;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int nums[] = {2,3,-7,11,-1,3};
//         System.out.println(maxSubArray(nums));
//     }
// }

// Max Product array
// public class leetcodeq{
//     public static int maxProduct(int numbers[]) {
//         int prefix = 1;
//         int suffix = 1;
//         int ans = Integer.MIN_VALUE;
//         int n = numbers.length;
//         for(int i=0;i<n;i++){
//             if(prefix==0) prefix =1;
//             if(suffix ==0) suffix=1;

//             prefix = prefix * numbers[i];
//             suffix = suffix * numbers[n-i-1];
//             ans = Math.max(ans,Math.max(prefix,suffix));
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//         maxProduct(numbers);
//     }
// }

// Subarray sum equal K
// public class leetcodeq{
//     public static int subaraySum(int nums[] , int k){
//         int count = 0;
//         for(int i=0;i<nums.length;i++){
//             int sum = 0;
//             for(int j=i;j<nums.length;j++){
//                 sum = sum + nums[j];
//                 if(sum == k){
//                     count ++;
//                 }
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int nums[] = {1,2,3};
//         int k = 3;
//         System.out.println(subaraySum(nums, k));
//     }
// }

// Transpose 
// public class leetcode{
//     public static int[][] transpose(int[][] matrix) {
//         int row = matrix.length;
//         int col = matrix[0].length;
//         int[][] result = new int[col][row]; 
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 result[j][i] = matrix[i][j];
//             }
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         int[][] nums = {{2, 4, -1}, {-10, 5, 11}, {18, -7, 6}};
//         System.out.println(transpose(nums));
//     }
// }    

//59 Spiral matrix
// public class leetcodeq {
//     public static void printSpiral(int matrix[][]){
//         int minr = 0;
//         int maxr = matrix.length - 1;
//         int minc = 0;
//         int maxc = matrix[0].length -1;
//         int total_element = matrix.length * matrix[0].length;
//         int count = 0;
//         while(count<total_element){
//         for(int i=minc ; i<=maxc && count<total_element ; i++){
//             System.out.print(matrix[minr][i] + " ");
//             count++;
//         }
//         minr++;
//         for(int i=minr;i<=maxr && count<total_element;i++){
//             System.out.print(matrix[i][maxc] + " ");
//             count++;
//         }
//         maxc--;
//         for(int i=maxc;i>=minc && count<total_element;i--){
//             System.out.print(matrix[maxr][i] + " ");
//             count++;
//         }
//         maxr--;
//         for(int i=maxr ;i>=minr && count<total_element;i--){
//             System.out.print(matrix[i][minc] + " ");
//             count++;
//         }
//         minc++;
//     }
// }

//     public static void main(String[] args) {
//         int matrix[][] = {{1, 2, 3, 4},
//                           {5, 6, 7, 8},
//                           {9, 10, 11, 12},
//                           {13, 14, 15, 16}};
//         printSpiral(matrix);
//     }    
// }

// contains duplicate
// public class leetcodeq{
//     public static boolean containsDuplicate(int []nums){
//         boolean ans = false;
//         int i = 0;
//         for(int j=i+1;j<nums.length;j++){
//             if(nums[i]==nums[j]){
//                 ans = true;
//                 break;
//             }
//             else if(j==nums.length-1){
//                 i++;
//                 j=i;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int [] nums = {1,3,4,4};
//         System.out.println(containsDuplicate(nums));
//     }
// }

// Plus one 


// public class leetcodeq {
//     public static int checkPerfectSquare(int N) {
//         long start = 1;
//         long end = N;
//         int ans = 0;
//         while(start<=end){
//             long mid = (start + end)/2;
//             long sqr = (mid * mid);
//             if(sqr == N){
//                 ans = 1;
//                 return ans;
//             }else if(sqr>N){
//                 end = mid -1;
//             }else{
//                 start = mid + 1;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int N = 16;
//         System.out.println(checkPerfectSquare(N));
//     }
// }

// sqrt(X)

// public class leetcodeq {
//     public int mySqrt(int x) {
       
//         if (x == 0) return 0;

//         int left = 1, right = x;
//         int ans = 0;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             long square = (long) mid * mid;

//             if (square == x) {
//                 return mid; 
//             } else if (square < x) {
//                 ans = mid; 
//                 left = mid + 1; 
//             } else {
//                 right = mid - 1; 
//             }
//         }

//         return ans; 
//     }
//     public static void main(String[] args) {
//         int x = 8;
//         leetcodeq solution = new leetcodeq();
//         System.out.println(solution.mySqrt(x));
//     }
// }

// count string after spaced
// public class leetcodeq {
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

// public class leetcodeq {
//     public static int strStr(String haystack, String needle) {
//         for(int i=0;i<haystack.length();i++){
//             for(int j=0;j<needle.length();j++){
//                 if(i+j >= haystack.length() || haystack.charAt(i+j) != needle.charAt(j)){
//                     break;
//                 }
//                 if(j == needle.length()-1){
//                     return i;
//                 }
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         String haystack = "sadbutsad";
//         String needle = "sad";
//         System.out.println(strStr(haystack, needle));
//     }
// }

// Search in a rotated sorted array
// public class leetcodeq {
//     public static int search(int[] nums, int target) {
//         int low=0;
//         int high = nums.length - 1;
//         while(low<=high){
//             int mid = (low + high)/2;
//             if(nums[mid] == target){
//                 return mid;
//             }
//             if(nums[low]<=nums[mid]){
//                 if(nums[low]<=target && target<=nums[mid]){
//                     high = mid - 1;
//                 }else{
//                     low = mid + 1;
//                 }
//             }
//             else{
//                 if(nums[mid]<=target && target<=nums[high]){
//                     low = mid + 1;
//                 }else{
//                     high = mid - 1;
//                 }
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int nums[] = {4,5,6,7,0,1,2};
//         int target = 0;
//         System.out.println(search(nums, target));
//     }
// }

// Longest palindromic string 
// public class leetcodeq {
//     public static String longestPalindrome(String s) {
//         int max = 0, start = 0, end = 0;

//         for (int i = 0; i < s.length(); i++) {
//             for (int j = i; j < s.length(); j++) {
//                 String sub = s.substring(i, j + 1);
//                 if (isPalindrome(sub) && sub.length() > max) {
//                     max = sub.length();
//                     start = i;
//                     end = j;
//                 }
//             }
//         }
//         return s.substring(start, end + 1);
//     }

//     private static boolean isPalindrome(String str) {
//         int i = 0, j = str.length() - 1;
//         while (i < j) {
//             if (str.charAt(i) != str.charAt(j)) return false;
//             i++;
//             j--;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         String s = "nitin";
//         System.out.println(longestPalindrome(s));
//     }
// }

// Peak index in a mountain array

// import java.util.Arrays;

// public class leetcodeq{
//     public static int peakIndexInMountainArray(int[] arr) {
//          Arrays.sort(arr);
//         int left = 0;
//         int right = arr.length - 1;
       
//         while(left < right){
//             int mid = (left + right) / 2;
//             if(arr[mid] < arr[right]){
//                 left = mid + 1;
                
//             }
//         }
//         return left;
//     }
//     public static void main(String[] args) {
//         int arr[] = {0,10,5,2};
//         System.out.println(peakIndexInMountainArray(arr));
//     }
// }

// Find first and last occurrence of a target value in a sorted array

// import java.util.Arrays;

// public class leetcodeq{
//     public int[] searchRange(int[] nums, int target) {
//         int left = findLeft(nums, target);
//         int right = findRight(nums, target);
//         return new int[]{left, right};
//     }

//     public int findLeft(int[] nums, int target) {
//         int index = -1;
//         int low = 0;
//         int high = nums.length - 1;
//         while(low <= high) {
//             int mid = low + (high - low) / 2;
//             if(nums[mid] == target) {
//                 index = mid;
//                 high = mid - 1;
//             } else if(nums[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return index;
//     }

//     public int findRight(int[] nums, int target) {
//         int index = -1;
//         int low = 0;
//         int high = nums.length - 1;
//         while(low <= high) {
//             int mid = low + (high - low) / 2;
//             if(nums[mid] == target) {
//                 index = mid;
//                 low = mid + 1;  
//             } else if(nums[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return index;
//     }


//     public void main(String[] args) {
//         int nums[] = {5,7,7,8,8,10};
//         int target = 8;
//         System.out.println(Arrays.toString(searchRange(nums, target)));
//     }
// }

// // product subarray less than k
// public class leetcodeq{
//     public static int numSubarrayProductLessThanK(int nums[], int k) {
//         int si = 0;
//         int ei = 0;
//         int ans = 0;
//         int p = 1;
//         while(ei < nums.length){
//             p = p * nums[ei];
            
//             while(p>=k && si <= ei){
//                 p = p / nums[si];
//                 si++;
//             }
//             ans += (ei - si + 1);
//             ei++;
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int nums[] = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
//         int k = 19;
//         System.out.println(numSubarrayProductLessThanK(nums, k));
//     }
// }

// Maximum average subarray 1
// public class leetcodeq{
//     public static double findMaxAverage(int[] nums, int k) {
//         double sum = 0;
//         double ans = 0;
//         double avg = 0;
//         for(int i=0;i<k;i++){
//             sum = sum + nums[i];
//         }
//         avg = sum / k;
//         ans = avg;
//         for(int i=k;i<nums.length;i++){
//             sum = sum + nums[i] ;
//             sum = sum - nums[i-k];
//             avg = sum / k;
//             ans = Math.max(ans, avg);
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int [] nums = {5};
//         int k = 1;
//         System.out.println(findMaxAverage(nums, k));
//     }
// }

// Sliding window maximum

// public class leetcodeq{
//     public static int[] maxSlidingWindow(int[] nums, int k) {
//         int [] result = new int [nums.length - k + 1];
//         int number = 0;
//         int ans = Integer.MIN_VALUE;
//         int maxans = 0;
//         for(int i= 0; i<k ; i++){
//             number = nums[i];
//             maxans = Math.max(ans, number);
//         }
//         result[0] = maxans;
//         for(int i=k ;i < nums.length ; i++){
//             ans = 0;
//             maxans = 0;
//         }
//     }

//     public static void main(String[] args) {
//         int nums [] = {1,3,-1,-3,5,3,6,7};
//         int k = 3;
//     }
// }

// public class leetcodeq{
//     public static int countPrimes(int n) {
//         int count = 0;
//         for(int i =2;i<=n;i++){
//             boolean isPrime = true;
//             for(int j=2;j*j<=i;j++){
//                 if(i%j == 0){
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if(isPrime){
//                 count++;
//             }
//         }
//         return count;   
//     }
//     public static void main(String[] args) {
//         int n = 2;
//         System.out.println(countPrimes(n));
//     }
// }

// public class leetcodeq {
//     public static int cntSubarray(int arr[] ,int k){
//         int count = 0;
//         for(int i =0 ;i < arr.length ; i++){
//             int sum = 0;
//             for(int j=i ; j<arr.length ; j++){
//                 sum+= arr[j];
//                 if(sum == k){
//                     count ++;
//                 }
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int arr [] = {9, 4, 20, 3, 10, 5};
//         int k = 33;
//         System.out.println(cntSubarray(arr, k));
//     }
// }


// import java.util.*;
// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int n [] = new int [nums.length ];
//         int square = 0;
//         for(int i = 0;i < nums.length;i++){
//             n[i] = nums[i] * nums[i];
            
//         }
//         Arrays.sort(n);
//         return n;
//     }
// }

// Maximum Product of Two Elements in an Array
// public class leetcodeq {
//     public static int maxProduct(int [] nums){
//         int product = 1;
//         int ans = Integer.MIN_VALUE;
//         for(int i =0 ; i<nums.length ;i++){

//             for(int j=i+1 ; j<nums.length ;j++){
//                 product = 1;
//                 product = product * ((nums[i] -1) * (nums[j] -  1));
//                 ans = Math.max(ans, product);
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int nums [] = {1,5,4,5};
//         System.out.println(maxProduct(nums));
//     }
// }

// public class leetcodeq  {
//     public static int findNumbers(int[] nums) {
//         int count =0;
//         for(int i=0 ;i<nums.length; i++){
//             int digits = 0;
//             int temp = nums[i];
//             while(temp > 0){
//                 temp = temp/10;
//                 digits++;
//             }
//             if(digits % 2 ==0){
//                 count ++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//       int [] nums = {555,901,482,1771};
//       System.out.println(findNumbers(nums));
//     }
// }

// reverse a word in a string
// public class leetcodeq {
//     public static String reverseWord(String s){
//         String word [] = s.trim(".").split(" +");
//         StringBuilder res = new StringBuilder();
//         for(int i=word.length-1;i>=0;i--){
//             res.append(word[i]);
//             if(i!=0) res.append("");
//         }
//         return res.toString();
//     }
//     public static void main(String[] args) {
//         String s = "..geeks..for.geeks.";
//         System.out.println(reverseWord(s));
//     }
// }

// Valid Paranthesis

// import java.util.ArrayList;
// import java.util.List;

// public class leetcodeq{
//     public static void Paranthesis(int n, int open, int close , String ans, List <String> ll){
//         if(open ==n && close ==n){
//             System.out.print(ans + " ");
//             return;
//         }
//         if(open < n){
//             Paranthesis(n, open+1, close, ans + "(", ll);
//         }
//         if(close < open){
//             Paranthesis(n, open, close + 1, ans + ")", ll);
//         }
//     }
//     public static void main(String[] args) {
//         List<String> ll = new ArrayList<>();
//         int n =3;
//         Paranthesis(n, 0, 0, "", ll);
//         System.out.println(ll);
//     }
// }

// import java.util.Arrays;

// public class leetcodeq {
//     public static int findDuplicate(int arr[]){
//         Arrays.sort(arr);
//         int i= 0;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i] == arr[j]){
//                     return arr[j];
//                 }
//                 i++;
//             }
        
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,3,4,2,2};
//         System.out.println(findDuplicate(arr));
//     }
// }

// Happy number 

// public class leetcodeq {
//     public static boolean isHappy(int n){
//         boolean ans = false;
//         int number = 0;
//         int previous = 0;
//         while(n>=0){
//             previous = number;
//             number = n / 10;
//             if(((number * number) + (previous*previous)) == 1){
//                 ans = true;
//                 n = (number * number) + (previous*previous);
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int n = 19;
//         System.out.println(isHappy(n));
//     }
// }

// Longest common prefix
// public class leetcodeq {
//     public static String longestCommonPrefix(String[] strs) {
//         if(strs == null || strs.length == 0) return "";
//         String prefix = strs[0];
//         for(int i= 1 ;i<strs.length;i++){
//             while(strs[i].indexOf(prefix)!=0){
//                 prefix = prefix.substring(0, prefix.length() -1);
//                 if(prefix.isEmpty()) return "";
//             }
//         }
//         return prefix;
//     }
//     public static void main(String[] args) {
//         String [] strs = {"flower","flow","flight"};
//         System.out.println(longestCommonPrefix(strs));
//     }
// }

//Power of two , three , four
// public class leetcodeq {
//     public static boolean isPowerof(int n){
        
//         if(n == 0){
//             return false;
//         }
//         while(n!=1){
//             if(n%2!=0){
//                 return false;
//             }else{
//                 n = n/2;
//             }
//         }
//         return true;
//     }
    
//     public static void main(String[] args) {
//         int n =16;
//         System.out.println(isPowerof(n));
//     }
// }

import java.util.Arrays;

/// Median of two sorted array

// public class leetcodeq {
//       public static double findMedianSortedArrays(int nums1[] , int nums2[] ){
//             int m = nums1.length;
//             int n = nums2.length;
//             int temp [] = new int[m+n];
//             int i = 0; // nums 1
//             int j = 0; // nums2
//             int k = 0; // temp
//             while(i < m && j < n ){
//                   if(nums1[i] < nums2[j]){
//                         temp[k++] = nums1[i++];
                        
//                   }else{
//                         temp[k++] = nums2[j++];
                        
//                   }
//             }
//             while(i < m){
//                   temp[k++] = nums1[i++];
                        
//             }
//             while(j < n){
//                   temp[k++] = nums2[j++];
                       
//             }
//             int size = m + n;
//             if(size % 2 == 1){
//                   return temp[size/2];
//             }else{
//                   return ((temp[size/2])+ (temp[(size/2) - 1]))/2.0;
//             }
//       }

//       public static void main(String[] args) {
//             int nums1 [] = {1,2};
//             int nums2 [] = {3,4};
//             System.out.println(findMedianSortedArrays(nums1, nums2));
//       }
// }

// public class leetcodeq {
//       public static void merge(int nums1[] ,int nums2[] , int m , int n){
//             int temp[] = new int[m+n];
//             int i = 0;
//             int j = 0;
//             int k = 0;
//             while(i < m && j < n){
//                   if(nums1[i] < nums2[j]){
//                         temp[k++] = nums1[i++];
//                   }else{
//                         temp[k++] = nums2[j++];
//                   }
//             }
//             while(i < m){
//                   temp[k++] = nums1[i++];
//             }
//             while(j < n){
//                   temp[k++] = nums2[j++];
//             }

           
//       }

      
//       public static void main(String[] args) {
//             int nums1 [] = {1,2,3,0,0,0};
//             int nums2 [] = {2,5,6};
//             int m = 3;
//             int n =3;
//       }
// }

public class leetcodeq {
      
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int m = g.length;
        int n = s.length;
        int i = 0;
        int j = 0;
        int count = 0;
        while(i<m && j<n){
            if(g[i] <= s[j]){
                count++;
                i++;
            }
            j++;
            
        }
        return count;
    }
      public static void main(String[] args) {
            int g [] = {10,9,8,7};
            int s [] = {5,6,7,8};
            System.out.println(findContentChildren(g, s));
      }
}