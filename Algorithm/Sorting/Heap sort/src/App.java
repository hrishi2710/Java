import java.util.Scanner;

class HeapSort{
    void sort(int[] arr, int firstIndex, int lastIndex){
        if(lastIndex>firstIndex){
            for(int i = (lastIndex-1)/2; i >= firstIndex; i--){
                if((2*i)+1 <= lastIndex){
                    if(arr[i]< arr[(2*i)+1]){
                        int temp = arr[i];
                        arr[i] = arr[(2*i)+1];
                        arr[(2*i)+1] = temp;
                    }
                    if((2*i)+2 <= lastIndex){
                        if(arr[i]< arr[(2*i)+2]){
                            int temp = arr[i];
                            arr[i] = arr[(2*i)+2];
                            arr[(2*i)+2] = temp;
                        }
                    }
                }

            }
            int temp = arr[firstIndex];
            arr[firstIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
            sort(arr, firstIndex, lastIndex-1);
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
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr, 0,length-1);
        System.out.println("The sorted array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
