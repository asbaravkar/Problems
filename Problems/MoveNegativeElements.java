package Problems;

import java.util.Scanner;

public class MoveNegativeElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size; i++) a[i] = s.nextInt();

        //partition algo
        //pivot = 0
        //small ele to left of pivot
        //greater ele to right of pivot

        int pivot = 0;
        int negativeIndex = 0;

        for(int i=0; i<size; i++) {
            if(a[i] < pivot) {
                int temp = a[negativeIndex];
                a[negativeIndex] = a[i];
                a[i] = temp;
                negativeIndex++;
            }
        }

        for(int i:a) System.out.print(i+" ");
    }
}
