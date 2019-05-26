package app;

class Node {
    int data;
    Node left, right, parent;

    Node(int d) {
        data = d;
        left = null;
        right = null;
        parent = null;
    }
}

class BST {
    Node root;

    void insert(int key) {
        Node new_node = new Node(key);
        Node curr = root;
        if (curr == null) {
            root = new_node;
        } else {
            while (true) {
                if (key < curr.data) {
                    if (curr.left == null) {
                        curr.left = new_node;
                        new_node.parent = curr;
                        break;
                    } else
                        curr = curr.left;
                }
                if (key > curr.data) {
                    if (curr.right == null) {
                        curr.right = new_node;
                        new_node.parent = curr;
                        break;
                    } else
                        curr = curr.right;
                }
            }
        }
    }

    void preorder(Node root) {
        if (root == null)
            return;
        Node temp = root;
        System.out.print(temp.data + " ");
        preorder(temp.left);
        preorder(temp.right);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(10);
        bst.insert(6);
        bst.insert(3);
        bst.insert(4);
        bst.insert(1);
        bst.preorder(bst.root);
    }
}