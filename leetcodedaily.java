// // r21// // // // public class leetcodedaily {
// // // // // //     public static int findClosest(int x,int y, int z){
// // // // // //         int distance1=Math.abs(x-z);
// // // // // //         int distance2=Math.abs(y-z);
// // // // // //         if(distance1 == distance2){
// // // // // //             return 0;
// // // // // //         }
// // // // // //         else if(distance1 < distance2){
// // // // // //             return 1;
// // // // // //         }else{
// // // // // //             return 2;
// // // // // //         }
// // // // // //     }
// // // // // //     public static void main(String[] args) {
// // // // // //         int x=2;
// // // // // //         int y=7;
// // // // // //         int z=4;
// // // // // //         System.out.println(findClosest(x,y,z));
// // // // // //     }
// // // // // // }

// // // // // // count element with max frequency

// // // // // public class leetcodedaily {
// // // // //     public static int maxFrequencyElements(int[] nums) {
// // // // //         int[] freq = new int[101];
// // // // //         int maxFreq = 0;
// // // // //         for(int i : nums){
// // // // //             freq[i]++;
// // // // //             maxFreq = Math.max(maxFreq, freq[i]);
// // // // //         }
// // // // //         int ans=0;
// // // // //         for(int i : freq){
// // // // //             if(i == maxFreq) ans += i;
// // // // //         }
// // // // //     return ans;
// // // // //     }

// // // // //     public static void main(String[] args) {
// // // // //         int arr[]={1,2,2,3,3,3,4,4,4,4};
// // // // //         System.out.println(maxFrequencyElements(arr));
// // // // //     }
// // // // // }

// // // import java.util.ArrayList;
// // // import java.util.Collections;
// // // import java.util.List;

// // // public class leetcodedaily{
// // // //     public static int swimInWater(int[][] grid) {
// // // //         int m = grid.length, n = grid[0].length;
// // // //         List<int[]> edges = new ArrayList<>();
        
// // // //         for (int i = 0; i < m; i++) {
// // // //             for (int j = 0; j < n; j++) {
// // // //                 if (i > 0)
// // // //                     edges.add(new int[]{Math.max(grid[i][j], grid[i-1][j]), i*n+j, (i-1)*n+j});
// // // //                 if (j > 0)
// // // //                     edges.add(new int[]{Math.max(grid[i][j], grid[i][j-1]), i*n+j, i*n+j-1});
// // // //             }
// // // //         }
        
// // // //         Collections.sort(edges, (a, b) -> a[0] - b[0]);
// // // //         int[] parent = new int[m * n];
// // // //         for (int i = 0; i < m * n; i++) parent[i] = i;
        
// // // //         for (int[] edge : edges) {
// // // //             // Error fix: calls to union and find now resolve because they are static
// // // //             union(parent, edge[1], edge[2]);
// // // //             if (find(parent, 0) == find(parent, m*n-1))
// // // //                 return edge[0];
// // // //         }
// // // //         return grid[0][0];
// // // //     }
    
// // // //     // ✅ Added 'static' keyword here
// // // //     private static int find(int[] parent, int x) {
// // // //         if (parent[x] != x)
// // // //             parent[x] = find(parent, parent[x]);
// // // //         return parent[x];
// // // //     }
    
// // // //     // ✅ Added 'static' keyword here
// // // //     private static void union(int[] parent, int x, int y) {
// // // //         parent[find(parent, x)] = find(parent, y);
// // // //     }

// // // //     public static void main(String[] args) {
// // // //         // NOTE: The example array for grid has an issue with the last row's length (5 elements)
// // // //         // compared to others (4 elements). I've corrected the array structure below
// // // //         // assuming a 6x4 grid as implied by the rest of the code logic.
// // // //         int grid [][] = {{0,1,2,3},{4,24,23,22},{21,5,12,13},{14,15,16,11},{17,18,19,20},{10,9,8,7}}; // Fixed 6th row to have 4 elements (removed '6')
// // // //         System.out.println(swimInWater(grid));
// // // //     }
// // // // }

// // //     public static int[] avoidFlood(int[] rains) {
// // //         int n= rains.length;
// // //         int[] ans= new int[n];
// // //         Map<Integer, Integer> last_rain= new HashMap<>();
// // //         int def= 5;
// // //         TreeSet<Integer> dry_days= new TreeSet<>();
// // //         for(int i=0; i<n; i++){
// // //             int lake= rains[i];
// // //             if(lake==0){
// // //                 dry_days.add(i);
// // //                 ans[i]= def;
// // //             }else{
// // //                 ans[i]= -1;
// // //                 if(last_rain.containsKey(lake)){
// // //                     Integer day= dry_days.higher(last_rain.get(lake));
// // //                     //next dry day of last_rain.get(lake)
// // //                     //[2 , 3, 4, 5, 9, 10]
// // //                     //6
// // //                     if(day==null) return new int[0];
// // //                     ans[day]= lake;
// // //                     dry_days.remove(day);
// // //                 }
// // //                 last_rain.put(lake, i);
// // //             }
// // //         }
// // //         return ans;
// // //     }
// // //     public static void main(String[] args) {
// // //         int rains[]={1,2,0,1,2};
// // //         System.out.println(avoidFlood(rains));
// // //     }
// // // }

// // // import java.util.Arrays;

