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
public class leetcodeq {
    public static int maxSubArray(int nums[],int target){
        int currSum = 0;
        int maxSubseq = 0;
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
                int end = j;
               for(int k= start;k<=end;k++){
                currSum = currSum + nums[k];
                if(currSum < target){
                    maxSubseq++;
               }
             }   
            }
        }
        return maxSubseq;
    }
    public static void main(String[] args) {
        int nums [] ={3,5,6,7};
        int target = 9;
        System.out.println(maxSubArray(nums,target));
    }
}