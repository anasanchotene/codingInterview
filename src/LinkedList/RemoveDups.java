package LinkedList;

public class RemoveDups {
    public static void deleteDups (LinkedList head) {
        LinkedList.Node current = head.head;
        while (current != null) {
            LinkedList.Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;

        }
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

        LinkedList.printList(list);
        deleteDups(list);
        LinkedList.printList(list);
    }

}
