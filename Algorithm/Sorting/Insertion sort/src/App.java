import java.util.Scanner;

class InsertionSort{
    static void sort(int[] arr){
        if(arr.length<=1)
            return;
        else{
            for(int i =1; i<arr.length; i++){
                if(arr[i]< arr[i-1]){
                    insert(arr, arr[i], 0, i);
                }
            }
        }
    }
    static void insert(int[] arr, int num, int startIndex, int lastIndex){
        for (int i =startIndex; i<= lastIndex-1; i++){
            if(arr[i]> num){
                shiftarray(arr, i, lastIndex-1);
                arr[i] = num;
                break;
            }
        }
    }

    static void shiftarray(int[] arr, int startIndex, int lastIndex){
        for(int i = lastIndex+1; i>startIndex; i--){
            arr[i] = arr[i-1];
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
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        System.out.println("The sorted array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
