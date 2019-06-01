import java.util.Scanner;

class SelectionSort{
    int[] swap(int x, int y, int[] arr){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        return arr;
    }

    int[] sort(int[] arr, int startIndex, int lastIndex){
        int min = arr[startIndex];
        if(startIndex == lastIndex)
            return  arr;
        else{
            for(int i =startIndex; i<= lastIndex; i++){
                if(arr [i] < min){
                    min = arr[i];
                    arr [i] = arr[startIndex];
                    arr[startIndex] = min;
                }
            }
            return sort(arr, startIndex+1, lastIndex);
        }
    }
}

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the numbers of array to be sorted:");
        for (int i =0; i<length; i++){
            arr[i] = scanner.nextInt();
        }
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr, 0 , length-1);
        System.out.println("The sorted array");
        for (int i :  arr){
            System.out.print(i + " ");
        }
    }
}
