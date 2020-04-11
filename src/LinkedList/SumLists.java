package LinkedList;

public class SumLists {
    public static LinkedList sumLists (LinkedList list1, LinkedList list2) {
        boolean over9 = false;
        boolean otherOver = false;
        LinkedList.Node list1Node = list1.head;
        LinkedList.Node list2Node = list2.head;
        LinkedList result = new LinkedList();

        while (list1Node != null || list2Node != null){
            int node1 = list1Node.data;
            int node2 = list2Node.data;
            int sum = node1 + node2;

            if (over9) sum ++;
            if (sum - 9 > 0){
                over9 = true;
                sum = sum - 10;
            }
            else over9 = false;

            LinkedList.insert(result, sum);

            list1Node = list1Node.next;
            list2Node = list2Node.next;

        }


        return result;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList response = new LinkedList();

        LinkedList.insert(list, 7);
        LinkedList.insert(list, 1);
        LinkedList.insert(list, 6);
        LinkedList.insert(list2, 5);
        LinkedList.insert(list2, 9);
        LinkedList.insert(list2, 2);

        response = sumLists(list, list2);
        LinkedList.printList(response);

    }
}
