package ArraysStrings;

import java.util.Arrays;

public class CheckPermutation {

    public static boolean checkPermutation (String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] stringArray1 = s1.toCharArray();
        char[] stringArray2 = s2.toCharArray();

        Arrays.sort(stringArray1);
        Arrays.sort(stringArray2);

        for (int i = 0; i < s1.length(); i++)
            if (stringArray1[i] != stringArray2[i]) return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPermutation("abc", "bca"));
        System.out.println(checkPermutation("abcd", "bca"));
        System.out.println(checkPermutation("abc", "abca"));
    }
}
