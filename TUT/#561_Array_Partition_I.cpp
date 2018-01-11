//let a,b close to each other in min(a, b)
//so sort the list 

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
    	//sort O(nlogn)
    	//std::sort(nums.begin(), nums.end());
    	//int ans =0;
    	//for(int i =0; i<num.size(); i+=2){
    	//	ans += num[i];
    	//}

    	//return ans;




    	//can also be solved using hash table
    	//the values in nums are in range [-10000, 10000]

    	const int kMaxValue = 10000;
    	array<int 2*kMaxValue+1> c{}	//creating an array with size 20001 and initialize with 0

    	for(int num: nums) ++c[num+kMaxValue]	//using the index of the new array c to represent the values in the old array 
    											//using the values in the new array c to represent the number of the value in the old array

    	int ans = 0;
    	int n = -kMaxValue;
    	bool first = true;

    	while (n<=kMaxValue) {
    		if(!c[n + kMaxValue]){				//if the value in the new array is 0, means that the number(index of c) is not in the old array
    				++n;						//do nothing, point to the next value in the array
    				continue;					
    		}	
    		if(first){							//if the loop comes here and first flag is true
    			ans+=n;							//add the value to the ans (the value is the idx of the array c)
    			first = false;
    		} else{
    			//skip the element
    			first = true;
    		}

    		--c[n + kMaxValue]; 				//decrease the num of this value
    	}

    	return ans;

        
    }
};