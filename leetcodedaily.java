// // // // // // // // // // // // r21// // // // public class leetcodedaily {
// // // // // // // // // // // // // // // //     public static int findClosest(int x,int y, int z){
// // // // // // // // // // // // // // // //         int distance1=Math.abs(x-z);
// // // // // // // // // // // // // // // //         int distance2=Math.abs(y-z);
// // // // // // // // // // // // // // // //         if(distance1 == distance2){
// // // // // // // // // // // // // // // //             return 0;
// // // // // // // // // // // // // // // //         }
// // // // // // // // // // // // // // // //         else if(distance1 < distance2){
// // // // // // // // // // // // // // // //             return 1;
// // // // // // // // // // // // // // // //         }else{
// // // // // // // // // // // // // // // //             return 2;
// // // // // // // // // // // // // // // //         }
// // // // // // // // // // // // // // // //     }
// // // // // // // // // // // // // // // //     public static void main(String[] args) {
// // // // // // // // // // // // // // // //         int x=2;
// // // // // // // // // // // // // // // //         int y=7;
// // // // // // // // // // // // // // // //         int z=4;
// // // // // // // // // // // // // // // //         System.out.println(findClosest(x,y,z));
// // // // // // // // // // // // // // // //     }
// // // // // // // // // // // // // // // // }

// // // // // // // // // // // // // // // // count element with max frequency

// // // // // // // // // // // // // // // public class leetcodedaily {
// // // // // // // // // // // // // // //     public static int maxFrequencyElements(int[] nums) {
// // // // // // // // // // // // // // //         int[] freq = new int[101];
// // // // // // // // // // // // // // //         int maxFreq = 0;
// // // // // // // // // // // // // // //         for(int i : nums){
// // // // // // // // // // // // // // //             freq[i]++;
// // // // // // // // // // // // // // //             maxFreq = Math.max(maxFreq, freq[i]);
// // // // // // // // // // // // // // //         }
// // // // // // // // // // // // // // //         int ans=0;
// // // // // // // // // // // // // // //         for(int i : freq){
// // // // // // // // // // // // // // //             if(i == maxFreq) ans += i;
// // // // // // // // // // // // // // //         }
// // // // // // // // // // // // // // //     return ans;
// // // // // // // // // // // // // // //     }

// // // // // // // // // // // // // // //     public static void main(String[] args) {
// // // // // // // // // // // // // // //         int arr[]={1,2,2,3,3,3,4,4,4,4};
// // // // // // // // // // // // // // //         System.out.println(maxFrequencyElements(arr));
// // // // // // // // // // // // // // //     }
// // // // // // // // // // // // // // // }

// // // // // // // // // // // // // import java.util.ArrayList;
// // // // // // // // // // // // // import java.util.Collections;
// // // // // // // // // // // // // import java.util.List;

// // // // // // // // // // // // // public class leetcodedaily{
// // // // // // // // // // // // // //     public static int swimInWater(int[][] grid) {
// // // // // // // // // // // // // //         int m = grid.length, n = grid[0].length;
// // // // // // // // // // // // // //         List<int[]> edges = new ArrayList<>();

// // // // // // // // // // // // // //         for (int i = 0; i < m; i++) {
// // // // // // // // // // // // // //             for (int j = 0; j < n; j++) {
// // // // // // // // // // // // // //                 if (i > 0)
// // // // // // // // // // // // // //                     edges.add(new int[]{Math.max(grid[i][j], grid[i-1][j]), i*n+j, (i-1)*n+j});
// // // // // // // // // // // // // //                 if (j > 0)
// // // // // // // // // // // // // //                     edges.add(new int[]{Math.max(grid[i][j], grid[i][j-1]), i*n+j, i*n+j-1});
// // // // // // // // // // // // // //             }
// // // // // // // // // // // // // //         }

// // // // // // // // // // // // // //         Collections.sort(edges, (a, b) -> a[0] - b[0]);
// // // // // // // // // // // // // //         int[] parent = new int[m * n];
// // // // // // // // // // // // // //         for (int i = 0; i < m * n; i++) parent[i] = i;

// // // // // // // // // // // // // //         for (int[] edge : edges) {
// // // // // // // // // // // // // //             // Error fix: calls to union and find now resolve because they are static
// // // // // // // // // // // // // //             union(parent, edge[1], edge[2]);
// // // // // // // // // // // // // //             if (find(parent, 0) == find(parent, m*n-1))
// // // // // // // // // // // // // //                 return edge[0];
// // // // // // // // // // // // // //         }
// // // // // // // // // // // // // //         return grid[0][0];
// // // // // // // // // // // // // //     }

// // // // // // // // // // // // // //     // ✅ Added 'static' keyword here
// // // // // // // // // // // // // //     private static int find(int[] parent, int x) {
// // // // // // // // // // // // // //         if (parent[x] != x)
// // // // // // // // // // // // // //             parent[x] = find(parent, parent[x]);
// // // // // // // // // // // // // //         return parent[x];
// // // // // // // // // // // // // //     }

// // // // // // // // // // // // // //     // ✅ Added 'static' keyword here
// // // // // // // // // // // // // //     private static void union(int[] parent, int x, int y) {
// // // // // // // // // // // // // //         parent[find(parent, x)] = find(parent, y);
// // // // // // // // // // // // // //     }

