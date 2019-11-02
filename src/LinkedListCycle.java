import base.MyLinkedList;
import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.push(10);
        myLinkedList.push(20);
        myLinkedList.push(30);
        myLinkedList.push(40);

        myLinkedList.head.next.next.next.next = myLinkedList.head;

        //findLoopTraversal(linkedList);

        findLoopMap(myLinkedList);
    }

    public static void findLoopMap(MyLinkedList list) {
        Set<MyLinkedList.Node> mySet = new HashSet<>();
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

    public static void findLoopTraversal(MyLinkedList list) {
        boolean found = false;
        MyLinkedList.Node slowNode = list.getHead();
        MyLinkedList.Node fastNode = list.getHead();
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
