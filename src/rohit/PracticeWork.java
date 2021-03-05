package rohit;

public class PracticeWork {

    private static int movesToMakeZigzag(int[] nums) {
        if (nums == null || nums.length <= 1) return 0;
        int odd = 0;
        int even = 0;
        // we want odd bigger, just dec even  9 6 1 6 2
        for (int i = 0; i < nums.length; i+=2) {
            if (i == 0) {
                odd += Math.max(0, nums[i] - nums[i+1] + 1);
            } else if (i == nums.length - 1) {
                odd += Math.max(0, nums[i] - nums[i-1] + 1);
            } else {
                odd += Math.max(0, nums[i] - nums[i-1] + 1);
                int tmp = nums[i] - Math.max(0, nums[i] - nums[i-1] + 1); // when u decrese for the left, it also contribute to the right;
                odd += Math.max(0, tmp - nums[i+1] + 1);
            }
        }
        // we want even bigger, just dec odd
        for (int i = 1; i < nums.length; i+=2) {
            if (i == nums.length - 1) {
                even += Math.max(0, nums[i] - nums[i-1] + 1);
            } else {
                even += Math.max(0, nums[i] - nums[i-1] + 1);
                int tmp = nums[i] - Math.max(0, nums[i] - nums[i-1] + 1);
                even += Math.max(0, tmp - nums[i+1] + 1);
            }
        }
        return odd < even ? odd : even;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        System.out.println(movesToMakeZigzag(num));
    }

}


