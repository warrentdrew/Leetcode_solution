// time: O(n)
// space: O(1)
//two pointer: i  index
// c count (length of the array)
//nums is a sorted list
class Solution {
    public int removeDuplicates(int[] nums) {
    	if (nums == null || nums.length == 0) return 0;
    	int count = 1;
    	for (int i = 1; i < nums.length; i++) {
    		if (nums[i - 1] != nums[i]) {
    			nums[count++] = nums[i];
    		}
    	}
    	return count;
    }
}