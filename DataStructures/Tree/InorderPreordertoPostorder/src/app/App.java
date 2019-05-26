package app;

import java.util.Arrays;

public class App {

    static int searchInArray(int a[], int key){
        int length = a.length;
        for(int i =0; i<length; i++){
            if(a [i] == key)
            return i;
        }
        return -1;
    }

    static void printPostorder(int in[], int pre[]){
        int root = searchInArray(in, pre[0]);
        /*Printing postorder of left subtree */
        if(root != 0){
            printPostorder(Arrays.copyOfRange(in, 0, root), Arrays.copyOfRange(pre, 1, root+1));
        }
        /*Printing postorder of right subtree */
        if(root != (in.length-1)){
            printPostorder(Arrays.copyOfRange(in, root+1, in.length), Arrays.copyOfRange(pre, root+1, in.length));
        }
        System.out.print(pre[0] + " ");
    }




    public static void main(String[] args) throws Exception {
        int in[] = {4,8,2,5,9,1,6,3,10,7,11};
        int pre[] = {1,2,4,8,5,9,3,6,7,10,11};
        System.out.println("Postorder : ");
        printPostorder(in,pre);
    }
}