// // // // // // // // // // // // // //     public static void main(String[] args) {
// // // // // // // // // // // // // //         // NOTE: The example array for grid has an issue with the last row's length (5 elements)
// // // // // // // // // // // // // //         // compared to others (4 elements). I've corrected the array structure below
// // // // // // // // // // // // // //         // assuming a 6x4 grid as implied by the rest of the code logic.
// // // // // // // // // // // // // //         int grid [][] = {{0,1,2,3},{4,24,23,22},{21,5,12,13},{14,15,16,11},{17,18,19,20},{10,9,8,7}}; // Fixed 6th row to have 4 elements (removed '6')
// // // // // // // // // // // // // //         System.out.println(swimInWater(grid));
// // // // // // // // // // // // // //     }
// // // // // // // // // // // // // // }

// // // // // // // // // // // // //     public static int[] avoidFlood(int[] rains) {
// // // // // // // // // // // // //         int n= rains.length;
// // // // // // // // // // // // //         int[] ans= new int[n];
// // // // // // // // // // // // //         Map<Integer, Integer> last_rain= new HashMap<>();
// // // // // // // // // // // // //         int def= 5;
// // // // // // // // // // // // //         TreeSet<Integer> dry_days= new TreeSet<>();
// // // // // // // // // // // // //         for(int i=0; i<n; i++){
// // // // // // // // // // // // //             int lake= rains[i];
// // // // // // // // // // // // //             if(lake==0){
// // // // // // // // // // // // //                 dry_days.add(i);
// // // // // // // // // // // // //                 ans[i]= def;
// // // // // // // // // // // // //             }else{
// // // // // // // // // // // // //                 ans[i]= -1;
// // // // // // // // // // // // //                 if(last_rain.containsKey(lake)){
// // // // // // // // // // // // //                     Integer day= dry_days.higher(last_rain.get(lake));
// // // // // // // // // // // // //                     //next dry day of last_rain.get(lake)
// // // // // // // // // // // // //                     //[2 , 3, 4, 5, 9, 10]
// // // // // // // // // // // // //                     //6
// // // // // // // // // // // // //                     if(day==null) return new int[0];
// // // // // // // // // // // // //                     ans[day]= lake;
// // // // // // // // // // // // //                     dry_days.remove(day);
// // // // // // // // // // // // //                 }
// // // // // // // // // // // // //                 last_rain.put(lake, i);
// // // // // // // // // // // // //             }
// // // // // // // // // // // // //         }
// // // // // // // // // // // // //         return ans;
// // // // // // // // // // // // //     }
// // // // // // // // // // // // //     public static void main(String[] args) {
// // // // // // // // // // // // //         int rains[]={1,2,0,1,2};
// // // // // // // // // // // // //         System.out.println(avoidFlood(rains));
// // // // // // // // // // // // //     }
// // // // // // // // // // // // // }

// // // // // // // // // // // // // import java.util.Arrays;

// // // // // // // // // // // // // public class leetcodedaily{
// // // // // // // // // // // // //     public static int[] successfulPairs(int[] spells, int[] potions, long success) {
// // // // // // // // // // // // //         Arrays.sort(potions);
// // // // // // // // // // // // //         int n = spells.length;
// // // // // // // // // // // // //         int ans[] = new int[n];

// // // // // // // // // // // // //         for (int i = 0; i < n; i++) {
// // // // // // // // // // // // //             int idx = bs(potions, spells[i], success);
// // // // // // // // // // // // //             if (idx != -1) ans[i] = potions.length - idx;
// // // // // // // // // // // // //         }

// // // // // // // // // // // // //         return ans;
// // // // // // // // // // // // //     }

// // // // // // // // // // // // //     public static int bs(int potions[], long strength, long success) {
// // // // // // // // // // // // //         int low = 0, high = potions.length - 1, idx = -1;
// // // // // // // // // // // // //         while (low <= high) {
// // // // // // // // // // // // //             int mid = low + (high - low) / 2;
// // // // // // // // // // // // //             if ((long) potions[mid] * strength >= success) {
// // // // // // // // // // // // //                 idx = mid;
// // // // // // // // // // // // // //                 high = mid - 1; // find smaller index
// // // // // // // // // // // // // //             } else {
// // // // // // // // // // // // // //                 low = mid + 1;
// // // // // // // // // // // // // //             }
// // // // // // // // // // // // // //         }
// // // // // // // // // // // // // //         return idx;
// // // // // // // // // // // // // //     }
// // // // // // // // // // // // // //     public static void main(String[] args) {
// // // // // // // // // // // // // //         int spells[] ={5,1,3};
// // // // // // // // // // // // // //         int potions[] ={1,2,3,4,5};
// // // // // // // // // // // // // //         int success = 7;
// // // // // // // // // // // // // //         System.out.println(successfulPairs(spells, potions, success));
// // // // // // // // // // // // // //     }
// // // // // // // // // // // // // // }

// // // // // // // // // // // // // import java.util.ArrayList;
// // // // // // // // // // // // // import java.util.Arrays;
// // // // // // // // // // // // // import java.util.List;

