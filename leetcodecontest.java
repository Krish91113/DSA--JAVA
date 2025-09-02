// // public class leetcodecontest {

    
// //     public static long maxProduct(int nums[]){
// //         long ans = 0;
// //         for(int i = 0; i < nums.length; i++) {
// //             for(int j = i+1; j < nums.length; j++) {   // ✅ avoid self and duplicates
// //                 if((nums[i] & nums[j]) == 0){
// //                     long product = (long) nums[i] * nums[j];
// //                     ans = Math.max(ans, product);
// //                 }
// //             }
// //         }
// //         return ans;
// //     }


// //     public static void main(String[] args) {
// //         int nums [] = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536,131072,262144,524288,1048576};
// //         System.out.println(maxProduct(nums));
// //     }
// // }

// public class leetcodecontest {

    
//     public static double maxAverageRatio(int[][] classes, int extraStudents) {
//         PriorityQueue<double[]> pq = new PriorityQueue<>(new Comparator<double[]>() {
//             public int compare(double[] a, double[] b) {
//                 if (a[0] < b[0]) return 1;
//                 if (a[0] > b[0]) return -1;
//                 return 0;
//             }
//         });

//         for (int i = 0; i < classes.length; i++) {
//             double pass = classes[i][0];
//             double total = classes[i][1];
//             double inc = (pass + 1.0) / (total + 1.0) - pass / total;
//             pq.offer(new double[]{inc, pass, total});
//         }
        
//         while (extraStudents > 0) {
//             double[] top = pq.poll();
//             double pass = top[1] + 1;
//             double total = top[2] + 1;
//             double inc = (pass + 1.0) / (total + 1.0) - pass / total;
//             pq.offer(new double[]{inc, pass, total});
//             extraStudents--;
//         }

//         double sum = 0.0;
//         Object[] arr = pq.toArray();
//         for (int i = 0; i < arr.length; i++) {
//             double[] c = (double[]) arr[i];
//             sum += c[1] / c[2];
//         }

//         return sum / classes.length;
//     }
//     public static void main(String[] args) {
//         int [][] classes = {{1,2},{3,5},{2,2}};
//         int extraStudents = 2;
//         System.out.println(maxAverageRatio(classes, extraStudents));
//     }
// }

public class leetcodecontest{
    public static int gcdofOddEvenSums(int n){
        int sumofOdd = 0;
        int sumofEven = 0;
        int count =0;
        for(int i=1;i<=1000;i++){
            if(count <= (n+n)){
                if(i%2==0){
                    sumofEven += i;
                }
                else{
                    sumofOdd += i;
                }
                count++;
            }
        }
        return sumofEven-sumofOdd;
    }
    
        public static void main(String[] args) {
        int n =4;
        System.out.println(gcdofOddEvenSums(n));
    }
}