// public class slidingwindow {
//     public static int subarraysumlargest(int arr[],  int k) {
//         int sum = 0;
//         int ans = Integer.MIN_VALUE;
//         for(int i=0;i<k;i++){
//             sum+=arr[i];
//         }
//         ans = sum;
//         for(int i=k;i<arr.length;i++){
//             sum+=arr[i];
//             sum-=arr[i-k];
//             ans = Math.max(ans, sum);
//         }
//         return ans;
//     }
//         public static void main(String[] args) {
//             int arr [] = {2,1,3,4,5,1,3,7,8,4,1};
//             int k = 3;
//             System.out.println(subarraysumlargest(arr, k));
//         }   
// }

// product subarray less than k
// public class slidingwindow{
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

public class slidingwindow {

    public static void main(String[] args) {
        int n = 0;
        int ans = (int) Math.pow(2, n);
        System.out.println(ans);
    }
}