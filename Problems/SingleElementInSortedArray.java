package Problems;

public class SingleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length-2;
        // 1,1,2,3,3,4,4,8,8
        //   h l

        while(low <= high)
        {
            int mid = (low+high) >> 1;
            if(nums[mid] == nums[mid^1]) //prev odd or next even
                low = mid+1;
            else high = mid-1;
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
}
