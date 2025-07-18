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
//         int nums[] ={9,6,4,2,3,5,7,0,1};
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


public class leetcodeq {
    public static int checkPerfectSquare(int N) {
        long start = 1;
        long end = N;
        int ans = 0;
        while(start<=end){
            long mid = (start + end)/2;
            long sqr = (mid * mid);
            if(sqr == N){
                ans = 1;
                return ans;
            }else if(sqr>N){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int N = 16;
        System.out.println(checkPerfectSquare(N));
    }
}