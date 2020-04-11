package ArraysStrings;

public class URLify {

    public static String URLify (String s, int size) {
        char aux;

        StringBuilder newS = new StringBuilder();
        for (int i = 0; i < size; i++){
            aux = s.charAt(i);
            if (aux == ' ') {
                newS.append('%');
                newS.append('2');
                newS.append('0');

            } else {
                newS.append(aux);
            }
        }

        return newS.toString();
    }

    public static void main(String[] args) {
        System.out.println(URLify("Ana Carolina Sanchotene     ", 23));
        System.out.println(URLify("Mr John Smith      ", 13));
    }
}
