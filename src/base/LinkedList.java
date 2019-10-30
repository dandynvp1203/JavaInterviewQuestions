package base;

public class LinkedList {
    public Node head;

    public class Node {
        int data;
        public Node next;
        Node (int d) {
            data = d;
            next = null;
        }

        public Node getNext() {
            return next;
        }
    }

    public Node getHead() {
        return head;
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void addData(int newData) {
        if (head == null) {
            return;
        }

        Node tempNode = null;
        if (head.next != null) {
            tempNode = head.next;
        }

        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }

        if (tempNode.next == null) {
            tempNode.next = new Node(newData);
        }

    }
}
