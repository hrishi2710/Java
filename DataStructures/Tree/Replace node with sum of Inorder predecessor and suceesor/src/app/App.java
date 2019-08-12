package app;
import java.util.Vector;
class Node{
    int data;
    Node left;
    Node right;
    Node(int key){
        data = key;
        left = null;
        right = null;
    }
}


class Solution{

    static class INT{
        int data;
    }

    void sumTree(Node root){
        if(root == null)
        return ;

        Vector<Integer> arr = new Vector<Integer>();
        arr.add(0);

        storeInorderTraversal(root, arr);
        arr.add(0);
        INT i = new INT();
        i.data = 1;
        sumTreeUtil(root, arr, i);
    }

    void storeInorderTraversal(Node root, Vector<Integer> arr){
        if(root == null)
        return;
        storeInorderTraversal(root.left, arr);
        arr.add(root.data);
        storeInorderTraversal(root.right, arr);
    }

    void sumTreeUtil(Node root, Vector<Integer> arr, INT i){
        if(root == null)
        return ;
        sumTreeUtil(root.left, arr, i);
        root.data = arr.get(i.data-1)+arr.get(i.data+1);
        i.data++;
        sumTreeUtil(root.right, arr, i);
    }

    void inOrder(Node root){
        if(root == null)
        return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
}

public class App {
    
    public static void main(String[] args) throws Exception {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Solution solution = new Solution();
        solution.inOrder(root);
        solution.sumTree(root);
        System.out.println("");
        solution.inOrder(root);
    }
}