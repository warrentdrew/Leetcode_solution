//time O(n)
//space O(1)
//using dynamic programming (the relationship of accumulated value and the current)
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int res = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
        	sum = Math.max(nums[i], sum + nums[i]);
        	res = Math.max(res, sum);
        }
        return res;
    }
}