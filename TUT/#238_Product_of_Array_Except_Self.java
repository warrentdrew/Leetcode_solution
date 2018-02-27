// time O(n)
// space O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
    	if (nums == null || nums.length == 0) return nums;
    	int[] res = new int[nums.length];
    	res[0] = 1;
    	int left = 1;
    	for (int i = 1; i < nums.length; i++) {
    		res[i] = nums[i - 1] * left;
    		left = left * nums[i - 1];
    	}
    	int right = 1;
    	for (int i = nums.length - 1; i >=0; i--) {
    		res[i] = res[i] * right;
    		right = right * nums[i]; 
    	}

    	return res;   
    }
}