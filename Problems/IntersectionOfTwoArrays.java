package Problems;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        for(int i=0; i<nums1.length; i++)
            s.add(nums1[i]);


        Set<Integer> intersect = new HashSet<>();
        for(int i=0; i<nums2.length; i++)
        {
            if(s.contains(nums2[i]))
                intersect.add(nums2[i]);
        }

        int[] ans = new int[intersect.size()];
        int index = 0;
        for(int i:intersect)
        {
            ans[index++] = i;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{4,9,5};
        int[] num2 = new int[]{9,4,9,8,4};
        for(int i:intersection(num1,num2)) System.out.print(i+" ");
    }
}
