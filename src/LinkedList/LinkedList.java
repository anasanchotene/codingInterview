package LinkedList;

public class LinkedList {

    Node head;

    public static class Node {

        int data;
        Node next;

        // Constructor
        public Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert (LinkedList list, int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        return list;
    }

    public static int length (LinkedList list) {
        int size = 0;
        Node listHead = list.head;

        while (listHead.next != null)
            size++;

        return size;
    }

    public static void deleteNode (LinkedList list, LinkedList.Node node) {
        LinkedList.Node listNode = list.head;

        while (listNode != null) {
            if (listNode == node) {
                node.data = node.next.data;
                node.next = node.next.next;
                return;
            }

        }
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }
}