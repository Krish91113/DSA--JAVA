    // public class bitwise {
//     public static void main(String[] args) {
//         System.out.println(5 & 6);
//         System.out.println(5 | 6);
//         System.out.println(5 ^ 6);
//         System.out.println(5<<2);
//         System.out.println(6>>1);
//     }9
// }
public class bitwise {
    public static void oddOrEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("no is even");
        }else{
            System.out.println("no is odd");
        }
    }
    public static int getIthBit(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask )==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        int n = 6;
       System.out.println(getIthBit(10, 3));
    }
}
