
// time O(n)
// space O(1)
class Solution {
    public int rob(int[] nums) {
        int maxPrevNotUsed = 0;
        int maxPrevUsed = 0;
        for (int num : nums) {
        	int temp = maxPrevNotUsed;				//for the current num
        	maxPrevNotUsed = Math.max(maxPrevUsed, maxPrevNotUsed);			//for the next num, it means the current is not selected
        	maxPrevUsed = temp + num;					//for the next num, it means the current is  selected

        }

        return Math.max(maxPrevUsed, maxPrevNotUsed);
    }
}