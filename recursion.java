// public class recursion {
//     public static int fact(int n){
//         if(n == 0){
//             return 1;
//         }
//         int fn = fact(n-1);
//         return n * fn ;
//     }
//     public static void main(String[] args) {
//         int n= 5;
//         System.out.println(fact(n));
//     }
// }

// public class recursion{
//     public static int pow(int x , int n){
//         if(n == 0){
//             return 1;
//         }
//         int ans = pow(x, n-1);
//         return ans * x;
//     }
//     public static void main(String[] args) {
//         int x = 3;
//         int n = 5;
//         System.out.println(pow(x, n));
//     }
// }

// public class recursion{
//     public static int guessNumber(int n) {
//         int pick = 1;
//         int start = 1;
//         int end = n;
//         while(start <= end){
//             int mid =  (start + end)/2;
//             if(mid == pick){
//                 return mid ;
//             }else if (mid < pick){
//                 start = mid + 1;
//             }else{
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int n = 1;
//         System.out.println(guessNumber(n));
//     }

// public class recursion{
//     public static int findFirstOccurence(int arr[] ,int i, int item ){
//         if(i < 0){
//             return -1;
//         }
//         if(arr[i] == item){
//             return i;
//         }
        
//         return findFirstOccurence(arr, i-1, item);
//     }
//     public static void main(String[] args) {
//         int arr [] ={2,3,5,3,7,11,3,11,8};
//         int item = 9;
//         int i = arr.length - 1;
//         System.out.println(findFirstOccurence(arr, i, item));
//     }
// }

public class recursion {
    public static int fibonacii(int n){
        if(n==0  || n==1){
            return n;
        }
        int f1 = fibonacii(n - 1);
        int f2 = fibonacii(n-2);
        return f1 + f2;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacii(n));

    }
}