package Queue;
import java.util.*;
import java.util.Queue;

public class addAtPos {
    private static void addAtPos(Queue<Integer> q, int val, int pos){
        Queue<Integer> temp = new LinkedList<>();
        int n = q.size();
        for(int i=1;i<=n;i++){
            if(i==pos){
                temp.add(val);
            }
            temp.add(q.remove());
        }
        while(!temp.isEmpty()){
            q.add(temp.remove());
        }
    }
    private static void peekAtPos(Queue<Integer> q, int pos){
        int n =q.size();
        for(int i=1;i<=n;i++){
            int curr=q.remove();
            if(i==pos){
                System.out.println(curr);
            }
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new java.util.LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        int pos = 2;
        
        peekAtPos(q, pos);
        
    }
}
