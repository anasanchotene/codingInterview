package LinkedList;

public class Partition {
    public static LinkedList partition (LinkedList list, int value) {
        LinkedList beforeValue = new LinkedList();
        LinkedList afterValue = new LinkedList();

        LinkedList.Node auxNode = list.head;

        while (auxNode != null) {
            if (auxNode. data > value)
                LinkedList.insert(beforeValue, auxNode.data);
            else
                LinkedList.insert(afterValue, auxNode.data);
        }

        LinkedList.Node beforeLastNode = beforeValue.head;

        while (beforeLastNode.next != null) {
            beforeLastNode = beforeLastNode.next;
        }

        beforeLastNode.next = afterValue.head;

        return beforeValue;
    }

}
