class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int n = nums.length;
        int csum = 0;

        if (n == 1) {
            return nums[0];
        }

        for (int i = 0; i < n; i++) {
            csum = Math.max(nums[i], csum + nums[i]);
            sum = Math.max(csum, sum);
        }

        return sum;
    }
}
