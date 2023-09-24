package AssignmentDay15;
import java.util.HashMap;
import java.util.Map;

public class BinaryDemo {
    private class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    private Node root;

    public BinaryDemo() {
        root = null;
    }

    public void add(int key) {
        root = addRecursive(root, key);
    }

    private Node addRecursive(Node current, int key) {

        if (current == null) {
            return new Node(key);
        }

        if (key < current.key) {
            current.left = addRecursive(current.left, key);
        } else if (key > current.key) {
            current.right = addRecursive(current.right, key);
        }

        return current;
    }

    public void display() {
        displayTree(root);
    }

    private void displayTree(Node node) {
        if (node != null) {
            displayTree(node.left);
            System.out.print(node.key + " ");
            displayTree(node.right);
        }
    }

    public static void main(String[] args) {
      BinaryDemo bst = new BinaryDemo();
        bst.add(56);
        bst.add(30);
        bst.add(70);
        bst.display();
    }
}