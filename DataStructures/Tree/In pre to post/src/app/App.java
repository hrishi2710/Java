package app;

import java.util.Arrays;

class Postorder{

    public int findIndex(int[] arr, int num){
        int result = -1;
        for(int i = 0; i< arr.length; i++){
            if(num == arr[i]){
                result = i;
            }
        }
        return result;
    }
    public void toPostOrder(int[] pre, int in[] ){
        
        int root = pre[0];
        int index = findIndex(in, root);
        if(index != 0){
            toPostOrder(Arrays.copyOfRange(pre, 1, index+1), Arrays.copyOfRange(in, 0, index));
        }
        if(index != pre.length-1){
            toPostOrder(Arrays.copyOfRange(pre, index+1, pre.length), Arrays.copyOfRange(in, index+1, pre.length));
        }
        System.out.print(pre[0]);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        int[] pre = {1,2,4,5,3,6};
        int[] in = {4,2,5,1,3,6};
        Postorder postorder = new Postorder();
        postorder.toPostOrder(pre, in);
    }
}