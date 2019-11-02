package base;

public class BinarySearchTreeExample {

    public static void main(String[] args) {

        MyBinarySearchTree myTree = new MyBinarySearchTree();
        myTree.insert(50);
        myTree.insert(30);
        myTree.insert(20);
        myTree.insert(40);
        myTree.insert(70);
        myTree.insert(60);
        myTree.insert(80);

    /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */

        System.out.println("Root: " + myTree.root.key);

        if ( myTree.doSearch(myTree.root, 20) != null) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        myTree.deleteKey(50);
        myTree.inOrder();
    }
}
