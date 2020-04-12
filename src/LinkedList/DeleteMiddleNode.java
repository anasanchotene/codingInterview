package LinkedList;

public class DeleteMiddleNode {

    public static void deleteMiddleNode (LinkedList list, LinkedList.Node node) {
        LinkedList.Node runner = list.head;

        while (runner != node && runner.next != null) runner = runner.next;

        runner.data = runner.next.data;
        runner.next = runner.next.next;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        LinkedList.insert(list, 1);
        LinkedList.insert(list, 2);
        LinkedList.insert(list, 4);
        LinkedList.insert(list, 3);
        LinkedList.insert(list, 3);
        LinkedList.insert(list, 2);
        LinkedList.insert(list, 1);

        LinkedList.Node node = LinkedList.returnNode(list, 3);

        deleteMiddleNode(list, node);

        LinkedList.printList(list);
    }
}
