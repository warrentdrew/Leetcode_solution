// time: O(n^2)
//space: O(n)
//dp
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[] = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length; i++) {
        	for (int j = 0; j < i; j++) {
        		if (dp[j] && wordDict.contains(s.subString(j, i))) {
        			dp[i] = true;
        			break;
        		}
        	}
        }
        return dp[s.length()];
    }
}