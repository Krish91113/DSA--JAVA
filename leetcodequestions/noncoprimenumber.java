
package leetcodequestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class noncoprimenumber {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack <Integer> st = new Stack<>();
        for(int num: nums){
            int current = num;
            while(!st.isEmpty()){
                int top = st.peek();
                int gcd = gcd(top,current);
                if(gcd>1){
                    st.pop();
                    current = lcm(top,current,gcd);
                }else{
                    break;
                }
            }
            st.push(current);
        }
        return new ArrayList<>(st);
    }
    private int gcd(int a ,int b){
        while(b!=0){
            int temp =b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    private int lcm(int a, int b,int gcd){
        return (int)((long)a*(b/gcd));
    }
    public static void main(String[] args) {
        int nums[] = {6,4,3,2,7,6,2};
        System.out.println(new noncoprimenumber().replaceNonCoprimes(nums));
    }
}
