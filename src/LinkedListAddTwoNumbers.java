import base.LinkedList;

import java.util.ArrayList;

public class LinkedListAddTwoNumbers {
    public static int multiplier = 0;

    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.append(2);
        linkedList1.append(4);
        linkedList1.append(3);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.append(5);
        linkedList2.append(6);
        linkedList2.append(4);

        linkedListAddTwoNumbers(linkedList1, linkedList2);
    }

    private static void linkedListAddTwoNumbers(LinkedList linkedList1, LinkedList linkedList2) {
        int value1 = getValue(linkedList1);
        int value2 = getValue(linkedList2);

        int sum = value1 + value2;
        
        generateLinkedListFromSum(sum);

    }

    private static void generateLinkedListFromSum(int sum) {
        LinkedList myList = new LinkedList();
        while (sum != 0) {
            if (multiplier != 1) {
                myList.append(sum%multiplier);
                sum = (sum - (sum%multiplier))/10;
                multiplier /= 10;
            } else {
                myList.append(sum);
                sum = (sum - (sum%multiplier))/10;
            }
        }
        myList.printList();
    }

    private static int getValue(LinkedList linkedList1) {
        LinkedList.Node tempNode = linkedList1.head;
        int value = 0;
        int i = 1;
        while(tempNode != null) {
            value += tempNode.data*i;
            tempNode = tempNode.next;
            i = i*10;
            multiplier = i/10;
        }
        return value;
    }
}
