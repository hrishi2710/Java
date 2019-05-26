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
    /* To ascertain if certain node is root */
    boolean isLeaf() {
        if (left == null && right == null)
            return true;
        return false;
    }
}

public class App {

    static class LeafTraversal {
        static boolean compareLeaves(Node root1, Node root2) {
            if (root1 == null || root2 == null)
                return false;
            else {
                Node leaf1 = null;
                Node leaf2 = null;
                Stack<Node> stack1 = new Stack<Node>();
                Stack<Node> stack2 = new Stack<Node>();
                stack1.push(root1);
                stack2.push(root2);
                /* comparing leaves till every leaf is visited */
                while (stack1.size() > 0 || stack2.size() > 0) {
                    /* getting first leaf of tree1 */
                    while(true){
                        if(root1.isLeaf()){
                            leaf1 = root1;
                            stack1.pop();
                            if(!stack1.isEmpty())
                            root1 = stack1.peek();
                            break;
                        }
                        else{
                            stack1.pop();
                            if(root1.right != null)
                            stack1.push(root1.right);
                            if(root1.left != null)
                            stack1.push(root1.left);
                            root1 = stack1.peek();
                        }
                    }
                    /* getting first leaf of tree2 */
                    while(true){
                        if(root2.isLeaf()){
                            leaf2 = root2;
                            stack2.pop();
                            if(!stack2.isEmpty())
                            root2 = stack2.peek();
                            break;
                        }
                        else{
                            stack2.pop();
                            if(root2.right != null)
                            stack2.push(root2.right);
                            if(root2.left != null)
                            stack2.push(root2.left);
                            root2 = stack2.peek();
                        }
                    }
                    /* if the leaf are not same return false */
                    if(leaf1.data != leaf2.data)
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) throws Exception {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.right = new Node(5);
        root1.right.left = new Node(4);
        Node root2 = new Node(1);
        root2.left = new Node(5);
        root2.right = new Node(6);
        root2.right.right = new Node(4);
        System.out.print("The leaves are same:" + LeafTraversal.compareLeaves(root1,root2));
    }
}