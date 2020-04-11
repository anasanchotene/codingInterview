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
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
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