package LinkedList;

public class Partition {
    public static LinkedList partition (LinkedList list, int value) {
        LinkedList beforeValue = new LinkedList();
        LinkedList afterValue = new LinkedList();

        LinkedList.Node auxNode = list.head;

        while (auxNode != null) {
            if (auxNode.data < value)
                LinkedList.insert(beforeValue, auxNode.data);
            else
                LinkedList.insert(afterValue, auxNode.data);

            auxNode = auxNode.next;
        }


        LinkedList.Node beforeLastNode = beforeValue.head;

        while (beforeLastNode.next != null) {
            beforeLastNode = beforeLastNode.next;
        }

         beforeLastNode.next = afterValue.head;

        return beforeValue;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        LinkedList.insert(list, 6);
        LinkedList.insert(list, 1);
        LinkedList.insert(list, 2);
        LinkedList.insert(list, 5);
        LinkedList.insert(list, 6);
        LinkedList.insert(list, 3);
        LinkedList.insert(list, 4);
        LinkedList.insert(list, 3);
        LinkedList.insert(list, 5);
        LinkedList.insert(list, 6);

        LinkedList.printList(partition(list, 4));
    }


}
