import base.MyLinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListRemoveDuplicate {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(1);
        myLinkedList.append(1);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(2);
        myLinkedList.append(2);
        myLinkedList.append(4);
        myLinkedList.append(4);
        myLinkedList.append(4);
        myLinkedList.append(4);
        myLinkedList.append(4);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(6);

        myLinkedList.printList();

        removeDuplicate(myLinkedList);

        myLinkedList.printList();
    }

    private static void removeDuplicate(MyLinkedList myLinkedList) {
        MyLinkedList.Node current = myLinkedList.head;
        MyLinkedList.Node tempNode = current;

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
