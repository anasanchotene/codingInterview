package LinkedList;

public class ReturnKthToLast {
    public static void removeKthToLast (LinkedList list, int nodeNumber) {
        LinkedList.Node listNode = list.head;
        int size = 0;
        int goal = 0;
        int position = 0;

        while (listNode.next != null) size++;
        System.out.println(size);
        goal = size - nodeNumber;

        while (listNode.next != null) {
            if(position != goal){
                listNode = listNode.next;
                position++;
            } else {
                listNode.data = listNode.next.data;
                listNode.next = listNode.next.next;
                return;
            }
        }

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        LinkedList.insert(list, 7);
        LinkedList.insert(list, 1);
        LinkedList.insert(list, 6);
        LinkedList.insert(list, 5);
        LinkedList.insert(list, 9);
        LinkedList.insert(list, 2);

        removeKthToLast(list, 3);
        LinkedList.printList(list);
    }
}
