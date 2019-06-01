import java.util.Scanner;

class BubbleSort{
    void sort(int[] arr){
        boolean notswapped = false;
        if(arr.length<=1)
            return;
        else{
            while( !notswapped) {
                notswapped = true;
                for(int i = 0; i<= arr.length -2; i++){
                    if(arr[i] > arr[i+1]){
                        int temp = arr[i+1];
                        arr[i+1] = arr[i];
                        arr[i] = temp;
                        notswapped = false;
                    }
                }
            }
        }
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the numbers of array to be sorted:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println("The sorted array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
