import base.MyLinkedList;

public class LinkedListAddTwoNumbers {
    public static int multiplier = 0;

    public static void main(String[] args) {
        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList1.append(2);
        myLinkedList1.append(4);
        myLinkedList1.append(3);

        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.append(5);
        myLinkedList2.append(6);
        myLinkedList2.append(4);

        linkedListAddTwoNumbers(myLinkedList1, myLinkedList2);
    }

    private static void linkedListAddTwoNumbers(MyLinkedList myLinkedList1, MyLinkedList myLinkedList2) {
        int value1 = getValue(myLinkedList1);
        int value2 = getValue(myLinkedList2);

        int sum = value1 + value2;
        
        generateLinkedListFromSum(sum);

    }

    private static void generateLinkedListFromSum(int sum) {
        MyLinkedList myList = new MyLinkedList();
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

    private static int getValue(MyLinkedList myLinkedList1) {
        MyLinkedList.Node tempNode = myLinkedList1.head;
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
