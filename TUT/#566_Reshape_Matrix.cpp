class Solution {
public:
    vector<vector<int>> matrixReshape(vector<vector<int>>& nums, int r, int c) {
    	if (nums.size() == 0) return nums;
    	int m = nums.size();
    	int n = nums[0].size();
    	if(m*n != r*c) return nums;

		vector<vector <int>> newarray(r, vector<int>(c));
    	for (int i=0; i<=m*n; i++){
    		int x_ori = i/n;
    		int y_ori = i%n;
    		int x_new = i/c;
    		int y_new = i%c;
    		
    		newarray[x_new][y_new] = nums[x_ori][y_ori];
    	}

    	return newarray;
        
    }
};