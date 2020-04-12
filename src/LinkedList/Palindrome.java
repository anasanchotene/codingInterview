package LinkedList;

public class Palindrome {

    public static boolean palindrome (LinkedList list) {
        int size = LinkedList.length(list);
        int[] arrayList = new int [size];
        LinkedList.Node auxNode = list.head;
        int independent = 0;

        for (int i = 0; i < size; i++) {
            if(auxNode != null ) arrayList[i] = auxNode.data;
            else break;
            //System.out.println(i + "conteudo:  " + arrayList[i]);
            auxNode = auxNode.next;
        }
        size--;

        for (int i = 0; i <= size - 1; i++) {
                //System.out.println( i + " "+arrayList[i] +" "+arrayList[size] + " " + size);

                if (arrayList[i] != arrayList[size]) {
                independent++;
                //System.out.println(i + " " + size);
                if(size - 1 == i) independent++;
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
        LinkedList.insert(list, 4);
        LinkedList.insert(list, 5);
        LinkedList.insert(list, 3);
        LinkedList.insert(list, 2);
        LinkedList.insert(list, 1);
        System.out.println(palindrome (list));

        LinkedList list1 = new LinkedList();
        LinkedList.insert(list1, 1);
        LinkedList.insert(list1, 2);
        LinkedList.insert(list1, 3);
        LinkedList.insert(list1, 4);
        LinkedList.insert(list1, 3);
        LinkedList.insert(list1, 2);
        LinkedList.insert(list1, 1);
        System.out.println(palindrome (list1));


        LinkedList list2 = new LinkedList();
        LinkedList.insert(list2, 1);
        LinkedList.insert(list2, 2);
        LinkedList.insert(list2, 3);
        LinkedList.insert(list2, 3);
        LinkedList.insert(list2, 2);
        LinkedList.insert(list2, 1);
        System.out.println(palindrome (list2));

    }
}