package base;

public class MyBinaryTree {

    public static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    static Node root;

    MyBinaryTree(int key) {
        root = new Node(key);
    }

    MyBinaryTree() {
        root = null;
    }
}
