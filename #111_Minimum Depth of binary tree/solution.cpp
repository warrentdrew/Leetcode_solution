//
//  solution.cpp
//  Minimum Depth of binary tree
//
//  Created by 朱逸频 on 17/7/29.
//  Copyright © 2017年 朱逸频. All rights reserved.
//

#include "solution.hpp"

int Solution::minDepth(TreeNode* root){
    //int leftdepth = 0, rightdepth = 0;
    if (root == nullptr){
        return 0;
    }
    if ((root -> left) != nullptr && (root->right)!= nullptr){
        return minDepth(root -> left) < minDepth(root -> right)? minDepth(root -> left)+1 : minDepth(root -> right)+1;
    }
    else if ((root->right)!= nullptr && (root -> left) == nullptr){
        return minDepth(root -> right)+1;
    }
    else if ((root->left)!= nullptr && (root -> right) == nullptr){
        return minDepth(root -> left)+1;
    }
    else {
        return 1;
    }
    
}
