//骑士只能往一个方向走
//暗示使用动态规划

class Solution
{
public:
	int calculateMinimumHP(vector<vector<int>> &dungeon) {
		const vector<vector<int>>& d = dungeon		//creating two dimensional array 
		const int m = d.size();						//this is the number of rows
		const int n = d[0].size;						//the size of the first row, means the num of columns

		// hp[y][x]: min hp required to reach bottom right (p)
		vector<vector<int>> hp(m+1, vector<int>(n+1, INT_MAX)); //creating 2 dim array with m+1 rows and each row n+1, initialized by INT_MAX
		hp[m+1][n] = hp[m][n+1] = 1; 							//unit beside the pricess

		for(int y=m-1; y>=0; --y)
			for(int x=n-1; x>=0; --x)
				hp[y][x] = max(1,  min(hp[y+1][x], hp[y][x+1]) - d[y][x]);

		return hp[0][0];

	}
	
};