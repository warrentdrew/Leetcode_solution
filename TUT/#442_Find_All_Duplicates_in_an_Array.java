// time O(n)
// space O(1)
// 1 <= a[i] <= n, this tells us to link the idx with the element
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        for (int i = 0; i < nums.length; i++) {
        	int idx = Math.abs(nums[i]) - 1;
        	if (nums[idx] < 0) {
        		res.add(Math.abs(nums[i]));
        	}
        	nums[idx] = -nums[idx];
        }
        return res;
    }
}