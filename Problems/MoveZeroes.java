package Problems;

import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int si = s.nextInt();
        int[] a = new int[si];
        for(int i=0; i<si; i++) a[i] = s.nextInt();

        //two pointer approach
        //if zero then right++
        //if non-zero swap(right,left) left++; right++

        int left = 0, right = 0;

        while(right < a.length) {
            if(a[right] == 0) right++;
            if(a[right] != 0) {
                int t = a[right];
                a[right] = a[left];
                a[left] = t;
                right++; left++;
            }
        }

        for(int i:a) System.out.print(i+" ");
    }
}