// // // // // // // // // // // // // public class leetcodedaily {
// // // // // // // // // // // // //     public static List<String> removeAnagrams(String[] words) {
// // // // // // // // // // // // //         List<String> ans = new ArrayList<>();
// // // // // // // // // // // // //         ans.add(words[0]);
// // // // // // // // // // // // //         for(int i=1;i<words.length;i++){
// // // // // // // // // // // // //             char [] a = wor1ds[i].toCharArray(),b=ans.get(ans.size()-1).toCharArray();
// // // // // // // // // // // // //             Arrays.sort(a);
// // // // // // // // // // // // //             Arrays.sort(b);
// // // // // // // // // // // // //             if(!Arrays.equals(a,b)){
// // // // // // // // // // // // //                 ans.add(words[i]);
// // // // // // // // // // // // //             }
// // // // // // // // // // // // //         }
// // // // // // // // // // // // //         return ans;
// // // // // // // // // // // // //     }
// // // // // // // // // // // // //     public static void main(String[] args) {
// // // // // // // // // // // // //         String[] words = {"abba","baba","bbaa","cd","cd"};
// // // // // // // // // // // // //         System.out.println(removeAnagrams(words));
// // // // // // // // // // // // //     }
// // // // // // // // // // // // // }

// // // // // // // // // // // // import java.util.List;

// // // // // // // // // // // // public class leetcodedaily{
// // // // // // // // // // // //     public static int maxIncreasingSubarrays(List<Integer> nums) {
// // // // // // // // // // // //         int n = nums.size();
// // // // // // // // // // // //         int prevRun = 0;
// // // // // // // // // // // //         int curr = 1;
// // // // // // // // // // // //         int K = 0;

// // // // // // // // // // // //         for (int i = 1; i < n; i++) {
// // // // // // // // // // // //             if (nums.get(i) > nums.get(i - 1)) {
// // // // // // // // // // // //                 curr++;
// // // // // // // // // // // //             } else {
// // // // // // // // // // // //                 prevRun = curr;
// // // // // // // // // // // //                 curr = 1;
// // // // // // // // // // // //             }
// // // // // // // // // // // //             K = Math.max(K, curr / 2);
// // // // // // // // // // // //             K = Math.max(K, Math.min(curr, prevRun));
// // // // // // // // // // // //         }
// // // // // // // // // // // //         return K;
// // // // // // // // // // // //     }

// // // // // // // // // // // //     public static void main(String[] args) {
// // // // // // // // // // // //         int nums[] = {2,5,7,8,9,2,3,4,3,1};
// // // // // // // // // // // //         System.out.println(maxIncreasingSubarrays(nums));
// // // // // // // // // // // //     }
// // // // // // // // // // // // }[[[[[=]q]]]]

// // // // // // // // // // // public class leetcodedaily{
// // // // // // // // // // //     public static int findSmallestInteger(int[] nums, int value) {
// // // // // // // // // // //         int n = nums.length, res = 0;
// // // // // // // // // // //         int[] rem = new int[value];
// // // // // // // // // // //         for (int x : nums) {
// // // // // // // // // // //             int r = ((x % value) + value) % value;
// // // // // // // // // // //             rem[r]++;
// // // // // // // // // // //         }
// // // // // // // // // // //         while (rem[res % value]-- > 0) res++;
// // // // // // // // // // //         return res;
// // // // // // // // // // //     }
// // // // // // // // // // //     public static void main(String[] args) {
// // // // // // // // // // //         int nums[] = {1,-10,7,13,6,8};
// // // // // // // // // // //         int value = 5;
// // // // // // // // // // //         System.out.println(findSmallestInteger(nums, value));
// // // // // // // // // // //     }
// // // // // // // // // // // }

// // // // // // // // // // // import java.util.Arrays;
// // // // // // // // // // // public class leetcodedaily{
// // // // // // // // // // //     public static int maxDistinctElements(int[] nums, int k) {
// // // // // // // // // // //         Arrays.sort(nums);
// // // // // // // // // // //         int ans = 0, prev = (int)-1e9;

// // // // // // // // // // //         for (int x : nums) {
// // // // // // // // // // //             int l = Math.max(x - k, prev + 1);
// // // // // // // // // // //             if (l <= x + k) {
// // // // // // // // // // //                 prev = l;
// // // // // // // // // // //                 ans++;
// // // // // // // // // // //             }
// // // // // // // // // // //         }
// // // // // // // // // // //         return ans;
// // // // // // // // // // //     }

// // // // // // // // // // //     public static void main(String[] args) {
// // // // // // // // // // //         int nums[] = {1,2,2,3,3,4};
// // // // // // // // // // //         int k = 2;
// // // // // // // // // // //         System.out.println(maxDistinctElements(nums, k));
// // // // // // // // // // //     }
// // // // // // // // // // // }

// // // // // // // // // // // final value of variables after performing operations

// // // // // // // // // // // public class leetcodedaily {

