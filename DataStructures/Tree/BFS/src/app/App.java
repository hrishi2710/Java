package app;

import java.util.LinkedList;
import java.util.Queue;

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

    static void bfs(Node node) {
        Queue<Node> q = new LinkedList<Node>();
        if (node == null)
            return;
        q.add(node);
        while (!q.isEmpty()) {
            Node temp = q.remove();
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
            System.out.print(temp.data + " ");
        }
    }

    public static void main(String[] args) throws Exception {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        bfs(root);
    }
}