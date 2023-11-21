/*Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
*/
class Solution {
    public void helper(int[] nums,List<Integer> ds,boolean isVisited[],List<List<Integer>> ans){
        int n=nums.length;
        //return when found equal and story list into ans
        //base case
        if(ds.size()==n){
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<ds.size();i++){
                list.add(ds.get(i));
            }
            ans.add(list);
            return;
        }
        for(int i=0;i<n;i++){
            //call only if isVisited is false
            if(isVisited[i]==false){
                ds.add(nums[i]); //store called element
                isVisited[i]=true; //mark true when called
                helper(nums,ds,isVisited,ans);
                //backtracking
                isVisited[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>(); //store ans
        List<Integer> ds=new ArrayList<>(); //store called element 
        boolean isVisited[]=new boolean[nums.length]; //to store(true) which element is being called
        helper(nums,ds,isVisited,ans); //recursive function to find number of permutation
        return ans;
    }
}
