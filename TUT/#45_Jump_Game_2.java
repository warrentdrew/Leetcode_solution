class Solution {
	//greedy algorithm
	//time : O(n)
	//space : O(1)
    public int jump(int[] nums) {
		if (nums == null || nums.length < 2) return 0;
		int res = 0;
		int curMaxArea = 0;
		int maxNext = 0;
		for (int i = 0; i < nums.length - 1; i++) { // the reason for nums.length - 1 is that if the jump reaches the last element in the array
			maxNext = Math.max(maxNext, num[i] + i);								//  do not need to increment res anymore
			if (i == curMaxArea) {
				res++;
				curMaxArea = maxNext;
			}
		}
		return res;
    }
    // bfs, level the res we want to return (namely jump step)
    public int jump(int[] nums) {
		if (nums == null || nums.length < 2) return 0;
		int res = 0;
		int curMaxArea = 0;
		int maxNext = 0;
		int level = 0;
		while ()
		
    }
}