// // // // // // // // // // //     public static int finalValueAfterOperations(String[] operations) {
// // // // // // // // // // //         int x = 0;
// // // // // // // // // // //         for (String op : operations) {
// // // // // // // // // // //             if (op.equals("++X") || op.equals("X++")) {
// // // // // // // // // // //                 x++;
// // // // // // // // // // //             } else if (op.equals("--X") || op.equals("X--")) {
// // // // // // // // // // //                 x--;
// // // // // // // // // // //             }
// // // // // // // // // // //         }
// // // // // // // // // // //         return x;
// // // // // // // // // // //     }
// // // // // // // // // // //     public static void main(String[] args) {
// // // // // // // // // // //         String operations[] = {"--X","X++","X++"};
// // // // // // // // // // //         System.out.println(finalValueAfterOperations(operations));
// // // // // // // // // // //     }
// // // // // // // // // // // }

// // // // // // // // // // // import java.util.*;

// // // // // // // // // // // public class leetcodedaily{

// // // // // // // // // // //     public static int maxFrequency(int[] nums, int k, int ops) {
// // // // // // // // // // //         int mx = Arrays.stream(nums).max().getAsInt();
// // // // // // // // // // //         int n = mx + k + 2;
// // // // // // // // // // //         int[] f = new int[n];
// // // // // // // // // // //         for (int x : nums) f[x]++;

// // // // // // // // // // //         int[] pre = new int[n];
// // // // // // // // // // //         pre[0] = f[0];
// // // // // // // // // // //         for (int i = 1; i < n; i++) pre[i] = pre[i - 1] + f[i];

// // // // // // // // // // //         int ans = 0;
// // // // // // // // // // //         for (int t = 0; t < n; t++) {
// // // // // // // // // // //             if (f[t] == 0 && ops == 0) continue;
// // // // // // // // // // //             int l = Math.max(0, t - k), r = Math.min(n - 1, t + k);
// // // // // // // // // // //             int tot = pre[r] - (l > 0 ? pre[l - 1] : 0);
// // // // // // // // // // //             int adj = tot - f[t];
// // // // // // // // // // //             int val = f[t] + Math.min(ops, adj);
// // // // // // // // // // //             ans = Math.max(ans, val);
// // // // // // // // // // //         }
// // // // // // // // // // //         return ans;
// // // // // // // // // // //     }

// // // // // // // // // // //     public static void main(String[] args) {
// // // // // // // // // // //         int nums[] = {1,2,4};
// // // // // // // // // // //         int k = 5;
// // // // // // // // // // //         int ops = 1;
// // // // // // // // // // //         System.out.println(maxFrequency(nums, k, ops));
// // // // // // // // // // //     }
// // // // // // // // // // // }

// // // // // // // // // // // public class leetcodedaily{
// // // // // // // // // // //     public static boolean hasSameDigits(String s) {
// // // // // // // // // // //         int i = 0;
// // // // // // // // // // //         String res = "";
// // // // // // // // // // //         while (s.length() > 2 && i < s.length() - 1) {
// // // // // // // // // // //             res += (char) ((((s.charAt(i) - '0') + (s.charAt(i + 1) - '0')) % 10) + '0');
// // // // // // // // // // //             i++;
// // // // // // // // // // //             if (i == s.length() - 1) {
// // // // // // // // // // //                 s = res;
// // // // // // // // // // //                 i = 0;
// // // // // // // // // // //                 res = "";
// // // // // // // // // // //             }
// // // // // // // // // // //         }
// // // // // // // // // // //         return s.length() == 2 && s.charAt(0) == s.charAt(1);
// // // // // // // // // // //     }
// // // // // // // // // // //     public static void main(String[] args) {
// // // // // // // // // // //         String s = "123123";
// // // // // // // // // // //         System.out.println(hasSameDigits(s));
// // // // // // // // // // //     }
// // // // // // // // // // // }

// // // // // // // // // // // public class leetcodedaily{
// // // // // // // // // // //     public static int totalMoney(int n) {
// // // // // // // // // // //         int monday =0,count=0,sum=0;
// // // // // // // // // // //         for(int i=0;i<n;i++){
// // // // // // // // // // //             if(count == 7){
// // // // // // // // // // //                 monday=i/7+1;
// // // // // // // // // // //                 count=0;
// // // // // // // // // // //             }else{
// // // // // // // // // // //                 monday++;
// // // // // // // // // // //             }
// // // // // // // // // // //             sum+=monday;
// // // // // // // // // // //             count++;
// // // // // // // // // // //         }
// // // // // // // // // // //         return sum;
// // // // // // // // // // //     }
// // // // // // // // // // //     public static void main(String[] args) {
// // // // // // // // // // //         int n = 20;
// // // // // // // // // // //         System.out.println(totalMoney(n));
// // // // // // // // // // //     }
// // // // // // // // // // // }

// // // // // // // // // // // public class leetcodedaily{
// // // // // // // // // // //      public static int numberOfBeams(String[] bank) {
// // // // // // // // // // //         int prev=0;
// // // // // // // // // // //         int result=0;

// // // // // // // // // // //         for(String s : bank){
// // // // // // // // // // //             int current =0;
// // // // // // // // // // //             for(char c : s.toCharArray()){
// // // // // // // // // // //                 if(c == '1'){
// // // // // // // // // // //                     current+=1;

