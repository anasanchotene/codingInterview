package ArraysStrings;

import java.util.Arrays;

public class IsUnique {

    public static boolean isUniqueArray (String s) {
        char[] stringArray = s.toCharArray();
        Arrays.sort(stringArray);

        for (int i = 0; i < s.length() - 1; i++)
            if (stringArray[i] == stringArray[i+1]) return false;

        return true;
    }

    public static boolean isUnique (String s) {
        for (int i = 0; i < s.length(); i++){
            for (int j = i + 1; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("abc"));
        System.out.println(isUnique("abca"));

        System.out.println(isUniqueArray("abc"));
        System.out.println(isUniqueArray("abca"));
    }
}
