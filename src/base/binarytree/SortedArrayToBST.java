package base.binarytree;

import base.MyBinarySearchTree;

public class SortedArrayToBST {
    public static void main(String[] args) {
        MyBinarySearchTree myTree = new MyBinarySearchTree();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};

        myTree.root = fromArrayToBST(myTree.root, arr,0, arr.length-1);

        myTree.inOrder();
    }

    private static MyBinarySearchTree.Node fromArrayToBST(MyBinarySearchTree.Node root, int[] array, int start, int end) {
        if (start > end) {
            return null;
        } else {
            int mid = (start+end)/2;
            if(root == null) {
                root = new MyBinarySearchTree.Node(0);
                root.key = array[mid];
            }
            root.left = fromArrayToBST(root.left, array, start, mid-1);
            root.right = fromArrayToBST(root.right, array, mid+1, end);
        }
        return root;
    }
}