// // // // // // // // // // //                 }
// // // // // // // // // // //             }
// // // // // // // // // // //             if(current > 0){
// // // // // // // // // // //                 result+=prev*current;
// // // // // // // // // // //                 prev=current;
// // // // // // // // // // //             }
// // // // // // // // // // //         }
// // // // // // // // // // //         return result;
// // // // // // // // // // //     }
// // // // // // // // // // //     public static void main(String[] args) {
// // // // // // // // // // //         String bank[]={"011001","000000","010100","001000"};
// // // // // // // // // // //         System.out.println(numberOfBeams(bank));
// // // // // // // // // // //     }
// // // // // // // // // // // }
// // // // // // // // // // import java.util.ArrayList;
// // // // // // // // // // import java.util.List;
// // // // // // // // // // public class leetcodedaily{

// // // // // // // // // //     public static List<Boolean> prefixesDivBy5(int[] nums) {
// // // // // // // // // //        List<Boolean>list=new ArrayList<>();
// // // // // // // // // //       int ans=0;
// // // // // // // // // //       for(int i:nums){
// // // // // // // // // //         ans=((ans<<1)+i)%5;
// // // // // // // // // //         list.add(ans==0);
// // // // // // // // // //       }
// // // // // // // // // //       return list;
// // // // // // // // // //     }
// // // // // // // // // //     public static void main(String[] args) {
// // // // // // // // // //         int nums[]={0,1,1,1,1,1};
// // // // // // // // // //         System.out.println(prefixesDivBy5(nums));
// // // // // // // // // //     }

// // // // // // // // // // }
// // // // // // // // // import java .util.*;
// // // // // // // // // public class leetcodedaily{
// // // // // // // // // public static void main(String[] args) {
// // // // // // // // //     int nums[] = {1,2,2,3,4,5};
// // // // // // // // //     int k = 4;
// // // // // // // // //     int x = 3;
// // // // // // // // //     leetcodedaily obj = new leetcodedaily();
// // // // // // // // //     System.out.println(Arrays.toString(obj.findXSum(nums, k, x)));
// // // // // // // // // }
// // // // // // // // //     public int[] findXSum(int[] nums, int k, int x) {
// // // // // // // // //         int[] result = new int[nums.length - k + 1];

// // // // // // // // //         for (int i = 0; i < result.length; i++) {
// // // // // // // // //             int left = i, right = i + k - 1;
// // // // // // // // //             result[i] = findXSumofSubArray(nums, left, right, x);
// // // // // // // // //         }

// // // // // // // // //         return result;
// // // // // // // // //     }

// // // // // // // // //     private int findXSumofSubArray(int[] nums, int left, int right, int x) {
// // // // // // // // //         int sum = 0, distinctCount = 0;
// // // // // // // // //         int[] freq = new int[51]; 

// // // // // // // // //         for (int i = left; i <= right; i++) {
// // // // // // // // //             sum += nums[i];
// // // // // // // // //             if (freq[nums[i]] == 0) {
// // // // // // // // //                 distinctCount++;
// // // // // // // // //             }
// // // // // // // // //             freq[nums[i]]++;
// // // // // // // // //         }

// // // // // // // // //         if (distinctCount < x) {
// // // // // // // // //             return sum;
// // // // // // // // //         }

// // // // // // // // //         sum = 0;
// // // // // // // // //         for (int pick = 0; pick < x; pick++) {
// // // // // // // // //             int bestFreq = -1;
// // // // // // // // //             int bestVal = -1;

// // // // // // // // //             for (int val = 50; val >= 1; val--) {
// // // // // // // // //                 if (freq[val] > bestFreq) {
// // // // // // // // //                     bestFreq = freq[val];
// // // // // // // // //                     bestVal = val;
// // // // // // // // //                 }
// // // // // // // // //             }

// // // // // // // // //             if (bestVal != -1) {
// // // // // // // // //                 sum += bestVal * bestFreq;
// // // // // // // // //                 freq[bestVal] = 0;
// // // // // // // // //             }
// // // // // // // // //         }

// // // // // // // // //         return sum;
// // // // // // // // //     }

// // // // // // // // // }

// // // // // // // // // public class leetcodedaily{

// // // // // // // // //     public static int countPartitions(int[] nums) {
// // // // // // // // //         int totalSum=0;
// // // // // // // // //         for(int i=0;i<nums.length;i++){
// // // // // // // // //             totalSum+=nums[i];
// // // // // // // // //         }
// // // // // // // // //         int leftSum=0,
// // // // // // // // //             count=0;
// // // // // // // // //         for(int i=0;i<nums.length-1;i++){
// // // // // // // // //             leftSum+=nums[i];
// // // // // // // // //             int rightSum=totalSum - leftSum;
// // // // // // // // //             if((leftSum % 2 ) == (rightSum % 2)){
// // // // // // // // //                 count++;
// // // // // // // // //             }
// // // // // // // // //         }
// // // // // // // // //         return count;
// // // // // // // // //     }

// // // // // // // // //     public static void main(String[] args) {
// // // // // // // // //         int nums[] = {3,1,2,4,3};
// // // // // // // // //         System.out.println(countPartitions(nums));
// // // // // // // // //     }
// // // // // // // // // }

