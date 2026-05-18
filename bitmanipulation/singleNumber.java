package bitmanipulation;

public class singleNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,3};
        System.out.println(singleNum(arr));
    }

    public static int singleNum(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }
}
