package Problems;

import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] ar = new int[size];

        //two pointer approach
        //if both ptr same, move right forward
        //if different swap left+1 and right
        //i-->right ptr, index-->left ptr
        int index = 0;
        for(int i=1; i<ar.length; i++) {
            if(ar[i] != ar[index]) {
                ar[++index] = ar[i];
            }
        }

        System.out.println(index+1);
    }
}
