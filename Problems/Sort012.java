package Problems;

import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) arr[i] = s.nextInt();

        sortArray(arr, size);
    }

    static void sortArray(int[] arr, int n) {
        //3 pointer - low,mid,high
        int low=0, mid=0, high=n-1;

        //algo
        while(mid <= high) {
            if(arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++; mid++;
            }

            else if(arr[mid] == 1) mid++;

            else if(arr[mid] == 2) {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }

        for(int i:arr) System.out.print(i+" ");
    }
}
