
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import java.util.*;

public class sortVowel {

    public static String sortVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a','e','i','o','u','A','E','I','O','U'
        ));

        // Extract vowels
        List<Character> vowelList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                vowelList.add(c);
            }
        }

        // Sort vowels
        Collections.sort(vowelList);

        // Rebuild string
        StringBuilder result = new StringBuilder();
        int idx = 0;
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                result.append(vowelList.get(idx++));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(sortVowels(s)); // Output: "leetcedo"
    }
}
