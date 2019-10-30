import base.LinkedList;

public class LinkedListReverse {

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.append(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        LinkedList.Node myNode = myList.head;
        LinkedList myNewList = new LinkedList();

        while(myNode != null) {
            myNewList.push(myNode.data);
            myNode = myNode.next;
        }

        myNewList.printList();
    }
}
