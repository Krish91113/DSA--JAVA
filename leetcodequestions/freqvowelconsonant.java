package leetcodequestions;

public class freqvowelconsonant {   
    public static int maxFreqSum(String s){
        int vowelc = 0;
        int maxvowelc =0;
        int consonanntc = 0;
        int maxconsonanntc = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i)== 'e' || s.charAt(i)== 'i' || s.charAt(i)== 'o' || s.charAt(i)== 'u'){
                vowelc++;
                maxvowelc = Math.max(vowelc, maxvowelc);
            }else{
                consonanntc++;
                maxconsonanntc = Math.max(maxconsonanntc, consonanntc);
            }
        }
        return maxvowelc+maxconsonanntc;
    }
    public static void main(String[] args) {
        String s = "successes";
        System.out.println(maxFreqSum(s));
    }
}
