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
        // write your code here
    }

}
