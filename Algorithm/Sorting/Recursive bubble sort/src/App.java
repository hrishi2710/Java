import java.util.Scanner;

class RecursiveBubbleSort{
    int[] sort(int[] arr, int startIndex, int lastIndex){
        if(startIndex == lastIndex)
            return arr;
        else{
            for(int i = startIndex; i<lastIndex;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            return sort(arr, startIndex, lastIndex-1);
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
        RecursiveBubbleSort recursiveBubbleSort = new RecursiveBubbleSort();
        recursiveBubbleSort.sort(arr, 0, arr.length-1);
        System.out.println("The sorted array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
