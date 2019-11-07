package base.binarytree;

import base.MyBinarySearchTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeLevelOrderTraversal {

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

        System.out.println("Root     :      " + myTree.root.key);
        System.out.println("2nd level:    " + myTree.root.left.key + " " + myTree.root.right.key);
        System.out.println("3rd level: " + myTree.root.left.left.key + " " + myTree.root.left.right.key
                + " " + myTree.root.right.left.key + " " + myTree.root.right.right.key);
        System.out.println("4th level: " + myTree.root.left.left.left.key + " " + myTree.root.left.left.right.key + " "
                + myTree.root.left.right.left.key + " " + myTree.root.left.right.right.key + " "
                + myTree.root.right.left.left.key + " " + myTree.root.right.left.right.key + " "
                + myTree.root.right.right.left.key + " " + myTree.root.right.right.right.key + " ");

        ArrayList<List<Integer>> myArray = new ArrayList<>();

        fromTraversalOrder(myTree.root, myArray, 1);

        for (int i = 0; i < myArray.size(); i++) {
            System.out.print(myArray.get(i));
        }
    }

    private static void fromTraversalOrder(MyBinarySearchTree.Node root, ArrayList<List<Integer>>  myArray, int level) {
        if (root != null) {
            while (myArray.size() < level) {
                myArray.add(new ArrayList<>());
            }

            myArray.get(level-1).add(root.key);
            fromTraversalOrder(root.left, myArray, level+1);
            fromTraversalOrder(root.right, myArray, level+1);
        }
    }
}
