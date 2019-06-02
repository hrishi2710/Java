import java.util.Scanner;

class MergeSort{
    void sort(int[] arr, int firstIndex, int lastIndex){

        if(firstIndex<lastIndex){
            int mid = (firstIndex+lastIndex)/2;
            sort(arr, firstIndex, mid);
            sort(arr, mid+1, lastIndex);
            merge(arr, firstIndex, mid, lastIndex);
        }
    }

    void merge(int[] arr, int firstIndex, int mid, int lastIndex){
        int length1 = mid-firstIndex+1;
        int length2 = lastIndex-mid;
        int[] left = new int[length1];
        int[] right = new int[length2];
        for(int i =0; i<length1; ++i)
            left[i] = arr[firstIndex+i];
        for(int i = 0; i< length2; ++i)
            right[i] = arr[mid+1+i];
        int i =0;
        int j = 0;
        int k = firstIndex;
        while( i < length1 && j < length2){
            if(left[i] <=right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<length1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<length2){
            arr[k] = right[j];
            j++;
            k++;
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
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, length-1);
        System.out.println("The sorted array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
