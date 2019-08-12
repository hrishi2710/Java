package app;

import java.util.Vector;

import app.Solution.Node;

class Solution{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    void printPreOrder(Node node){
        if(node == null)
        return;
        System.out.print(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    Vector<Node> getAllTrees(int[] in, int start, int end){
        Vector<Node> trees = new Vector<Node>();

        if(start>end){
            trees.add(null);
            return trees;
        }

        for(int  i =start; i<=end; i++){
            Vector<Node> ltrees = getAllTrees(in, start, i-1);
            Vector<Node> rtrees = getAllTrees(in, i+1, end);

            for(int j =0; j<ltrees.size(); j++){
                for(int k = 0; k<rtrees.size(); k++){

                    Node root = new Node(in[i]);
                    root.left = ltrees.get(j);
                    root.right = rtrees.get(k);
                    trees.add(root);
                }
            }
        }

        return trees;
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");
        int[] in = {4,5,7};
        Solution solution = new Solution();
        Vector<Node> trees = solution.getAllTrees(in, 0, in.length-1);
        for(int i =0; i< trees.size(); i++){
            solution.printPreOrder(trees.get(i));
            System.out.println("");
        }
    }
}