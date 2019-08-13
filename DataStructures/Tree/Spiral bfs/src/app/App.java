package app;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static void printpostorder(Node node) {
        if (node == null)
            return;
        printpostorder(node.left);
        printpostorder(node.right);
        System.out.print(node.data + " ");
    }

    static void printSpiral(Node node) {
        if (node == null)
            return;
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        Stack<Node> st = new Stack<Node>();
        int size = 0;
        boolean leftTORight = true;
        boolean toStack = false;
        q.add(node);
        while (!q.isEmpty() || !st.isEmpty()) {
            if (!q.isEmpty()) {
                size = q.size();
                if (!toStack && leftTORight) {
                    for (int i = 0; i <size; i++) {
                        Node temp = q.peek();
                        q.remove();
                        if (temp.left != null) {
                            q.add(temp.left);
                        }
                        if (temp.right != null) {
                            q.add(temp.right);
                        }
                        System.out.print(temp.data + " ");
                    }
                    toStack = true;
                }
                else if (toStack && leftTORight) {
                    for (int i = 0; i < size; i++) {
                        Node temp = q.peek();
                        q.remove();
                        if (temp.left != null)
                            st.push(temp.left);
                        if (temp.right != null)
                            st.push(temp.right);
                        System.out.print(temp.data + " ");
                    }
                    toStack = false;
                    leftTORight = false;
                }
                else if(toStack && !leftTORight){
                    for (int i = 0; i < size; i++) {
                        Node temp = q.peek();
                        q.remove();
                        if (temp.right != null)
                            st.push(temp.right);
                        if (temp.left != null)
                            st.push(temp.left);
                        System.out.print(temp.data + " ");
                    }
                    toStack = false;
                    leftTORight = true;
                }
                System.out.println(" ");
            }
            else if (!st.isEmpty()) {
                size = st.size();
                if (!toStack && !leftTORight) {
                    for (int i = 0; i < size; i++) {
                        Node temp = st.peek();
                        st.pop();
                        if(temp.right != null){
                            q.add(temp.right);
                        }
                        if(temp.left != null){
                            q.add(temp.left);
                        }
                        System.out.print(temp.data + " ");
                    }
                    toStack = true;
                }
                else if( !toStack && leftTORight){
                    for (int i = 0; i < size; i++) {
                        Node temp = st.peek();
                        st.pop();
                        if(temp.left != null){
                            q.add(temp.left);
                        }
                        if(temp.right != null){
                            q.add(temp.right);
                        }
                        System.out.print(temp.data + " ");
                    }
                    toStack = true;
                }
                System.out.println(" ");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Node root = new Node(1);
        root.right = new Node(3);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.right = new Node(9);
        root.left.left.left = new Node(8);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(1);
        root.right.left.left = new Node(4);
        root.right.left.right = new Node(2);
        root.right.right.left = new Node(7);
        root.right.right.right = new Node(2);
        root.left.right.left.left = new Node(16);
        root.left.right.left.right = new Node(17);
        root.right.left.right.left = new Node(18);
        root.right.right.left.right = new Node(19);

        //printpostorder(root);
        printSpiral(root);

    }
}