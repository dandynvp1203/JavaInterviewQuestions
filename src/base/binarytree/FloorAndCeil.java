package base.binarytree;

import base.MyBinarySearchTree;
import com.sun.istack.internal.Nullable;

public class FloorAndCeil {

    public static void main(String[] args) {


        MyBinarySearchTree myTree = new MyBinarySearchTree();
        myTree.insert(8);
        myTree.insert(4);
        myTree.insert(12);
        myTree.insert(2);
        myTree.insert(6);
        myTree.insert(10);
        myTree.insert(14);
        myTree.insert(18);

        System.out.println("Root: " + myTree.root.key);

        myTree.inOrder();

        NodeWrapper floor = new NodeWrapper();
        NodeWrapper ceil = new NodeWrapper();
        int k = 5;

        findFloorAndCeiling(myTree.root, floor, ceil, k);
        System.out.println(k + " -> floor is: " + floor.node.key + ", ceil is: " + ceil.node.key);

        NodeWrapper floor1 = new NodeWrapper();
        NodeWrapper ceil1 = new NodeWrapper();
        int j = 21;
        findFloorAndCeiling(myTree.root, floor1, ceil1, j);
        System.out.println(j + " -> floor is: " + floor1.node.key + ", ceil is: " + ceil1.node.key);
    }

    static class NodeWrapper {
        public MyBinarySearchTree.Node node;

        NodeWrapper() {
            this.node = new MyBinarySearchTree.Node(-1);
        }
    }

    private static void findFloorAndCeiling(MyBinarySearchTree.Node root, @Nullable NodeWrapper floor, @Nullable NodeWrapper ceil, int key) {
        if (root == null) {
            return;
        }

        if (root.key == key) {
            floor.node = root;
            ceil.node = root;
        } else if (key < root.key) {
            ceil.node = root;
            findFloorAndCeiling(root.left, floor, ceil, key);
        } else {
            floor.node = root;
            findFloorAndCeiling(root.right, floor, ceil, key);
        }



    }
}
