// // // import java.util.*;
// // // public class operators {
// // // //     public static void main (String args[]){
// // // //     Scanner sc = new Scanner(System.in);
// // // //     int a = sc.nextInt();
// // // //     int b = sc.nextInt();
// // // //     System.out.println("add = " + (a+b));
// // // //     System.out.println("Multiply = " + (a*b));
// // // //     System.out.println("subtract = " + (a-b));
// // // //     System.out.println("Divide = " + (a/b));
// // // //     System.out.println("Modulus = " + (a %b));
// // // // }
// // // // public static int twoSums(int arr[] ,int target){
// // // //     int sums = 0;
// // // //     int index = 0;
// // // //     for(int i =0 ; i<arr.length;i++){
// // // //         index = i;
// // // //         sums = sums + arr[i];
// // // //         if(sums == target){
// // // //           System.out.println(i);
// // // //         }
// // // //     }
// // // //     return sums;
// // // // }
// // // // public static void main(String[] args) {
// // // //     int arr[] = {2,7,11,15};
// // // //     int target = 9;
// // // //     twoSums(arr, target);
// // // // }
// // // // 



// // //     public static boolean validMountainArray(int[] arr) {
// // //         int i=0,n=arr.length;
// // //         while(i+1 < n && arr[i]<arr[i+1]){
// // //             i++;
// // //         }
// // //         if(i==0||i==n-1){
// // //             return false;
// // //         }
// // //         while(i+1<n && arr[i]>arr[i+1]){
// // //             i++;
// // //         }
// // //         return i==n-1;
// // //     }
// // //     public static void main(String[] args) {
// // //         int arr[] = {0,3,2,1};
// // //         System.out.println(validMountainArray(arr));
// // //     }
// // // }

// // // public class operators{

// // //     public static int thirdMax(int[] nums) {
// // //         long firstmax=Long.MIN_VALUE;   //consider long min
// // //         long secmax=Long.MIN_VALUE;
// // //         long thirdmax=nums[0];
// // //        // if(nums.length==2){return Math.max(nums[0],nums[1]);} //if no thirdmin return max
// // //        // if(nums.length==1){return nums[0];} //last wale m handle hogya dono edgecase
// // //       for(int i=0;i<nums.length;i++){
// // //         if(nums[i]>firstmax){ //if got ele greater than 1rd update sec and third as well 
// // //             thirdmax=secmax;
// // //             secmax=firstmax;
// // //             firstmax=nums[i];
// // //         }
// // //         else if(nums[i]>secmax &&nums[i]<firstmax){ //if got ele big than sec update third ele
// // //             thirdmax=secmax;
// // //             secmax=nums[i];


// // //         }
// // //         else if(nums[i]>thirdmax && nums[i]<secmax){
// // //             thirdmax=nums[i]; //if any new ele smaller than sec but bigger than third update third
// // //         }

// // //       } 
// // //       if(thirdmax==Long.MIN_VALUE || secmax==Long.MIN_VALUE){return (int)firstmax;} //edge if no third  return firstmax
// // //       return (int)thirdmax;
// // //     }

// // //     public static void main(String[] args) {
// // //         int[] nums = {3, 2, 1};
// // //         System.out.println(thirdMax(nums));  // Output: 1

// // //         int[] nums2 = {1, 2};
// // //         System.out.println(thirdMax(nums2));  // Output: 2

// // //         int[] nums3 = {2, 2, 3, 1};
// // //         System.out.println(thirdMax(nums3));  // Output: 1
// // //     }
// // // }

// // // public class operators{

// // //     public static int countOperations(int num1, int num2) 
// // //     {
// // //         int res = 0;
// // //         while (num1 != 0 && num2 != 0) 
// // //         {
// // //             res += num1 / num2;
// // //             num1 %= num2;
// // //             int temp = num1;
// // //             num1 = num2;
// // //             num2 = temp;
// // //         }
// // //         return res;
// // //     }

// // //     public static void main(String[] args) {
// // //         int num1=2;
// // //         int num2=3;
// // //         System.out.println(countOperations(num1,num2));
// // //     }
// // // }

