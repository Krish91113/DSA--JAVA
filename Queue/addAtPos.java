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
class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[] last = new int[m];

        java.util.Arrays.fill(last, -1);

        int i = n - 1;
        int j = m - 1;

        while (i >= 0 && j >= 0) {
            if (word1.charAt(i) == word2.charAt(j)) {
                last[j] = i;
                --j;
            }

            --i;
        }

        int[] ans = new int[m];
        int size = 0;

        boolean canSkip = true;
        j = 0;

        for (i = 0; i < n && j < m; ++i) {
            if (word1.charAt(i) == word2.charAt(j)) {
                ans[size++] = i;
                ++j;
            }
            else if (canSkip &&
                     (j == m - 1 || i < last[j + 1])) {
                canSkip = false;
                ans[size++] = i;
                ++j;
            }
        }

        if (j == m) {
            return ans;
        }

        return new int[0];
    }
}
