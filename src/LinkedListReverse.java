import base.MyLinkedList;

public class LinkedListReverse {

    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList.append(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        MyLinkedList.Node myNode = myList.head;
        MyLinkedList myNewList = new MyLinkedList();

        while(myNode != null) {
            myNewList.push(myNode.data);
            myNode = myNode.next;
        }

        myNewList.printList();
    }
}
