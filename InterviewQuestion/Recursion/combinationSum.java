/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
*/
class Solution {
    public void helper (int idx,int ar[],int target,List<List<Integer>>ans,List<Integer> ds){
        int n=ar.length;
        //base condition
        if(idx==n){
            if(target==0)
                ans.add(new ArrayList<>(ds));
            return;
        }
        if(ar[idx]<=target){
            ds.add(ar[idx]);
            helper(idx,ar,target-ar[idx],ans,ds);
            ds.remove(ds.size()-1);
        }
        helper(idx+1,ar,target,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        helper(0,candidates,target,ans,ds);
        return ans;
    }
}
