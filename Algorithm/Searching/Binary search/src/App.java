import java.util.Arrays;
import java.util.Scanner;

class BinarySearch{
    int search(int arr[] , int key, int firstindex, int lastindex){
        int mid = firstindex + ((lastindex-firstindex)/2);
        if(firstindex <= lastindex) {
            if(arr[mid] == key)
                return  mid;
            if(arr[mid]>key)
                return search(arr , key, firstindex, mid-1);
            if(arr[mid]<key)
                return search(arr, key, mid+1, lastindex);
        }
        return  -1;
    }
}

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BinarySearch binarySearch = new BinarySearch();
        int[] arr;
        System.out.println("Enter the length of array");
        int length = scanner.nextInt();
        arr = new int[length];
        System.out.println("Enter the numbers of array");
        for(int i = 0; i<length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int key = scanner.nextInt();
        int result = binarySearch.search(arr, key, 0, arr.length-1);
        if(result == -1)
            System.out.println("The number not found");
        else
            System.out.println("The number is at index:" + result);
    }
}
