package LinkedList;

public class ReturnKthToLast {
    public static void removeKthToLast (LinkedList list, int nodeNumber) {
        LinkedList.Node listNode = list.head;
        int size = 0;
        int goal = 0;
        int position = 0;

        while (listNode != null) {
            size++;
            listNode = listNode.next;
        }
        goal = size - nodeNumber;
        listNode = list.head;

        while (listNode != null && position < goal) {
                listNode = listNode.next;
                position++;
        }

        System.out.println(listNode.data);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        LinkedList.insert(list, 1);
        LinkedList.insert(list, 2);
        LinkedList.insert(list, 3);
        LinkedList.insert(list, 4);
        LinkedList.insert(list, 5);
        LinkedList.insert(list, 6);


        removeKthToLast(list, 3);
        //LinkedList.printList(list);
    }
}
