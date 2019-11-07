package base.binarytree;

import base.MyBinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class TreeZigZagTraversal {

    public static void main(String[] args) {
        MyBinarySearchTree myTree = new MyBinarySearchTree();
        myTree.insert(90);
        myTree.insert(50);
        myTree.insert(20);
        myTree.insert(25);
        myTree.insert(5);
        myTree.insert(75);
        myTree.insert(66);
        myTree.insert(80);
        myTree.insert(150);
        myTree.insert(95);
        myTree.insert(92);
        myTree.insert(111);
        myTree.insert(175);
        myTree.insert(166);
        myTree.insert(200);

        System.out.println(2%2);

        System.out.println("Root     :      " + myTree.root.key);
        System.out.println("2nd level:    " + myTree.root.left.key + " " + myTree.root.right.key);
        System.out.println("3rd level: " + myTree.root.left.left.key + " " + myTree.root.left.right.key
                + " " + myTree.root.right.left.key + " " + myTree.root.right.right.key);
        System.out.println("4th level: " + myTree.root.left.left.left.key + " " + myTree.root.left.left.right.key + " "
                + myTree.root.left.right.left.key + " " + myTree.root.left.right.right.key + " "
                + myTree.root.right.left.left.key + " " + myTree.root.right.left.right.key + " "
                + myTree.root.right.right.left.key + " " + myTree.root.right.right.right.key + " ");

        ArrayList<ArrayList<Integer>> myList = new ArrayList<>();

        printTreeZigZag(myTree.root, myList, 1);

        for(int i = 0; i < myList.size(); i++) {
            if (i % 2 == 1 ) {
                for (int j = 0; j < myList.get(i).size(); j++) {
                    System.out.print(myList.get(i).get(j) + " ");
                }
            } else if (i % 2 == 0) {
                for (int j =  myList.get(i).size()-1; j >= 0; j--) {
                    System.out.print(myList.get(i).get(j) + " ");
                }
            }
        }
    }

    private static void printTreeZigZag(MyBinarySearchTree.Node root, ArrayList<ArrayList<Integer>> myList, int level) {
        if (root == null) {
            return;
        }

        if(myList.size() < level) {
            myList.add(new ArrayList<>());
        }

        myList.get(level-1).add(root.key);
        printTreeZigZag(root.left, myList, level+1);
        printTreeZigZag(root.right, myList, level+1);

    }
}
