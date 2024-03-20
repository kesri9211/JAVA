/*Given a binary tree having n nodes. Find the sum of all nodes on the longest path from root to any leaf node. If two or more paths compete for the longest path, then the path having maximum sum of nodes will be considered.

Example 1:

Input: 
        4        
       /  \       
      2   5      
     / \   /  \     
    7  1 2  3    
      /
     6
Output: 
13*/

class Solution{
    int maxSum=0;
    int maxLevel=0;
    void helper(Node root, int level, int sum){
        
        //base condition
        if(root==null) 
            return;
        sum=sum+root.data;
        level++;
        //recusive function
        helper(root.left,level,sum);
        helper(root.right,level,sum);
        
        if(level>maxLevel){
            maxLevel=level;
            maxSum=sum;
        }
        else if(level==maxLevel){
            maxSum=Math.max(sum,maxSum);
        }
    }
    public int sumOfLongRootToLeafPath(Node root)
    {
        //code here
        helper(root,0,0);
        return maxSum;
    }
}
