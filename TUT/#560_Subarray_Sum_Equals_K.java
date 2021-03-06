//two sum concept
//use hash map
//time: O(n)
//space: O(n) because of hashmap
// key is the sum, val is the num of this sum
class Solution {
    public int subarraySum(int[] nums, int k) {
 		if (nums == null || nums.length == 0) return 0;
 		int res = 0;
 		int sum = 0;
 		HashMap<Integer, Integer> map = new HashMap<>();
 		map.put(0, 1); 
 		for (int i = 0; i < nums.length; i++) {
 			sum += nums[i];
 			if (map.containsKey(sum - k)) {
 				res += map.get(sum - k);
 			}
 			map.put(sum, getOrDefault(sum, 0) + 1);
 		}
 		return res;
    }
}