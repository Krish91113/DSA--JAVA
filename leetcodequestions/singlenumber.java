package leetcodequestions;

import java.util.Arrays;

public class singlenumber {
    public static int singleNumber(int nums[]){
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int last = 0;
        while(i<j && j<nums.length){
            if(nums[i]!=nums[j]){
                last = nums[j];
                return last;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int nums[] = {30000,500,100,30000,100,30000,100};
        System.out.println(singleNumber(nums));
    }
}
