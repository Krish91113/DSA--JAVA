
package leetcodequestions;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        //numRow=5
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        for(int row=1;row< numRows;row++){
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
                List<Integer> prevRow= result.get(row-1);
            for(int i=1;i<row;i++){
                newRow.add(prevRow.get(i-1)+prevRow.get(i));
            }
            newRow.add(1);
            result.add(newRow);
        }
        return result;
    }
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> pascal = generate(numRows);
        for(List<Integer> row : pascal){
            System.out.println(row);
        }
    }
}
class Solution {
    public int numberOfSubstrings(String s) {
        int freq[] = new int[3];
        int i=0;
        int c=0;
        int n=s.length();class Solution {
    public int numberOfSubstrings(String s) {
        int freq[] = new int[3];
        int i=0;
        int c=0;
        int n=s.length();
        for(int j=0;j<n;j++){
            freq[s.charAt(j) - 'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                c+=n-j;
                freq[s.charAt(i)-'a']--;
                i++;
            }
        }
        return c;
    }
}
        for(int j=0;j<n;j++){
            freq[s.charAt(j) - 'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                c+=n-j;
                freq[s.charAt(i)-'a']--;
                i++;
            }
        }
        return c;
    }
}
