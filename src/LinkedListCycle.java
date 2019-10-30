import base.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(10);
        linkedList.push(20);
        linkedList.push(30);
        linkedList.push(40);

        linkedList.head.next.next.next.next = linkedList.head;

        //findLoopTraversal(linkedList);

        findLoopMap(linkedList);
    }

    public static void findLoopMap(LinkedList list) {
        Set<LinkedList.Node> mySet = new HashSet<>();
        boolean found = false;
        while(list.getHead() != null) {
            if (mySet.contains(list.head)) {
                System.out.println("Loop found!");
                found = true;
                break;
            } else {
                mySet.add(list.head);
            }
            list.head = list.getHead().getNext();
        }

        if(!found) {
            System.out.println("Not found");
        }
    }

    public static void findLoopTraversal(LinkedList list) {
        boolean found = false;
        LinkedList.Node slowNode = list.getHead();
        LinkedList.Node fastNode = list.getHead();
        while ( slowNode != null && fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if ( slowNode == fastNode) {
                System.out.println("Loop found!");
                found = true;
                break;
            }
        }

        if (!found) System.out.println("Loop not found");
    }
}
