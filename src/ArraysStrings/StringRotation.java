package ArraysStrings;

import java.util.Arrays;

public class StringRotation {

    public static boolean isRotation (String s1, String s2) {
        int i = 0;
        while (s1.charAt(0) != s2.charAt(i)) i++;

        int init = i;
        StringBuilder s2RightOrder = new StringBuilder();

        while (i < s2.length()) {
            s2RightOrder.append(s2.charAt(i));
            i++;
        }

        i = 0;

        while (i < init) {
            s2RightOrder.append(s2.charAt(i));
            i++;
        }

        for (i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2RightOrder.charAt(i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));
    }
}