// // // // // // // // // class Solution {
// // // // // // // // //     public int mirrorDistance(int n) {
// // // // // // // // //         int ld=0;
// // // // // // // // //         while(n>0){
// // // // // // // // //             ld=((ld * 10) + (n % 10));
// // // // // // // // //             n/=10;
// // // // // // // // //         }
// // // // // // // // //         int ans = Math.abs(ld - n);
// // // // // // // // //         return ans;
// // // // // // // // //     }
// // // // // // // // // }©leetcode

// // // // // // // // // public class leetcodedaily {
// // // // // // // // //     public static String largestEven(String s) {
// // // // // // // // //         String maxEven = "";

// // // // // // // // //         for (int i = 0; i < s.length(); i++) {

// // // // // // // // //             for (int j = i + 1; j <= s.length(); j++) {
// // // // // // // // //                 String current = s.substring(i, j);

// // // // // // // // //                 char lastChar = current.charAt(current.length() - 1);
// // // // // // // // //                 int lastDigit = lastChar - '0';

// // // // // // // // //                 if (lastDigit % 2 == 0) {
// // // // // // // // //                     if (current.length() > maxEven.length()) {
// // // // // // // // //                         maxEven = current;
// // // // // // // // //                     }

// // // // // // // // //                     else if (current.length() == maxEven.length()) {
// // // // // // // // //                         if (current.compareTo(maxEven) > 0) {
// // // // // // // // //                             maxEven = current;
// // // // // // // // //                         }
// // // // // // // // //                     }
// // // // // // // // //                 }
// // // // // // // // //             }
// // // // // // // // //         }
// // // // // // // // //         return maxEven;
// // // // // // // // //     }

// // // // // // // // //     public static void main(String[] args) {
// // // // // // // // //         // This long string will now work because we don't use 'long' or 'int' for the
// // // // // // // // //         // sum
// // // // // // // // //         String s = "11222112212122121122";
// // // // // // // // //         System.out.println("Largest Even Substring: " + largestEven(s));
// // // // // // // // //     }
// // // // // // // // // }

// // // // // // // // public class addTwoNoLL {

// // // // // // // //     // Must be static to be used in the static main method
// // // // // // // //     public static class ListNode {
// // // // // // // //         int val;
// // // // // // // //         ListNode next;
// // // // // // // //         ListNode(int val) { this.val = val; }
// // // // // // // //     }

// // // // // // // //     public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
// // // // // // // //         ListNode dummy = new ListNode(-1);
// // // // // // // //         ListNode curr = dummy;
// // // // // // // //         int carry = 0;
// // // // // // // //         while (l1 != null || l2 != null || carry > 0) {
// // // // // // // //             int sum = carry;
// // // // // // // //             if (l1 != null) {
// // // // // // // //                 sum += l1.val;
// // // // // // // //                 l1 = l1.next;
// // // // // // // //             }
// // // // // // // //             if (l2 != null) {
// // // // // // // //                 sum += l2.val;
// // // // // // // //                 l2 = l2.next;
// // // // // // // //             }
// // // // // // // //             carry = sum / 10;
// // // // // // // //             curr.next = new ListNode(sum % 10);
// // // // // // // //             curr = curr.next;
// // // // // // // //         }
// // // // // // // //         return dummy.next;
// // // // // // // //     }

// // // // // // // //     // Helper: Converts Array -> Linked List
// // // // // // // //     public static ListNode createList(int[] nums) {
// // // // // // // //         ListNode dummy = new ListNode(0);
// // // // // // // //         ListNode curr = dummy;
// // // // // // // //         for (int x : nums) {
// // // // // // // //             curr.next = new ListNode(x);
// // // // // // // //             curr = curr.next;
// // // // // // // //         }
// // // // // // // //         return dummy.next;
// // // // // // // //     }

// // // // // // // //     // Helper: Prints Linked List
// // // // // // // //     public static void printList(ListNode head) {
// // // // // // // //         while (head != null) {
// // // // // // // //             System.out.print(head.val + (head.next != null ? " -> " : ""));
// // // // // // // //             head = head.next;
// // // // // // // //         }
// // // // // // // //         System.out.println();
// // // // // // // //     }

// // // // // // // //     public static void main(String[] args) {
// // // // // // // //         // Example: 342 + 465 = 807
// // // // // // // //         // In reversed list: [2, 4, 3] + [5, 6, 4] = [7, 0, 8]
// // // // // // // //         ListNode l1 = createList(new int[]{2, 4, 3});
// // // // // // // //         ListNode l2 = createList(new int[]{5, 6, 4});

// // // // // // // //         System.out.print("List 1: ");
// // // // // // // //         printList(l1);
// // // // // // // //         System.out.print("List 2: ");
// // // // // // // //         printList(l2);

// // // // // // // //         // Execute the logic
// // // // // // // //         ListNode result = addTwoNumbers(l1, l2);

