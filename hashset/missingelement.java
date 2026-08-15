// // // class Solution {
// // //     public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
// // //         ArrayList<Integer> li = new ArrayList<>();
// // //         TreeSet<Integer> set =new TreeSet<>();
// // //         for(int i=low;i<=high;i++){
// // //             set.add(i);
// // //         }
// // //         for(int j=0;j<arr.length;j++){
// // //             if(set.contains(arr[j])){
// // //                 set.remove(arr[j]);
// // //             }
// // //         }
// // //         for(int ele:set){
// // //             li.add(ele);
// // //         }
// // //         return li;
// // //     }
// // // }
// // // //happy number
// // // class Solution {
// // //     public static int nextNumber(int n){
// // //         int ans=0;
// // //         while(n > 0){
// // //             int rem = n % 10;
// // //             ans+=(rem*rem);
// // //             n/=10;
// // //         }
// // //         return ans;
// // //     }
// // //     public boolean isHappy(int n) {
// // //         Set<Integer> set=new HashSet<>();
// // //         while(!set.contains(n)){
// // //             set.add(n);
// // //             n=nextNumber(n);
// // //             if(n == 1) return true;
// // //         }
// // //         return false;
// // //     }
// // // }
// // // class Solution {
// // //     public int countMajoritySubarrays(int[] nums, int target) {
// // //         HashMap<Integer,Integer> map = new HashMap<>();
// // //         int c=0;
// // //         int n=nums.length;
// // //         int maj_element=0;
// // //         for(int i=0;i<n;i++){
// // //             for(int j=i;j<n;j++){
// // //                 int sub = j-i+1;
// // //                 if(nums[j]==target){
// // //                     map.put(nums[j],map.getOrDefault(nums[j],0)+1);
// // //                     maj_element=map.get(nums[j]);
// // //                 }
// // //                 if(2*(maj_element) > sub) c++;
// // //             }
// // //             maj_element=0;
// // //             map.clear();
// // //         }
// // //         return c;
// // //     }
// // // }

// // // class Solution {
// // //     public static boolean solve(int n, int dp[]){
// // //         if(n==0) return false;
// // //         if(dp[n] != -1) return dp[n]==1?true:false;
// // //         for(int k=1;k*k<=n;k++){
// // //             if(solve(n-(k*k), dp) == false){
// // //                 dp[n]=1;
// // //                 return true;
// // //             }
// // //         }
// // //         return false;
// // //     }
// // //     public boolean winnerSquareGame(int n) {
// // //         int dp[]=new int[n+1];
// // //         Arrays.fill(dp, -1);
// // //         return solve(n,dp);
// // //     }
// // // }

// // // class Solution {
// // //     public static boolean isExist(HashSet<Integer> set, int n){
// // //         if(set.contains(n)){
// // //             return true;
// // //         }
// // //         return false;
// // //     }
// // //     public int missingInteger(int[] nums) {
// // //         HashSet<Integer> set=new HashSet<>();
// // //         set.add(nums[0]);
// // //         int j=1;
// // //         int prev=nums[0];
// // //         int sum=nums[0];
// // //         int n=nums.length;
// // //         while(j<n){
// // //             set.add(nums[j]);
// // //             if((prev+1) == nums[j]){
// // //                 prev=nums[j];
// // //                 sum+=prev;
// // //             }else{
// // //                 break;
// // //             }
// // //             j++;
// // //         }
// // //         while(j<n){
// // //         set.add(nums[j]);
// // //         j++;
// // //         } 
// // //         int ans=0;
// // //         for(int k=sum;k<=1275;k++){
// // //             if(!isExist(set,k)){
// // //                 ans= k;
// // //                 break;
// // //             }
// // //         }
// // //         return ans;
// // //     }
// // // }

// // import java.util.HashMap;
// // import java.util.Map;

// // class Solution {
// //     public int maxSubarrayLength(int[] nums, int k) {
// //         Map<Integer, Integer> map = new HashMap<>();
// //         int i = 0, j = 0;
// //         int n = nums.length;
// //         int maxLen = 0;
// //         while (j < n) {
// //             map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
// //             while (map.get(nums[j]) > k) {
// //                 int leftVal = map.get(nums[i]);
// //                 if (leftVal == 1) {
// //                     map.remove(nums[i]);
// //                 } else {
// //                     map.put(nums[i], leftVal - 1);
// //                 }
// //                 i++; 
// //             }
// //             maxLen = Math.max(maxLen, j - i + 1);
// //             j++;
// //         }
        
// //         return maxLen;
// //     }
// // }

// import java.util.*;

// class Solution {

//     public static boolean isFollow(int i, int j, String s) {
//         HashMap<Character, Integer> map = new HashMap<>();

//         for (int k = i; k <= j; k++) {
//             char ch = s.charAt(k);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);

//             if (map.get(ch) > 2) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public int maximumLengthSubstring(String s) {
//         int maxLen = 0;

//         for (int i = 0; i < s.length(); i++) {
//             for (int j = i; j < s.length(); j++) {
//                 if (isFollow(i, j, s)) {
//                     maxLen = Math.max(maxLen, j - i + 1);
//                 } else {
//                     break;
//                 }
//             }
//         }

//         return maxLen;
//     }
// }

class Solution {
    public int elevatorRequests(int n, int[] requests) {
         int ans=requests[0];
        for(int i=1;i<requests.length;i++){
            int diff=Math.abs(requests[i]-requests[i-1]);
            ans+=diff;
        }
        return ans;
    }
}