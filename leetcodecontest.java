// // // // public class leetcodecontest {

    
// // // //     public static long maxProduct(int nums[]){
// // // //         long ans = 0;
// // // //         for(int i = 0; i < nums.length; i++) {
// // // //             for(int j = i+1; j < nums.length; j++) {   // ✅ avoid self and duplicates
// // // //                 if((nums[i] & nums[j]) == 0){
// // // //                     long product = (long) nums[i] * nums[j];
// // // //                     ans = Math.max(ans, product);
// // // //                 }
// // // //             }
// // // //         }
// // // //         return ans;
// // // //     }


// // // //     public static void main(String[] args) {
// // // //         int nums [] = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536,131072,262144,524288,1048576};
// // // //         System.out.println(maxProduct(nums));
// // // //     }
// // // // }

// // // public class leetcodecontest {

    
// // //     public static double maxAverageRatio(int[][] classes, int extraStudents) {
// // //         PriorityQueue<double[]> pq = new PriorityQueue<>(new Comparator<double[]>() {
// // //             public int compare(double[] a, double[] b) {
// // //                 if (a[0] < b[0]) return 1;
// // //                 if (a[0] > b[0]) return -1;
// // //                 return 0;
// // //             }
// // //         });

// // //         for (int i = 0; i < classes.length; i++) {
// // //             double pass = classes[i][0];
// // //             double total = classes[i][1];
// // //             double inc = (pass + 1.0) / (total + 1.0) - pass / total;
// // //             pq.offer(new double[]{inc, pass, total});
// // //         }
        
// // //         while (extraStudents > 0) {
// // //             double[] top = pq.poll();
// // //             double pass = top[1] + 1;
// // //             double total = top[2] + 1;
// // //             double inc = (pass + 1.0) / (total + 1.0) - pass / total;
// // //             pq.offer(new double[]{inc, pass, total});
// // //             extraStudents--;
// // //         }

// // //         double sum = 0.0;
// // //         Object[] arr = pq.toArray();
// // //         for (int i = 0; i < arr.length; i++) {
// // //             double[] c = (double[]) arr[i];
// // //             sum += c[1] / c[2];
// // //         }

// // //         return sum / classes.length;
// // //     }
// // //     public static void main(String[] args) {
// // //         int [][] classes = {{1,2},{3,5},{2,2}};
// // //         int extraStudents = 2;
// // //         System.out.println(maxAverageRatio(classes, extraStudents));
// // //     }
// // // }

// // public class leetcodecontest {
// //     public static int gcdofOddEvenSums(int n) {
// //         int sumOfOdd = 0;
// //         int sumOfEven = 0;
// //         int oddCount = 0, evenCount = 0;
// //         int i = 1;

// //         while (oddCount < n || evenCount < n) {
// //             if (i % 2 == 0 && evenCount < n) {
// //                 sumOfEven += i;
// //                 evenCount++;
// //             } else if (i % 2 != 0 && oddCount < n) {
// //                 sumOfOdd += i;
// //                 oddCount++;
// //             }
// //             i++;
// //         }

// //         return gcd(sumOfOdd, sumOfEven);
// //     }

// //     private static int gcd(int a, int b) {
// //         if (b == 0) return a;
// //         return gcd(b, a % b);
// //     }

// //     public static void main(String[] args) {
// //         int n = 4; // Example
// //         System.out.println(gcdofOddEvenSums(n)); 
// //     }
// // }

// // import Stacks.stacks;

// // public class leetcodecontest{

// //     public static int earliestTime(int[][] tasks) {
// //         int ans = Integer.MAX_VALUE;
// //         for(int i=0;i<tasks.length;i++){
// //             int sum = 0;
// //             for(int j=0;j<tasks[0].length;j++){
// //                 sum=sum + tasks[i][j];
// //                 if(j == tasks[i].length - 1){

// //                     ans = Math.min(sum,ans);
// //                 }
// //             }
// //         }
// //         return ans;
// //     }
// //     public static void main(String[] args) {
// //         int tasks [][] = {{1,6},{2,3}};
// //         System.out.println(earliestTime(tasks));
// //     }
// // }

// import java.util.Arrays;

// public class leetcodecontest {
//      public static int[] maxKDistinct(int[] nums, int k) {
    
//         Arrays.sort(nums);
//         int[] result = new int[k];
//         int count = 0;
//         int last = Integer.MIN_VALUE;

//         for (int i = nums.length - 1; i >= 0 && count < k; i--) {
//             if (nums[i] != last) {  
//                 result[count] = nums[i];
//                 last = nums[i];
//                 count++;
//             }
//         }

//         if (count < k) {
//             return Arrays.copyOf(result, count);
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         int nums[] = {84,93,100,77,90};
//         int k =3;
//         System.out.println(Arrays.toString(maxKDistinct(nums, k)));

//     }
// }

// Weekly contest - 468
// bitwise or of even numbers
// public class leetcodecontest {
//     public static int evenNumberBitwiseORs(int[] nums){
//         int ans = 0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] % 2 == 0){
//                 ans = ans | nums[i];
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int nums[] = { 1,2,3,4,5,6};
//         System.out.println(evenNumberBitwiseORs(nums));
//     }
// }

// Max Total subarray value 1

public class leetcodecontest {
    public static  long maxTotalValue(int[] nums, int k){
        long ans = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
            ans = (max-min) * k;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] ={4,2,5,1};
        int k=3;
        System.out.println(maxTotalValue(nums, k));
    }
}