// // // // // // // //         System.out.print("Result: ");
// // // // // // // //         printList(result);
// // // // // // // //     }
// // // // // // // // }
// // // // // // // /**
// // // // // // //  * Definition for singly-linked list.
// // // // // // //  * public class ListNode {
// // // // // // //  *     int val;
// // // // // // //  *     ListNode next;
// // // // // // //  *     ListNode() {}
// // // // // // //  *     ListNode(int val) { this.val = val; }
// // // // // // //  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// // // // // // //  * }
// // // // // // //  */
// // // // // // // class Solution {
// // // // // // //     public ListNode reverseKGroup(ListNode head, int k) {
// // // // // // //         int len =0;
// // // // // // //         ListNode curr=head;
// // // // // // //         while(curr!=null){
// // // // // // //             curr=curr.next;
// // // // // // //             len++;
// // // // // // //         }
// // // // // // //         int times = len/k;
// // // // // // //         ListNode dummy = new ListNode(-1);
// // // // // // //         dummy.next=head;
// // // // // // //         ListNode p1=dummy;
// // // // // // //         curr=head;
// // // // // // //         for(int i=0;i<times;i++){
// // // // // // //             ListNode prev=null;
// // // // // // //             ListNode p2=curr;
// // // // // // //             int count=0;
// // // // // // //             while(count < k && curr!=null){
// // // // // // //                 count++;
// // // // // // //                 ListNode next = curr.next;
// // // // // // //                 curr.next=prev;
// // // // // // //                 prev=curr;
// // // // // // //                 curr=next;
// // // // // // //             }
// // // // // // //             p1.next=prev;
// // // // // // //             p2.next=curr;
// // // // // // //             p1=p2;
// // // // // // //         }
// // // // // // //         return dummy.next;
// // // // // // //     }
// // // // // // // }

// // // // // // class Solution {
// // // // // //     public double separateSquares(int[][] squares) {
// // // // // //         double totalArea = 0;
// // // // // //         double low = 2e9; // Initialize with a large value
// // // // // //         double high = 0;

// // // // // //         // 1. Calculate Total Area and initial bounds
// // // // // //         for (int[] sq : squares) {
// // // // // //             double y = sq[1];
// // // // // //             double l = sq[2];
            
// // // // // //             // Cast to double BEFORE multiplying to prevent Integer Overflow
// // // // // //             totalArea += l * l;
            
// // // // // //             low = Math.min(low, y);
// // // // // //             high = Math.max(high, y + l);
// // // // // //         }

// // // // // //         double halfArea = totalArea / 2.0;

// // // // // //         // 2. Binary Search with fixed iterations
        
// // // // // //         for (int i = 0; i < 100; i++) {
// // // // // //             double mid = low + (high - low) / 2.0;
            
// // // // // //             if (calculateArea(squares, mid) >= halfArea) {
// // // // // //                 high = mid; // Area is sufficient, try to lower the line
// // // // // //             } else {
// // // // // //                 low = mid;  // Area is too small, need to raise the line
// // // // // //             }
// // // // // //         }
        
// // // // // //         return high;
// // // // // //     }

// // // // // //     // Helper function to calculate area below the line 'currentY'
// // // // // //     private double calculateArea(int[][] squares, double currentY) {
// // // // // //         double area = 0;
// // // // // //         for (int[] sq : squares) {
// // // // // //             double y = sq[1];
// // // // // //             double l = sq[2];
// // // // // //             double top = y + l;

// // // // // //             if (y >= currentY) {
// // // // // //                 // Case 1: Square is completely above the line
// // // // // //                 continue;
// // // // // //             } else if (top <= currentY) {
// // // // // //                 // Case 2: Square is completely below the line
// // // // // //                 area += l * l;
// // // // // //             } else {
// // // // // //                 // Case 3: Line cuts through the square
// // // // // //                 // We take the width (l) * the height of the bottom portion (currentY - y)
// // // // // //                 area += l * (currentY - y);
// // // // // //             }
// // // // // //         }
// // // // // //         return area;
// // // // // //     }
// // // // // // }'

// // // // // // class Solution {
// // // // // //     public int minTimeToVisitAllPoints(int[][] p) {
// // // // // //         int ans = 0;
// // // // // //         for (int i = 1; i < p.length; i++) {
// // // // // //             ans += Math.max(
// // // // // //                 Math.abs(p[i][0] - p[i - 1][0]),
// // // // // //                 Math.abs(p[i][1] - p[i - 1][1])
// // // // // //             );
// // // // // //         }
// // // // // //         return ans;
// // // // // //     }
// // // // // // }

// // // // // class Solution {
// // // // //     public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
// // // // //         int maxConsecutiveHBars = 1;
// // // // //         int maxConsecutiveVBars = 1;

// // // // //         Arrays.sort(hBars);
// // // // //         Arrays.sort(vBars);

// // // // //         int hLength = hBars.length;
// // // // //         int vLength = vBars.length;

// // // // //         int tempH = 1;
// // // // //         int tempV = 1;

// // // // //         for (int i = 1; i < Math.max(hLength, vLength); i++) {

// // // // //             if (i < hLength && hBars[i] - hBars[i - 1] == 1) {
// // // // //                 tempH++;
// // // // //             } else if (i < hLength) {
// // // // //                 maxConsecutiveHBars = Math.max(maxConsecutiveHBars, tempH);
// // // // //                 tempH = 1;
// // // // //             }

