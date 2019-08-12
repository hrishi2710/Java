package app;



class Node{
    int key;
    Node left;
    Node right;
    Node(int key){
        this.key = key;
        left = null;
        right = null;
    }
}

class BSTtree{
    int findLargerIndex(int key, int arr[], int lo, int hi){
        if(arr.length == 0){
            return -1;
        }
        for(int i = lo; i<=hi; i++){
            if(arr[i]> key)
            return i;
        }
        return -1;
    }
    Node buildBst(int[] pre, int lo, int hi){
        if(lo>hi)
        return null;
        Node root = new Node(pre[lo]);
        if(lo == hi)
        return root;
        int index = findLargerIndex(pre[lo], pre, lo, hi);
        root.left = buildBst(pre, lo+1, index-1);
        root.right = buildBst(pre, index, hi);
        return root;
    }
    void printInorder(Node root){
        if (root == null)
        return;
        printInorder(root.left);
        System.out.print(root.key + " ");
        printInorder(root.right);
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        int pre[] = {10, 5, 1, 7, 40,50};
        BSTtree bsTtree = new BSTtree();
        Node root = bsTtree.buildBst(pre, 0 , pre.length-1);
        bsTtree.printInorder(root);
    }
}