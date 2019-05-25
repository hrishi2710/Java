package app;

import java.util.Stack;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data = d;
        left = null;
        right = null;
    }
}

class Tree{
    Node root;
    void inorderTraversal(){
        Stack<Node> stack = new Stack<Node>();
        if(root == null)
        return;
        Node curr = root;
        while(curr != null || stack.size()>0){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr= stack.pop();
            System.out.print(curr.data+ " ");
            curr = curr.right;
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

        tree.inorderTraversal();
    }
}