package datastucture;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(1);
        myList.add(4);
        myList.add(5);
        myList.add(3);
        System.out.println(myList);
        reverseLinkedList(myList);
    }

    private static void reverseLinkedList(LinkedList<Integer> myList) {
        Stack<Integer> myStack = new Stack<>();
        LinkedList<Integer> newList = new LinkedList<>();
        for(Integer item: myList) {
            myStack.push(item);
        }

        while(!myStack.empty()) {
            newList.add(myStack.pop());
        }

        System.out.println(newList);
    }
}
