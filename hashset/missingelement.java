// // // // // // // class Solution {
// // // // // // //     public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
// // // // // // //         ArrayList<Integer> li = new ArrayList<>();
// // // // // // //         TreeSet<Integer> set =new TreeSet<>();
// // // // // // //         for(int i=low;i<=high;i++){
// // // // // // //             set.add(i);
// // // // // // //         }
// // // // // // //         for(int j=0;j<arr.length;j++){
// // // // // // //             if(set.contains(arr[j])){
// // // // // // //                 set.remove(arr[j]);
// // // // // // //             }
// // // // // // //         }
// // // // // // //         for(int ele:set){
// // // // // // //             li.add(ele);
// // // // // // //         }
// // // // // // //         return li;
// // // // // // //     }
// // // // // // // }
// // // // // // // //happy number
// // // // // // // class Solution {
// // // // // // //     public static int nextNumber(int n){
// // // // // // //         int ans=0;
// // // // // // //         while(n > 0){
// // // // // // //             int rem = n % 10;
// // // // // // //             ans+=(rem*rem);
// // // // // // //             n/=10;
// // // // // // //         }
// // // // // // //         return ans;
// // // // // // //     }
// // // // // // //     public boolean isHappy(int n) {
// // // // // // //         Set<Integer> set=new HashSet<>();
// // // // // // //         while(!set.contains(n)){
// // // // // // //             set.add(n);
// // // // // // //             n=nextNumber(n);
// // // // // // //             if(n == 1) return true;
// // // // // // //         }
// // // // // // //         return false;
// // // // // // //     }
// // // // // // // }
// // // // // // // class Solution {
// // // // // // //     public int countMajoritySubarrays(int[] nums, int target) {
// // // // // // //         HashMap<Integer,Integer> map = new HashMap<>();
// // // // // // //         int c=0;
// // // // // // //         int n=nums.length;
// // // // // // //         int maj_element=0;
// // // // // // //         for(int i=0;i<n;i++){
// // // // // // //             for(int j=i;j<n;j++){
// // // // // // //                 int sub = j-i+1;
// // // // // // //                 if(nums[j]==target){
// // // // // // //                     map.put(nums[j],map.getOrDefault(nums[j],0)+1);
// // // // // // //                     maj_element=map.get(nums[j]);
// // // // // // //                 }
// // // // // // //                 if(2*(maj_element) > sub) c++;
// // // // // // //             }
// // // // // // //             maj_element=0;
// // // // // // //             map.clear();
// // // // // // //         }
// // // // // // //         return c;
// // // // // // //     }
// // // // // // // }

// // // // // // // class Solution {
// // // // // // //     public static boolean solve(int n, int dp[]){
// // // // // // //         if(n==0) return false;
// // // // // // //         if(dp[n] != -1) return dp[n]==1?true:false;
// // // // // // //         for(int k=1;k*k<=n;k++){
// // // // // // //             if(solve(n-(k*k), dp) == false){
// // // // // // //                 dp[n]=1;
// // // // // // //                 return true;
// // // // // // //             }
// // // // // // //         }
// // // // // // //         return false;
// // // // // // //     }
// // // // // // //     public boolean winnerSquareGame(int n) {
// // // // // // //         int dp[]=new int[n+1];
// // // // // // //         Arrays.fill(dp, -1);
// // // // // // //         return solve(n,dp);
// // // // // // //     }
// // // // // // // }

// // // // // // // class Solution {
// // // // // // //     public static boolean isExist(HashSet<Integer> set, int n){
// // // // // // //         if(set.contains(n)){
// // // // // // //             return true;
// // // // // // //         }
// // // // // // //         return false;
// // // // // // //     }
// // // // // // //     public int missingInteger(int[] nums) {
// // // // // // //         HashSet<Integer> set=new HashSet<>();
// // // // // // //         set.add(nums[0]);
// // // // // // //         int j=1;
// // // // // // //         int prev=nums[0];
// // // // // // //         int sum=nums[0];
// // // // // // //         int n=nums.length;
// // // // // // //         while(j<n){
// // // // // // //             set.add(nums[j]);
// // // // // // //             if((prev+1) == nums[j]){
// // // // // // //                 prev=nums[j];
// // // // // // //                 sum+=prev;
// // // // // // //             }else{
// // // // // // //                 break;
// // // // // // //             }
// // // // // // //             j++;
// // // // // // //         }
// // // // // // //         while(j<n){
// // // // // // //         set.add(nums[j]);
// // // // // // //         j++;
// // // // // // //         } 
// // // // // // //         int ans=0;
// // // // // // //         for(int k=sum;k<=1275;k++){
// // // // // // //             if(!isExist(set,k)){
// // // // // // //                 ans= k;
// // // // // // //                 break;
// // // // // // //             }
// // // // // // //         }
// // // // // // //         return ans;
// // // // // // //     }
// // // // // // // }

// // // // // // import java.util.HashMap;
// // // // // // import java.util.Map;

// // // // // // class Solution {
// // // // // //     public int maxSubarrayLength(int[] nums, int k) {
// // // // // //         Map<Integer, Integer> map = new HashMap<>();
// // // // // //         int i = 0, j = 0;
// // // // // //         int n = nums.length;
// // // // // //         int maxLen = 0;
// // // // // //         while (j < n) {
// // // // // //             map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
// // // // // //             while (map.get(nums[j]) > k) {
// // // // // //                 int leftVal = map.get(nums[i]);
// // // // // //                 if (leftVal == 1) {
// // // // // //                     map.remove(nums[i]);
// // // // // //                 } else {
// // // // // //                     map.put(nums[i], leftVal - 1);
// // // // // //                 }
// // // // // //                 i++; 
// // // // // //             }
// // // // // //             maxLen = Math.max(maxLen, j - i + 1);
// // // // // //             j++;
// // // // // //         }
        
