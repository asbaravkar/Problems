package Problems;

import java.util.Arrays;

public class GetMinDiff {
    static int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];

        int smallest = arr[0]+k;
        int largest = arr[n-1]-k;

        int min, max;

        for(int i=0; i<n-1; i++)
        {
            min = Math.min(smallest, arr[i+1]-k);
            max = Math.max(largest, arr[i]+k);
            if(min < 0) continue;
            ans = Math.min(ans, max-min);
        }
        return ans;
    }

    public static void main(String[] args) {
        int k = 2;
        int[] arr = new int[]{1, 5, 8, 10};
        System.out.println(getMinDiff(arr,arr.length, k));
    }
}
