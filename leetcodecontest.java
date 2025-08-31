public class leetcodecontest {

    public static long maxProduct(int nums[]){
        long product = 0;
        long ans = 0;
        for(int i=0;i<nums.length;i++)  {
            
            for(int j=0;j<nums.length;j++){
                if((nums[i] & nums[j]) == 0){
                    product = nums[i] * nums[j];
                    ans = Math.max(ans, product);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums [] = {5,6,4};
        System.out.println(maxProduct(nums));
    }
}