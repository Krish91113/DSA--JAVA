package leetcodequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findDuplicate {
    public static List<Integer> findDuplicates(int[] nums){
        ArrayList<Integer> aa = new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        int j=1;
        while(i<j && j<nums.length){
            if(nums[i] == nums[j]){
                aa.add(nums[i]);
            }
            i++;
            j++;
        }
        return aa;
    }
    public static void main(String[] args) {
        int nums[] = {1,1};
        System.out.println(findDuplicates(nums));
    }

}