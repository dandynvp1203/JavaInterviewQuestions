package base;

public class LinkedList {
    public Node head;

    public class Node {
        public int data;
        public Node next;
        Node (int d) {
            data = d;
            next = null;
        }

        public Node getNext() {
            return next;
        }

        public int getData() { return data; }
    }

    public void printList() {
        System.out.print("Linked list:");
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(" [Node->" + currentNode.data + ']');
            currentNode = currentNode.next;
        }
        System.out.println('\n');
    }

    public Node getHead() {
        return head;
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void append(int newData) {
        /*
            1. Allocate the Node & put in data
            2. Set next as null
            3. if the linked list is empty, then make the node as head
            4. Else traverse till the last node
            5. Change the next of the last node
         */

        Node newNode = new Node(newData);

        if (head == null) {
            head = new Node(newData);
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }

    }
}
