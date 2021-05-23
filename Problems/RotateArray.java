package Problems;

public class RotateArray {

    private static void reverse(int[] nums, int start, int end) {
        int temp;
        while(start < end) {
            temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6,7};
        int k = 3;
        reverse(nums, 0,nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

        for(int i:nums) System.out.print(i+" ");
    }
}
