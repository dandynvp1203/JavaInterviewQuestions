package base;

public class LinkedListRemoveDuplicate {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.push(1);
        linkedList.push(1);
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(4);
        linkedList.push(4);
        linkedList.push(4);
        linkedList.push(6);

        LinkedList.Node shortenedHead = removeDuplicate(linkedList);

//        while (shortenedHead.next != null) {
//            System.out.println("Print node: " + shortenedHead.data);
//        }
    }

    private static LinkedList.Node removeDuplicate(LinkedList linkedList) {
        LinkedList.Node current = linkedList.head;
        LinkedList.Node currentNext = current.next;

        System.out.println("current: " + current.data + " currentNext: " + currentNext.data);
//        while (currentNext != null) {
//            if (current.data == currentNext.data) {
//                currentNext = currentNext.next;
//            } else {
//                current.next = currentNext;
//                currentNext = currentNext.next;
//            }
//        }
        return linkedList.head;
    }
}
