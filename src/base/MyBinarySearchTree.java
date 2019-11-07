package base;

public class MyBinarySearchTree {

    public static class Node{
        public int key;
        public Node left, right;

         public Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    public Node root;

    public MyBinarySearchTree(int key) {
        root = new Node(key);
    }

    public MyBinarySearchTree() {
        root = null;
    }


    //****** PRINT AT GIVEN LEVEL *******
    public void printGivenLevel (Node root, int level) {
        if (root == null) {
            return;
        }

        if (level == 1) {
            System.out.print(root.key + " ");
        } else if (level > 1) {
            printGivenLevel(root.left, level -1);
            printGivenLevel(root.right, level -1);
        }
    }


    //****** INSERTION ********
    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    //***** PRINT IN ORDER *******
    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.key);
            inOrderRec(root.right);
        }
    }


    //****** Search *******
    public  Node doSearch(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }

        if (root.key > key) return doSearch(root.left, key);

        return doSearch(root.right, key);
    }

    //****** Deletion ******

    public void deleteKey(int key)
    {
        root = deleteRec(root, key);
    }

    /* A recursive function to insert a new key in BST */
    Node deleteRec(Node root, int key)
    {
        /* Base Case: If the tree is empty */
        if (root == null)  return null;

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);

            // if key is same as root's key, then This is the node
            // to be deleted
        else
        {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    int minValue(Node root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
}
