import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Increasing triangle
        /*for(int i =1 ; i<=n ; i++){
            for(int j=1; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/
        // Decreasing triangle
        /*for(int i=1 ; i<=n ; i++){
            for(int j=i; j<=n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/
        // Right sided triangle
       /* for(int i=1;i<=n;i++){
            for(int j=i; j<=n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/
        // HAlf pyramid 
        char char = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(char);
                c++;
            }
            System.out.println();
        }
    }
}
