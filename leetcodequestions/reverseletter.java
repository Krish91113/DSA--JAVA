
package leetcodequestions;
public class reverseletter {

    public static String reverseOnlyLetters(String s) {

        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            // Get characters
            char left = arr[i];
            char right = arr[j];

            // If left is not a letter, move i
            if (!Character.isLetter(left)) {
                i++;
                continue;
            }

            // If right is not a letter, move j
            if (!Character.isLetter(right)) {
                j--;
                continue;
            }

            // Both are letters → swap
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }
    public static void main(String[] args) {
        String input = "a-bC-dEf-ghIj";
        String result = reverseOnlyLetters(input);
        System.out.println(result);  // Output: "j-Ih-gfE-dCba"
    }

}
