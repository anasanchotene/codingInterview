package ArraysStrings;

public class StringCompression {

    public static String stringCompression (String s) {
        StringBuilder newS = new StringBuilder();
        char initialChar = s.charAt(0);
        int repetitions = 1;

        for (int i = 1; i < s.length(); i++){
            while (i < s.length() && s.charAt(i) == initialChar) {
                repetitions++;

                if (i < s.length() - 1) i++;
                else break;
            }

            newS.append(initialChar);
            newS.append(repetitions);

            initialChar = s.charAt(i);
            repetitions = 1;
        }

        if (newS.length() < s.length()) return newS.toString();
        else return s;
    }

    public static void main(String[] args) {
        System.out.println(stringCompression("aabcccccaaa"));
        System.out.println(stringCompression("aabc"));

    }
}
