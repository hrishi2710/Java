package app;

public class App {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    static int index = 0;
    static Node result = null;
    static Node findNthNode(Node node, int nth){
        if(node == null)
        return null;
        findNthNode(node.left, nth);
        index++;
        if(index == nth)
        result = node;
        findNthNode(node.right, nth);
        return result;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int nth = 4;
        Node nthNode = findNthNode(root, nth);
        System.out.println("The required node: " + nthNode.data);
    }
}