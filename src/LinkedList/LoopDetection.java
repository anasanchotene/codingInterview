package LinkedList;

public class LoopDetection {
    public static LinkedList.Node loopDetection (LinkedList list) {
        LinkedList.Node mainNode = list.head;
        LinkedList.Node auxNode = list.head;

        while (mainNode != null){

            while (auxNode != null){
                if(mainNode == auxNode) {
                    return mainNode;
                }
                auxNode = auxNode.next;
            }
            mainNode = mainNode.next;

        }
        return null;
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
        LinkedList.insert(list, 4);
        LinkedList.insert(list, 3);

        loopDetection(list);

        LinkedList.printList(list);
    }
}
