public class gfg {
    
   public static int floorSqrt(int n) {
        int i = 1;
        int j = n;
        int ans = 0;
        
        while(i <= j){
            int mid = (i + j) / 2;
            long square = (long)mid * mid;  

            if(square == n){
                return mid;
            } else if(square < n){
                ans = mid;      
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(floorSqrt(n));
    }

}
