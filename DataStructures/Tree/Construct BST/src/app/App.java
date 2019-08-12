package app;

class Node {
    int data;
    Node parent;
    Node left;
    Node right;
    Node( int data){
        this.data = data;
        left = null;
        right = null;
        parent = null;
    }
    
}

class BST{
    Node root;
    BST(){
        root = null;
    }
    void insertUtil(Node root, int data){
        if(root == null){
            root = new Node(data);
            return;
        }
        else if(data < root.data){
            if(root.left == null)
            root.left = new Node(data);
            else
            insertUtil(root.left, data);
        }
        else{
            if(root.right == null)
            root.right = new Node(data);
            else
            insertUtil(root.right, data);
        }
        
    }
    void insert(int data){
        if(root == null)
        root = new Node(data);
        else
        insertUtil(root,data);
    } 
    
    void inorder(Node root){
        if(root == null)
        return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        BST bst = new BST();
        bst.insert(20);
        bst.insert(10);
        bst.insert(30);
        bst.insert(5);
        bst.insert(12);
        bst.inorder(bst.root);
    }
}