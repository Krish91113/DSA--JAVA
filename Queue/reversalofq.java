package Queue;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class reversalofq {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);q.add(20);q.add(30);q.add(40);
        reversalofq obj = new reversalofq();
        obj.reverseQueue(q);
    }
    public void reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> s = new Stack<>();
        while(q.size()>0){
            s.push(q.remove());
        }
        while(s.size()>0){
            q.add(s.pop());
        }
        System.out.println(q);
    }
}
