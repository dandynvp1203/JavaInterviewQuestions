package base.binarytree;

import base.MyBinarySearchTree;

import java.util.ArrayList;

public class PrintLevelFromOutside {

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
        int k = 2;
        ArrayList<Integer> myArray = new ArrayList<>();
        //printFromOuter(myTree.root, k);
        //printFromOuter(myTree.root, 2);

        printFromOuter(myTree.root, 4, myArray);

        System.out.print("\n");
        for (Integer item: myArray) {
            System.out.print(item + " ");
        }

        int i = 0;
        int j = myArray.size()-1;
        System.out.println("\nPrinting from outside: ");
        while (i < j) {
            System.out.print(myArray.get(i) + " " + myArray.get(j) + " ");
            i++;
            j--;
            if (i == j) {
                System.out.print(myArray.get(i));
            }
        }
    }

    private static void printFromOuter(MyBinarySearchTree.Node root, int level, ArrayList<Integer> arrayList) {
        if (root == null) {
            return;
        }

        if (level == 1) {
            arrayList.add(root.key);
            System.out.print(root.key + " ");
        } else if (level > 1) {
            printFromOuter(root.left, level -1, arrayList);
            printFromOuter(root.right, level -1, arrayList);
        }
    }
}
