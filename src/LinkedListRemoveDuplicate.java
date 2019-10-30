import base.LinkedList;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LinkedListRemoveDuplicate {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(1);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(2);
        linkedList.append(2);
        linkedList.append(4);
        linkedList.append(4);
        linkedList.append(4);
        linkedList.append(4);
        linkedList.append(4);
        linkedList.append(3);
        linkedList.append(3);
        linkedList.append(3);
        linkedList.append(6);

        linkedList.printList();

        removeDuplicate(linkedList);

        linkedList.printList();
    }

    private static void removeDuplicate(LinkedList linkedList) {
        LinkedList.Node current = linkedList.head;
        LinkedList.Node tempNode = current;

        Set<Integer> mySet = new HashSet<>();

        if (current != null) mySet.add(current.data);

        while (tempNode.next != null) {
            tempNode = tempNode.next;
            if (current.data == tempNode.data || mySet.contains(tempNode.data)) {
                continue;
            } else {
                mySet.add(tempNode.data);
                current.next = tempNode;
            }
            current = tempNode;
        }

    }
}
