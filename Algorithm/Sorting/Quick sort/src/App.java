import java.util.Scanner;

class QuickSort{
    void sort(int[] arr, int firstIndex, int lastIndex){
        if(firstIndex< lastIndex){
            int pivot = partition(arr, firstIndex, lastIndex);
            sort( arr, firstIndex, pivot-1);
            sort(arr, pivot+1, lastIndex);
        }
    }

    int partition(int[] arr, int firstIndex, int lastIndex){
        int pivot = arr[lastIndex];
        int i = firstIndex-1;
        for(int j = firstIndex; j<lastIndex;j++){
            if(arr[j]<= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[lastIndex];
        arr[lastIndex] = temp;
        return i+1;
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
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr, 0, length-1);
        System.out.println("The sorted array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
