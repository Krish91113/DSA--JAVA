// public class leetcodedaily {
//     public static int findClosest(int x,int y, int z){
//         int distance1=Math.abs(x-z);
//         int distance2=Math.abs(y-z);
//         if(distance1 == distance2){
//             return 0;
//         }
//         else if(distance1 < distance2){
//             return 1;
//         }else{
//             return 2;
//         }
//     }
//     public static void main(String[] args) {
//         int x=2;
//         int y=7;
//         int z=4;
//         System.out.println(findClosest(x,y,z));
//     }
// }

// count element with max frequency

public class leetcodedaily {
    public static int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maxFreq = 0;
        for(int i : nums){
            freq[i]++;
            maxFreq = Math.max(maxFreq, freq[i]);
        }
        int ans=0;
        for(int i : freq){
            if(i == maxFreq) ans += i;
        }
    return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,4,4,4,4};
        System.out.println(maxFrequencyElements(arr));
    }
}
