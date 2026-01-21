package Queue;
import java.util.*;
public class findWinner {
    public static void main(String[] args) {
        int n=9;
        int k=9;
        System.out.println(findTheWinner(n, k));
    }
    
    public static int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        while(q.size()>1){
            //k-1;
            for(int i=1;i<=k-1;i++){
                q.add(q.remove());
            }
            q.remove();
        }
        return q.peek();
    }

}
