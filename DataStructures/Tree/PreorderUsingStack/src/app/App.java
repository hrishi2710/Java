package app;

import java.util.Stack;

class Node {
    int data;
    Node left;
    Node right;

    Node(int d) {
        data = d;
        left = null;
        right = null;
    }
}

class Tree {
    Node root;

    void preorder() {
        if (root == null)
            return;
        Stack<Node> stack = new Stack<Node>();
        Node curr = root;
        stack.push(curr);
        while (stack.size() > 0) {
                System.out.print(stack.pop().data + " ");
                if (curr.right != null)
                    stack.push(curr.right);
                if (curr.left != null)
                    stack.push(curr.left);
                if(stack.size()>0)
                curr = stack.peek();
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.preorder();
    }
}