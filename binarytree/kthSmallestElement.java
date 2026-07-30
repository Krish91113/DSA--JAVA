// // // // import javax.swing.tree.TreeNode;

// // // // public class kthSmallestElement {
// // // //     static int ans;
// // // //     static int k2;

// // // //     public static void main(String[] args) {

    
// // // //     private static void inorder(TreeNode root){
// // // //         if(root == null) return;
// // // //         inorder(root.left);
// // // //         k2--;
// // // //         if(k2 == 0) ans= root.val;
// // // //         inorder(root.right);
// // // //     }
// // // //     public int kthSmallest(TreeNode root, int k) {
// // // //         k2=k;
// // // //         ans= -1;
// // // //         inorder(root);
// // // //         return ans;
// // // //     }

// // // //     }
// // // // }

// // // // class Solution {
// // // //     public List<List<Integer>> shiftGrid(int[][] grid, int k) {

// // // //         int m = grid.length;
// // // //         int n = grid[0].length;

// // // //         int total = m * n;

// // // //         k %= total;

// // // //         List<List<Integer>> ans = new ArrayList<>();

// // // //         for (int i = 0; i < m; i++) {
// // // //             List<Integer> row = new ArrayList<>();

// // // //             for (int j = 0; j < n; j++) {
// // // //                 row.add(0);
// // // //             }

// // // //             ans.add(row);
// // // //         }

// // // //         for (int i = 0; i < m; i++) {
// // // //             for (int j = 0; j < n; j++) {

// // // //                 int oldIndex = i * n + j;

// // // //                 int newIndex = (oldIndex + k) % total;

// // // //                 int newRow = newIndex / n;
// // // //                 int newCol = newIndex % n;

// // // //                 ans.get(newRow).set(newCol, grid[i][j]);
// // // //             }
// // // //         }

// // // //         return ans;
// // // //     }
// // // // }

// // // // import java.util.Arrays;

// // // // class Solution {
// // // //     // 1. Keep it non-static so it resets every test case
// // // //     private long[][] dp;

// // // //     public long solve(int i, int[] nums, int flag) {
// // // //         if (i >= nums.length) return 0;
// // // //         if (dp[i][flag] != -1) return dp[i][flag];
// // // //         long skip = solve(i + 1, nums, flag);
// // // //         long val = nums[i];
// // // //         if (flag == 0) { 
// // // //             val = -val;
// // // //         }
// // // //         long take = solve(i + 1, nums, 1 - flag) + val;
// // // //         return dp[i][flag] = Math.max(take, skip);
// // // //     }

// // // //     public long maxAlternatingSum(int[] nums) {
// // // //         int n = nums.length;
// // // //         dp = new long[n][2];         
// // // //         for (long[] row : dp) {
// // // //             Arrays.fill(row, -1);
// // // //         }        
// // // //         return solve(0, nums, 1); 
// // // //     }
// // // // }
// // // // class Solution {
// // // //     public int uniqueXorTriplets(int[] nums) {
// // // //         int n=nums.length;
// // // //         if(n==1 || n==2) return n;
// // // //         int ans =1;
// // // //         while(ans<=n){
// // // //             ans*=2;
// // // //         }
// // // //         return ans;
// // // //     }
// // // // }
// // // class Solution {
// // //     public int uniqueXorTriplets(int[] nums) {
// // //         int n=nums.length;
// // //         HashSet<Integer> s1 = new HashSet<>();
// // //         for(int i=0;i<n;i++){
// // //             for(int j=i;j<n;j++){
// // //                 s1.add(nums[i] ^ nums[j]);
// // //             }
// // //         }
// // //         HashSet<Integer> s2 = new HashSet<>();
// // //         for(int number : s1){
// // //             for(int j=0;j<n;j++){
// // //                 s2.add( number ^ nums[j]);
// // //             }
// // //         } 
// // //         return s2.size();
// // //     }
// // // }
// // // class Solution {
// // //     public int maxProduct(int n) {
// // //         char arr[] = Integer.toString(n).toCharArray();
// // //         Arrays.sort(arr);
// // //         int num1 = arr[arr.length - 1] - '0';
// // //         int num2 = arr[arr.length - 2] - '0';
        
// // //         return num1 * num2;
// // //     }
// // // }

// // class Solution {
// //     public String smallestPalindrome(String s) {
// //         int freq[]=new int[26];
// //         for(int i=0;i<s.length();i++){
// //             char ch = s.charAt(i);
// //             freq[ch- 'a']++;
// //         }
// //         StringBuilder leftHalf = new StringBuilder();
// //         char middleChar=0;
// //         for(int i=0;i<26;i++){
// //             char ch = (char) (i + 'a');
// //             int c=freq[i];
// //             if(c%2!=0){
// //                 middleChar=ch;
// //             }
// //             for(int j=0;j<c/2;j++){
// //                 leftHalf.append(ch);
// //             }
// //         }
// //         String rightHalf = new StringBuilder(leftHalf).reverse().toString();
// //         if(middleChar!=0){
// //             return leftHalf.toString() + middleChar+rightHalf;
// //         }else{
// //             return leftHalf.toString()+rightHalf;
// //         }
// //     }
// // }

// class Solution {
//     // Checks if the given array can be partitioned into two subsets
//     // such that the sum of elements in both subsets is equal
//     public boolean canPartition(int[] arr) {
//         int n = arr.length;

//         // Calculate total sum of the array
//         int totalSum = 0;
//         for (int num : arr) totalSum += num;

//         // If the sum is odd, partition into equal subsets is impossible
//         if (totalSum % 2 != 0)
//             return false;

//         int target = totalSum / 2;

//         // prev[sum] indicates if a subset with 'sum' is possible so far
//         boolean[] prev = new boolean[target + 1];
//         prev[0] = true; // sum = 0 is always possible

//         // Initialize with the first element
//         if (arr[0] <= target)
//             prev[arr[0]] = true;

//         // Iterate over all remaining elements
//         for (int i = 1; i < n; i++) {
//             // cur[sum] will store possibilities for current element
//             boolean[] cur = new boolean[target + 1];
//             cur[0] = true; // sum 0 always possible

//             for (int sum = 1; sum <= target; sum++) {
//                 // Option 1: Do not take current element
//                 boolean notTaken = prev[sum];

//                 // Option 2: Take current element if it fits
//                 boolean taken = false;
//                 if (arr[i] <= sum)
//                     taken = prev[sum - arr[i]];

//                 // Current sum possible if either option is true
//                 cur[sum] = notTaken || taken;
//             }

//             // Move to the next element
//             prev = cur;
//         }

//         // Final answer is whether target sum is possible
//         return prev[target];
//     }
// }