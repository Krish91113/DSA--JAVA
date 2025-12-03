package leetcodequestions;
public class sortcolors {
  
    public static void sortColors(int[] nums) {
        int i=0,
            j=nums.length-1,
            k=0;
        while(k<=j){
            if(nums[k]==1){
                k++;
            }else if(nums[k]==2){
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                j--;
            }else{
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                k++;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        sortColors (nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }

}
