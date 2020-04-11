package LinkedList;

public class Palindrome {

    public static boolean palindrome (LinkedList list) {
        int size = LinkedList.length(list);
        System.out.println(size);
        int[] arrayList = new int [size];
        LinkedList.Node auxNode = list.head;
        int independent = 0;

        for (int i = 0; i < size; i++) {
            arrayList[i] = auxNode.data;
            auxNode = auxNode.next;
        }

        for (int i = 0; i < size; i++) {
            if (arrayList[i] != arrayList[size]) {
                independent++;
            }
            size--;
        }

        if (independent > 1) return false;
        else return true;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        LinkedList.insert(list, 1);
        LinkedList.insert(list, 2);
        LinkedList.insert(list, 3);
        LinkedList.insert(list, 3);
        LinkedList.insert(list, 2);
        LinkedList.insert(list, 1);

        System.out.println(palindrome (list));
    }
}