// // // // //             if (i < vLength && vBars[i] - vBars[i - 1] == 1) {
// // // // //                 tempV++;
// // // // //             } else if (i < vLength) {
// // // // //                 maxConsecutiveVBars = Math.max(maxConsecutiveVBars, tempV);
// // // // //                 tempV = 1;
// // // // //             }
// // // // //         }

// // // // //         maxConsecutiveHBars = Math.max(maxConsecutiveHBars, tempH);
// // // // //         maxConsecutiveVBars = Math.max(maxConsecutiveVBars, tempV);

// // // // //         int squareLen = Math.min(maxConsecutiveHBars, maxConsecutiveVBars) + 1;

// // // // //         return squareLen * squareLen;
// // // // //     }
// // // // // }
// // // // class Solution {
// // // //     public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
// // // //         long maxSide = 0;
// // // //         int n = bottomLeft.length;

// // // //         for (int i = 0; i < n; i++) {
// // // //             for (int j = i + 1; j < n; j++) {
// // // //                 // Find intersection boundaries
// // // //                 // Use Math.max for lower bounds (left, bottom)
// // // //                 // Use Math.min for upper bounds (right, top)
// // // //                 int x1 = Math.max(bottomLeft[i][0], bottomLeft[j][0]);
// // // //                 int y1 = Math.max(bottomLeft[i][1], bottomLeft[j][1]);
// // // //                 int x2 = Math.min(topRight[i][0], topRight[j][0]);
// // // //                 int y2 = Math.min(topRight[i][1], topRight[j][1]);

// // // //                 // Width and Height of the intersection rectangle
// // // //                 long width = x2 - x1;
// // // //                 long height = y2 - y1;

// // // //                 // If valid intersection (width and height > 0)
// // // //                 if (width > 0 && height > 0) {
// // // //                     long side = Math.min(width, height);
// // // //                     maxSide = Math.max(maxSide, side);
// // // //                 }
// // // //             }
// // // //         }

// // // //         return maxSide * maxSide;
// // // //     }
// // // // }
// // // // class Solution {
// // // //     public int[] minBitwiseArray(List<Integer> nums) {
// // // //         int ans[] = new int[nums.size()];
// // // //         for(int i = 0; i < nums.size(); i++) {
// // // //             int n = nums.get(i);
// // // //             if(n != 2) ans[i] = n - ((n + 1) & (-n - 1)) / 2;
// // // //             else ans[i] = -1;
// // // //         }  
// // // //         return ans;
// // // //     }
// // // // }

// // // class Solution {
// // //     public int minimumPairRemoval(int[] nums) {
// // //         int ans = 0;
// // //         int n = nums.length;
// // //         // Keep working until the array is sorted
// // //         while (!isSorted(nums, n)) {
// // //             ans++;
// // //             int minSum = Integer.MAX_VALUE;
// // //             int pos = -1;
// // //             // Find the leftmost adjacent pair with the minimum sum
// // //             for (int i = 1; i < n; i++) {
// // //                 int sum = nums[i] + nums[i - 1];
// // //                 if (sum < minSum) {
// // //                     minSum = sum;
// // //                     pos = i;
// // //                 }
// // //             }
// // //             // Replace the pair with their sum (at the leftmost position)
// // //             nums[pos - 1] = minSum;
// // //             // Shift the rest of the array left by one
// // //             for (int i = pos; i < n - 1; i++) {
// // //                 nums[i] = nums[i + 1];
// // //             }
// // //             n--; // Reduce array size
// // //         }
// // //         return ans;
// // //     }

// // //     // Helper: Check if array is sorted (up to length n)
// // //     private boolean isSorted(int[] nums, int n) {
// // //         for (int i = 1; i < n; i++) {
// // //             if (nums[i] < nums[i - 1]) return false;
// // //         }
// // //         return true;
// // //     }
// // // }

// // class Solution {
// //     public int minPairSum(int[] nums) {
// //         Arrays.sort(nums);
// //         //[2,3,4,5,6]
// //         // i       j
// //         //sum=0,max=0
// //         int i=0,j=nums.length-1;
// //         int sum=0;
// //         int max=0;
// //         while(i<j){
// //             sum=nums[i]+nums[j];
// //             max=Math.max(max,sum);
// //             i++;
// //             j--;
// //         }
// //         return max;
// //     }
// // }
// class Solution {
//     public List<List<Integer>> minimumAbsDifference(int[] arr) {
//         Arrays.sort(arr);
//         int n = arr.length;
//         int minDiff=Integer.MAX_VALUE;
//         List<List<Integer>> res = new ArrayList<>();
//         for(int i=1;i<n;i++){
//             int diff = arr[i]-arr[i-1];
//             if(diff<minDiff){
//                 minDiff=diff;
//                 res= new ArrayList<>();
//                 res.add(Arrays.asList(arr[i-1], arr[i]));
//             }else if(diff == minDiff){
//                 res.add(Arrays.asList(arr[i-1], arr[i]));
//             }
//         }
//         return res;
//     }
// // }
class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int num = 1;
        for (int i = 0; i < n / 2; i++) {
            res[i] = num;
            res[n - 1 - i] = -num;
            num++;
        }
        // If n is odd, set the middle element to 0
        if (n % 2 != 0) {
            res[n / 2] = 0;
        }
        return res;
    }
}