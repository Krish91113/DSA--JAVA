package bitmanipulation;
public class powerOfN {
    public static void main(String[] args) {
        int n = 16;
        int m = 1;
        System.out.println(m<<n);
    }   
}

class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Determine sign
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        
        // Use long to avoid overflow
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        
        long quotient = 0;
        
        while (absDividend >= absDivisor) {
            long temp = absDivisor;
            long multiple = 1;
            
            // Inner loop: double using left shift
            while (absDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            
            absDividend -= temp;
            quotient += multiple;
        }
        
        // Apply sign and clamp
        if (isNegative) {
            quotient = -quotient;
        }
        
        if (quotient > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (quotient < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        return (int) quotient;
    }
}
