package ArraysStrings;

public class OneAway {


    public static boolean charReplacement (String s1, String s2) {
        int differences = 0;

        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)) differences++;
        }

        if(differences > 1) return false;
        else return true;
    }
    public static boolean charInsertion (String s1, String s2) {
        return false;
    }
    public static boolean charDelete (String s1, String s2, int size1, int size2) {
        int differences = 0;
        if (size1 > size2){
            int index1 = 0;
            for (int i = 0; i < size2; i++){
                if (s1.charAt(index1) != s2.charAt(i)){
                    if (s1.charAt(index1+1) != s2.charAt(i)) {
                        return false;
                    } else{
                        differences++;
                        index1++;
                    }
                }
                index1++;
            }
        }
        else{
            int index2 = 0;
            for (int i = 0; i < size1; i++){
                if (s1.charAt(i) != s2.charAt(index2)){
                    if (s1.charAt(i) != s2.charAt(index2+1)) return false;
                    else{
                        differences++;
                        index2++;
                    }
                }
                index2++;
            }
        }

        if(differences > 1) return false;
        else return true;
    }
    public static boolean oneAway (String s1, String s2) {
        int size1 = s1.length();
        int size2 = s2.length();

        if(size1 == size2) return charReplacement(s1, s2);
        else{
            if (size1 - 1 == size2 || size1 == size2 - 1) return charDelete(s1, s2, size1, size2);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(oneAway("pale", "ple"));
        System.out.println(oneAway("pale", "pales"));
        System.out.println(oneAway("pale", "bale"));
        System.out.println(oneAway("pale", "bake"));

    }

}
