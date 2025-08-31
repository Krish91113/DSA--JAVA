public class leetcodecontest {

    
    public static long maxProduct(int nums[]){
        long ans = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {   // ✅ avoid self and duplicates
                if((nums[i] & nums[j]) == 0){
                    long product = (long) nums[i] * nums[j];
                    ans = Math.max(ans, product);
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int nums [] = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536,131072,262144,524288,1048576};
        System.out.println(maxProduct(nums));
    }
}