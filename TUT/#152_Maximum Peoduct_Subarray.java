//time O(n)
//space O(1)

class Solution {
    public int maxProduct(int[] nums) {
    	if (nums == null || nums.length == 0) return 0;
    	int max = nums[0];
    	int min = nums[0];
    	int res = nums[0];
    	for (int i = 1; i < nums.length; i++) {
    		temp = max;
    		max = Math.max(max * nums[i], min * nums[i], nums[i]);
    		min = Math.min(max * nums[i], min * nums[i], nums[i]);
    		res = Math.max(max, res);
    	}
    	return res;
        
    }
}