// // // // // //         return maxLen;
// // // // // //     }
// // // // // // }

// // // // // import java.util.*;

// // // // // class Solution {

// // // // //     public static boolean isFollow(int i, int j, String s) {
// // // // //         HashMap<Character, Integer> map = new HashMap<>();

// // // // //         for (int k = i; k <= j; k++) {
// // // // //             char ch = s.charAt(k);
// // // // //             map.put(ch, map.getOrDefault(ch, 0) + 1);

// // // // //             if (map.get(ch) > 2) {
// // // // //                 return false;
// // // // //             }
// // // // //         }

// // // // //         return true;
// // // // //     }

// // // // //     public int maximumLengthSubstring(String s) {
// // // // //         int maxLen = 0;

// // // // //         for (int i = 0; i < s.length(); i++) {
// // // // //             for (int j = i; j < s.length(); j++) {
// // // // //                 if (isFollow(i, j, s)) {
// // // // //                     maxLen = Math.max(maxLen, j - i + 1);
// // // // //                 } else {
// // // // //                     break;
// // // // //                 }
// // // // //             }
// // // // //         }

// // // // //         return maxLen;
// // // // //     }
// // // // // }

// // // // class Solution {
// // // //     public int elevatorRequests(int n, int[] requests) {
// // // //          int ans=requests[0];
// // // //         for(int i=1;i<requests.length;i++){
// // // //             int diff=Math.abs(requests[i]-requests[i-1]);
// // // //             ans+=diff;
// // // //         }
// // // //         return ans;
// // // //     }
// // // // }
// // // class Solution {
// // //     public int nearestDrone(int[][] drones, int[] target) {
// // //        int ans=Integer.MAX_VALUE;
// // //         int prev=Integer.MAX_VALUE;
// // //         int n=drones[0].length;
// // //         for(int i=0;i<drones.length;i++){
// // //             int manh=0;
// // //             for(int j=0;j<drones[0].length-1;j++){
// // //                 manh+=Math.abs(drones[i][j]-target[j]);
// // //             }
// // //             int range=drones[i][n-1];
// // //             if(manh<=range && manh<prev){
// // //                 prev=manh;
// // //                 ans=i;
// // //             }
// // //         }
// // //         return ans==Integer.MAX_VALUE?-1:ans;
// // //     }
// // // }
// // import java.util.Arrays;

// // class Solution {
// //     public int solve(int l, int r, int cum[], int dp[][]) {
// //         if (l >= r) return 0;
// //         if (dp[l][r] != -1) return dp[l][r];
        
// //         int score = 0;
// //         // mid goes from l to r - 1
// //         for (int mid = l; mid < r; mid++) {
// //             int leftSum = cum[mid] - (l - 1 >= 0 ? cum[l - 1] : 0);
// //             int rightSum = cum[r] - cum[mid];
            
// //             if (leftSum < rightSum) {
// //                 score = Math.max(score, leftSum + solve(l, mid, cum, dp));
// //             } else if (leftSum > rightSum) {
// //                 score = Math.max(score, rightSum + solve(mid + 1, r, cum, dp));
// //             } else {
// //                 int leftChoice = leftSum + solve(l, mid, cum, dp);
// //                 int rightChoice = rightSum + solve(mid + 1, r, cum, dp);
// //                 score = Math.max(score, Math.max(leftChoice, rightChoice));
// //             }
// //         }
// //         return dp[l][r] = score;
// //     }

// //     public int stoneGameV(int[] stoneValue) {
// //         int n = stoneValue.length;
// //         int cum[] = new int[n];
// //         cum[0] = stoneValue[0];
// //         for (int i = 1; i < n; i++) {
// //             cum[i] = stoneValue[i] + cum[i - 1];
// //         }
        
// //         int dp[][] = new int[n][n];
// //         for (int i = 0; i < n; i++) {
// //             Arrays.fill(dp[i], -1);
// //         }
        
// //         return solve(0, n - 1, cum, dp);
// //     }
// // }
// class Solution {
//     public int largestInteger(int[] nums, int k) {
//         int freq[]=new int[50];
//         int n=nums.length;
//         for(int num:nums){
//             freq[num]++;
//         }
//         if(k == n){
//             int max=Integer.MIN_VALUE;
//             for(int num : nums) max=Math.max(max,num);
//             return max;
//         }
//         if(k == 1){
//             int ans=-1;
//             for(int num : nums){
//                 if(freq[num] == 1){
//                     ans=Math.max(ans,num);
//                 }
//             }
//             return ans;
//         }
//         int candidate1 = (freq[nums[0]] == 1) ? nums[0] : -1;
//         int candidate2 = (freq[nums[n - 1]] == 1) ? nums[n - 1] : -1;
//         return Math.max(candidate1, candidate2);
//     }
// }
class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,Set<Integer>> map=new HashMap<>();
        for(int seat[] : reservedSeats){
            int row=seat[0];
            int col=seat[1];
            if(!map.containsKey(row)){
                map.put(row,new HashSet<>());
            }
            map.get(row).add(col);
        }
        int ans=2*n;
        for(int row : map.keySet()){
            Set<Integer> reserve=map.get(row);
            boolean left=!reserve.contains(2) && !reserve.contains(3) && !reserve.contains(4) && !reserve.contains(5);
            boolean mid=!reserve.contains(4) && !reserve.contains(5) && !reserve.contains(6) && !reserve.contains(7);
            boolean right=!reserve.contains(6) && !reserve.contains(7) && !reserve.contains(8) && !reserve.contains(9) ;

            if(left && right){

            }else if(left || right || mid){
                ans--;
            }else{
                ans-=2;
            }
        }   
        
        return ans;
    }
}