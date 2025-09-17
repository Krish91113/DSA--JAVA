package Stacks;

import java.util.ArrayList;
import java.util.Stack;

// import java.util.Stack;

// public class stacks {
//     public static void main(String[] args) {
//         Stack<Integer> st = new Stack<>();
//         st.push(10);
//         st.push(20);
//         st.push(30);
//         st.push(40);
//         st.push(50);
//         System.out.println(st.peek());
//         System.out.println((st));
//         System.out.println(st.isEmpty());
//         System.out.println(st.pop());
//         System.out.println(st);
//     }
// }

public class stacks {
    public static void NGE(int arr[]){
         ArrayList<Integer> res = new ArrayList<>();
        int [] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()] = -1;
        }
        for(int i=0;i<ans.length;i++){
            res.add(ans[i]);
        }   
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");   
        }
    }
    public static void main(String[] args) {
        int []  arr = {55,11,9,7,13,3,66,60};
        NGE(arr);
    }
}