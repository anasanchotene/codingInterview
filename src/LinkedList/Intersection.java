package LinkedList;

public class Intersection {

    public static LinkedList.Node intersection (LinkedList list1, LinkedList list2) {
        LinkedList.Node list1Node = list1.head;

        while (list1Node.next != null) {
            LinkedList.Node list2Node = list2.head;
            while (list2Node.next != null) {
                if (list1Node == list2Node){
                    System.out.println("Intersection: " + list1Node.data);
                    return list1Node;
                }
                list2Node = list2Node.next;
            }
            list1Node = list1Node.next;
        }

        return null;
    }



    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.insert(list, 1);
        LinkedList.insert(list, 2);
        LinkedList.insert(list, 4);
        LinkedList.insert(list, 3);

        LinkedList list2 = new LinkedList();
        LinkedList.insert(list2, 3);
        LinkedList.insert(list2, 2);
        LinkedList.insert(list2, 1);
        LinkedList.insert(list2, 4);
        LinkedList.insert(list2, 3);

        LinkedList.reuseNode(list2, LinkedList.returnNode(list, 2));

        //LinkedList.printList(list);
        //LinkedList.printList(list2);
        intersection(list, list2);


    }

}
