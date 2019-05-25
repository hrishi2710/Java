package app;

import java.util.Stack;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = null;
        right = null;
    }
}

class Tree {
    Node root;

    void postorder() {
        if (root == null)
            return;
        Stack<Node> stack = new Stack<Node>();
        Node curr = root;
        do {
            if (curr == null) {
                Node temp = stack.pop();
                if(stack.size()==1){
                    if (temp.right == stack.peek()) {
                        curr = stack.pop();
                        stack.push(temp);
                    }
                    else {
                        System.out.print(temp.data + " ");
                        curr = null;
                    }
                }
                else{
                    System.out.print(temp.data + " ");
                }
            } else {
                if (curr.right != null) {
                    stack.push(curr.right);
                    stack.push(curr);
                    curr = curr.left;
                } else {
                    stack.push(curr);
                    curr = curr.left;
                }
            }
        } while (stack.size() > 0);
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

        tree.postorder();
    }
}