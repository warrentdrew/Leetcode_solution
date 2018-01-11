/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    vector<vector<string>> printTree(TreeNode* root) {
    	int h = getHeight(root);
    	int w = (1<<h) - 1; //this is 2^h - 1
    	vector<vector<string>> ans(h, vector<string>(w, ""));
    	fill(root, ans, 0, 0, w-1);
    	return ans;
    
    }
private:
	int getHeight(TreeNode* root) {		//get height of the binary tree
		if(!root) return 0;
		return max(getHeight(root -> left), getHeight(root -> right)) + 1;
	}

	void fill(TreeNode* root, vector<vector<string>>& ans, int h, int l, int r){		//pass ans by reference to get the result 
		if(!root) return;
		int mid = (l+r)/2
		ans[h][mid] = std::to_string(root -> val);
		fill(root -> left, ans, h+1, l, mid-1);
		fill(root -> right, ans, h+1, mid+1, r);

	}
};