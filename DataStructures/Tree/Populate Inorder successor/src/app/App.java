package app;



public class App {

    static class Node{
        Node left;
        Node right;
        Node next;
        int data;
        Node(int data){
            this.data = data;
            left= right = next = null;
        }
    }

    static void printInorder(Node node){
        if(node == null)
        return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
    static Node next = null;
    static void populateNext(Node node){
       
        if(node != null){
            populateNext(node.right);
            node.next = next;
            next = node;
            populateNext(node.left);
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
        printInorder(root);
        populateNext(root);
    }
}