// // public class operators{

// //     // public static int minOperations(int[] nums) {
// //     //     var stack = new int[nums.length + 1];
// //     //     var top = 0;
// //     //     var ans = 0;
// //     //     for (var i = 0; i < nums.length; i++) {
// //     //         while (stack[top] > nums[i]) {
// //     //             top--;
// //     //             ans++;
// //     //         }
// //     //         if (stack[top] != nums[i])
// //     //             stack[++top] = nums[i];
// //     //     }
// //     //     return ans + top;
// //     // }

// //     // public static void main(String[] args) {
// //     //     int nums[] = {0,2};
// //     //     System.out.println(minOperations(nums));
// //     // }

    
// //     // public static int findMaxForm(String[] S, int M, int N) {
// //     //     int[][] dp = new int[M+1][N+1];
// //     //     for (String str : S) {
// //     //         int zeros = 0, ones = 0;
// //     //         for (char c : str.toCharArray())
// //     //             if (c == '0') zeros++;
// //     //             else ones++;
// //     //         for (int i = M; i >= zeros; i--)
// //     //             for (int j = N; j >= ones; j--)
// //     //                 dp[i][j] = Math.max(dp[i][j], dp[i-zeros][j-ones] + 1);
// //     //     }
// //     //     return dp[M][N];
// //     // }
// //     // public static void main(String[] args) {
// //     //    String strs []= {"10","0001","111001","1","0"};
// //     //    int M = 5, N= 3;
// //     //    System.out.println(findMaxForm(strs,M,N));
// //     // }

// //     public static int minOperations(int[] nums) {
// //         int n = nums.length;
// //         int num1 = 0;
// //         int g = 0;
// //         for (int x : nums) {
// //             if (x == 1) {
// //                 num1++;
// //             }
// //             g = gcd(g, x);
// //         }
// //         if (num1 > 0) {
// //             return n - num1;
// //         }
// //         if (g > 1) {
// //             return -1;
// //         }

// //         int minLen = n;
// //         for (int i = 0; i < n; i++) {
// //             int currentGcd = 0;
// //             for (int j = i; j < n; j++) {
// //                 currentGcd = gcd(currentGcd, nums[j]);
// //                 if (currentGcd == 1) {
// //                     minLen = Math.min(minLen, j - i + 1);
// //                     break;
// //                 }
// //             }
// //         }
// //         return minLen + n - 2;
// //     }

// //     private static int gcd(int a, int b) {
// //         while (b != 0) {
// //             int temp = b;
// //             b = a % b;
// //             a = temp;
// //         }
// //         return a;
// //     }
// //     public static void main(String[] args) {
// //         int nums[]={2,6,3,4};
// //         System.out.println(minOperations(nums));
// //     }
// // }

// public class operators{
    
//     public static int numberOfSubstrings(String p) {
//         int n = p.length();
//         int[] pre = new int[n + 1];
//         pre[0] = -1;
//         for (int i = 0; i < n; i++) {
//             if (i == 0 || (i > 0 && p.charAt(i - 1) == '0')) {
//                 pre[i + 1] = i;
//             } else {
//                 pre[i + 1] = pre[i];
//             }
//         }
//         int res = 0;
//         for (int i = 1; i <= n; i++) {
//             int cnt0 = s.charAt(i - 1) == '0' ? 1 : 0;
//             int j = i;
//             while (j > 0 && cnt0 * cnt0 <= n) {
//                 int cnt1 = (i - pre[j]) - cnt0;
//                 if (cnt0 * cnt0 <= cnt1) {
//                     res += Math.min(j - pre[j], cnt1 - cnt0 * cnt0 + 1);
//                 }
//                 j = pre[j];
//                 cnt0++;
//             }
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         String p = "00011";
//         System.out.println(numberOfSubstrings(s));
//     }
// } 
import java.util.*;
public class operators{
   
    public static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                original=2*original;
            }
        }
        return original;
    }
        public static void main(String[] args) {
        int nums[] = {5,3,6,1,12};
        int original = 3;
        System.out.println(findFinalValue(nums,original));
    }
}