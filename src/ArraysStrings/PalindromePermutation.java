package ArraysStrings;

import java.util.Arrays;

public class PalindromePermutation {

    public static boolean palindromePermutation (String s) {

        char[] convertedS = s.toCharArray();
        Arrays.sort(convertedS);
        int diff = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int j = i + 1;

            if (convertedS[i] == convertedS[j]) {
                i++;
            } else{
                diff++;
                if (i == s.length() - 2) diff++;
            }
        }
        if(diff > 1) return false;
        else return true;

    }

    public static void main(String[] args) {

        System.out.println(palindromePermutation("aabbccfdde"));
        System.out.println(palindromePermutation("aabbccfddge"));
        System.out.println(palindromePermutation("aabbccfdd"));
        System.out.println(palindromePermutation("aabbccfedd"));

        System.out.println(palindromePermutation("aabbcddeeffhjjk"));
        System.out.println(palindromePermutation("aabbcddeeffhjj"));
        System.out.println(palindromePermutation("aabbcddeeffjj"));

    }
}
