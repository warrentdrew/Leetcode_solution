//
//  solution.hpp
//  Minimum Depth of binary tree
//
//  Created by 朱逸频 on 17/7/29.
//  Copyright © 2017年 朱逸频. All rights reserved.
//

#ifndef solution_hpp
#define solution_hpp

#include <stdio.h>



//Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    int minDepth(TreeNode* root);
};



#endif /* solution_hpp */
