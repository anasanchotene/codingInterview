package LinkedList;

public class Intersection {

    public static LinkedList.Node intersection (LinkedList list1, LinkedList list2) {
        LinkedList.Node list1Node = list1.head;

        while (list1Node != null) {
            LinkedList.Node list2Node = list2.head;

            while (list2Node != null) {
                if (list1Node == list2Node)
                    return list1Node;
            }
            list1Node = list1Node.next;
        }

        return null;
    }

}
