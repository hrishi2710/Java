package app;


class PreIndex{
    int data;
    PreIndex(int data){
        this.data = data;
    }
}


class PostOrder{
    void printPostOrder(int[] pre){
        PreIndex preIndex = new PreIndex(0);
        printPostOrderUtil(pre , Integer.MIN_VALUE, Integer.MAX_VALUE, pre.length, preIndex);
    }
    void printPostOrderUtil(int[] pre, int minval, int maxval, int size, PreIndex preIndex){
        if(preIndex.data == size)
        return;
        if(pre[preIndex.data] <minval || pre[preIndex.data] > maxval)
        return;
        int val = pre[preIndex.data];
        preIndex.data++;
        printPostOrderUtil(pre, minval, val, size, preIndex);
        printPostOrderUtil(pre, val, maxval, size, preIndex);
        System.out.print( val + " ");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        int[] pre = {10, 5, 1, 7, 40, 50};
        PostOrder postOrder = new PostOrder();
        postOrder.printPostOrder(pre);
    }
}