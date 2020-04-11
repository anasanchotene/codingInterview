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
}