// // // public class leetcodedaily{
// // //     public static int[] successfulPairs(int[] spells, int[] potions, long success) {
// // //         Arrays.sort(potions);
// // //         int n = spells.length;
// // //         int ans[] = new int[n];

// // //         for (int i = 0; i < n; i++) {
// // //             int idx = bs(potions, spells[i], success);
// // //             if (idx != -1) ans[i] = potions.length - idx;
// // //         }

// // //         return ans;
// // //     }

// // //     public static int bs(int potions[], long strength, long success) {
// // //         int low = 0, high = potions.length - 1, idx = -1;
// // //         while (low <= high) {
// // //             int mid = low + (high - low) / 2;
// // //             if ((long) potions[mid] * strength >= success) {
// // //                 idx = mid;
// // // //                 high = mid - 1; // find smaller index
// // // //             } else {
// // // //                 low = mid + 1;
// // // //             }
// // // //         }
// // // //         return idx;
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         int spells[] ={5,1,3};
// // // //         int potions[] ={1,2,3,4,5};
// // // //         int success = 7;
// // // //         System.out.println(successfulPairs(spells, potions, success));
// // // //     }
// // // // }

// // // import java.util.ArrayList;
// // // import java.util.Arrays;
// // // import java.util.List;

// // // public class leetcodedaily {
// // //     public static List<String> removeAnagrams(String[] words) {
// // //         List<String> ans = new ArrayList<>();
// // //         ans.add(words[0]);
// // //         for(int i=1;i<words.length;i++){
// // //             char [] a = wor1ds[i].toCharArray(),b=ans.get(ans.size()-1).toCharArray();
// // //             Arrays.sort(a);
// // //             Arrays.sort(b);
// // //             if(!Arrays.equals(a,b)){
// // //                 ans.add(words[i]);
// // //             }
// // //         }
// // //         return ans;
// // //     }
// // //     public static void main(String[] args) {
// // //         String[] words = {"abba","baba","bbaa","cd","cd"};
// // //         System.out.println(removeAnagrams(words));
// // //     }
// // // }

// // import java.util.List;

// // public class leetcodedaily{
// //     public static int maxIncreasingSubarrays(List<Integer> nums) {
// //         int n = nums.size();
// //         int prevRun = 0;
// //         int curr = 1;
// //         int K = 0;

// //         for (int i = 1; i < n; i++) {
// //             if (nums.get(i) > nums.get(i - 1)) {
// //                 curr++;
// //             } else {
// //                 prevRun = curr;
// //                 curr = 1;
// //             }
// //             K = Math.max(K, curr / 2);
// //             K = Math.max(K, Math.min(curr, prevRun));
// //         }
// //         return K;
// //     }

// //     public static void main(String[] args) {
// //         int nums[] = {2,5,7,8,9,2,3,4,3,1};
// //         System.out.println(maxIncreasingSubarrays(nums));
// //     }
// // }[[[[[=]q]]]]


// public class leetcodedaily{
//     public static int findSmallestInteger(int[] nums, int value) {
//         int n = nums.length, res = 0;
//         int[] rem = new int[value];
//         for (int x : nums) {
//             int r = ((x % value) + value) % value;
//             rem[r]++;
//         }
//         while (rem[res % value]-- > 0) res++;
//         return res;
//     }
//     public static void main(String[] args) {
//         int nums[] = {1,-10,7,13,6,8};
//         int value = 5;
//         System.out.println(findSmallestInteger(nums, value));
//     }
// }

// import java.util.Arrays;
// public class leetcodedaily{
//     public static int maxDistinctElements(int[] nums, int k) {
//         Arrays.sort(nums);
//         int ans = 0, prev = (int)-1e9;

//         for (int x : nums) {
//             int l = Math.max(x - k, prev + 1);
//             if (l <= x + k) {
//                 prev = l;
//                 ans++;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int nums[] = {1,2,2,3,3,4};
//         int k = 2;
//         System.out.println(maxDistinctElements(nums, k));
//     }
// }

// final value of variables after performing operations

// public class leetcodedaily {

//     public static int finalValueAfterOperations(String[] operations) {
//         int x = 0;
//         for (String op : operations) {
//             if (op.equals("++X") || op.equals("X++")) {
//                 x++;
//             } else if (op.equals("--X") || op.equals("X--")) {
//                 x--;
//             }
//         }
//         return x;
//     }
//     public static void main(String[] args) {
//         String operations[] = {"--X","X++","X++"};
//         System.out.println(finalValueAfterOperations(operations));
//     }
// }

import java.util.*;

public class leetcodedaily{

    public static int maxFrequency(int[] nums, int k, int ops) {
        int mx = Arrays.stream(nums).max().getAsInt();
        int n = mx + k + 2;
        int[] f = new int[n];
        for (int x : nums) f[x]++;

        int[] pre = new int[n];
        pre[0] = f[0];
        for (int i = 1; i < n; i++) pre[i] = pre[i - 1] + f[i];

        int ans = 0;
        for (int t = 0; t < n; t++) {
            if (f[t] == 0 && ops == 0) continue;
            int l = Math.max(0, t - k), r = Math.min(n - 1, t + k);
            int tot = pre[r] - (l > 0 ? pre[l - 1] : 0);
            int adj = tot - f[t];
            int val = f[t] + Math.min(ops, adj);
            ans = Math.max(ans, val);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,4};
        int k = 5;
        int ops = 1;
        System.out.println(maxFrequency(nums, k, ops));
    }
}