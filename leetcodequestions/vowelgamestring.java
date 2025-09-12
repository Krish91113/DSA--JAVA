package leetcodequestions;

public class vowelgamestring {
    public static boolean doesAliceWin(String s){
        String vowels = "aeiou";
       int count =0;
       for(char c : s.toCharArray()){
        if(vowels.indexOf(c)!=-1){
            count++;
        }
       }
       return count>0;

    }
    public static void main(String[] args) {
        String s = "leetcoder";
        System.out.println(doesAliceWin(s));
    }
}
