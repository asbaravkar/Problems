package Problems;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        // hardcoded inputs
        int[] a1 = new int[]{1,4,7,8,10};
        int[] a2 = new int[]{2,3,9};

        for(int i=0; i<a1.length; i++)
        {
            if(a1[i] > a2[0])
            {
                int temp = a1[i];
                a1[i] = a2[0];
                a2[0] = temp;
            }
            Arrays.sort(a2);
        }

        for(int i:a1) System.out.print(i+" ");
        for(int i:a2) System.out.print(i+" ");
    }
}
