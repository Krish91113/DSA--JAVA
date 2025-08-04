import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// public class arraylist {
//     public static void main(String[] args) {
//         ArrayList<Integer> aa = new ArrayList<>();
//         aa.add(10);
//         aa.add(20);
//         aa.add(40);
//         aa.add(50);
//         for(int i=0;i<aa.size();i++){
//             System.out.print(aa.get(i) + " ");
//         }
//     }
// }

// public class arraylist {
//     public static int [] subaraySum(int arr[] , int target){
//         int [] n = new int[]{};
//         for(int i=0;i<arr.length;i++){
//             int sum =0;
//             for(int j=i;j<arr.length;j++){
//                 sum+=arr[j];
//                 if(sum == target){
//                     return n{i+1,j+1};
//                 }
//             }
//         }
//         return n;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,7,5};
//         int target = 12;
//         System.out.println(subaraySum(arr, target));
//     }
// }
public class arraylist{
    public static void Paranthesis(int n, int open, int close , String ans, List <String> ll){
        if(open ==n && close ==n){
            System.out.print(ans + " ");
            return;
        }
        if(open < n){
            Paranthesis(n, open+1, close, ans + "(", ll);
        }
        if(close < open){
            Paranthesis(n, open, close + 1, ans + ")", ll);
        }
    }
    public static void main(String[] args) {
        List<String> ll = new ArrayList<>();
        int n =3;
        Paranthesis(n, 0, 0, "", ll);
        System.out.println(ll);
    }
}