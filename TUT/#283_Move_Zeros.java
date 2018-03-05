//time O(n)
//space O(1)
//the problem ask to use as few operations as possible
//this will lead to two situations: few zeros / lots of zeros
class Solution {
	// the num of operation is nums.length always
    public void moveZeroes1(int[] nums) {
    	if (nums == null || nums.length == 0) return;
    	int start = 0; // pointer for current value signing position
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] != 0) {
    			nums[start++] = nums[i];
    		}
    	}
    	while (start < nums.length) {
    		nums[start++] = 0;
    	} 	
    }
    // the num of operations is 2 * num of non-zero elements in array, a swap is considered as 2 operations
    public void moveZeroes1(int[] nums) {
    	if (nums == null || nums.length == 0) return;
    	for (int i = 0, start =0; i < nums.length; i++) {
    		if (nums[i] != 0) {
    			temp = nums[i];
    			nums[i] = nums[start];
    			nums[start] = temp;
    			start++;
    		}
    	}
    }
}