package base.binarytree;

import base.MyBinarySearchTree;
public class MergeTwoTree {

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

        MyBinarySearchTree myTree1 = new MyBinarySearchTree();
        myTree1.insert(90);
        myTree1.insert(50);
        myTree1.insert(20);
        myTree1.insert(25);
        myTree1.insert(5);
        myTree1.insert(75);
        myTree1.insert(66);
        myTree1.insert(80);
        myTree1.insert(150);
        myTree1.insert(95);
        myTree1.insert(92);
        myTree1.insert(111);
        myTree1.insert(175);
        myTree1.insert(166);
        myTree1.insert(200);

        MyBinarySearchTree myTree2 = new MyBinarySearchTree();

        myTree2.root = mergeTwoTrees(myTree.root, myTree1.root);

        System.out.println("Root     :      " + myTree2.root.key);
        System.out.println("2nd level:    " + myTree2.root.left.key + " " + myTree2.root.right.key);
        System.out.println("3rd level: " + myTree2.root.left.left.key + " " + myTree2.root.left.right.key
                + " " + myTree2.root.right.left.key + " " + myTree2.root.right.right.key);
        System.out.println("4th level: " + myTree2.root.left.left.left.key + " " + myTree2.root.left.left.right.key + " "
                + myTree2.root.left.right.left.key + " " + myTree2.root.left.right.right.key + " "
                + myTree2.root.right.left.left.key + " " + myTree2.root.right.left.right.key + " "
                + myTree2.root.right.right.left.key + " " + myTree2.root.right.right.right.key + " ");
    }

    private static MyBinarySearchTree.Node mergeTwoTrees(MyBinarySearchTree.Node root, MyBinarySearchTree.Node root1) {
        if (root == null && root1 != null) {
            return root1;
        } else if (root != null && root1 == null) {
            return root;
        } else if (root == null && root1 == null) {
            return null;
        } else {
            MyBinarySearchTree.Node newNode = new MyBinarySearchTree.Node(0);
            newNode.key = root.key + root1.key;
            newNode.left = mergeTwoTrees(root.left, root1.left);
            newNode.right = mergeTwoTrees(root.right, root1.right);
            return newNode;
        }
    }
}
