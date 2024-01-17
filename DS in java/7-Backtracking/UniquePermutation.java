/*Given an array arr[] of length n. Find all possible unique permutations of the array in sorted order. A sequence A is greater than sequence B if there is an index i for which Aj = Bj for all j<i and Ai > Bi.

Example 1:

Input: 
n = 3
arr[] = {1, 2, 1}
Output: 
1 1 2
1 2 1
2 1 1
Explanation:
These are the only possible unique permutations
for the given array.
*/
class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> nums , int n) {
        // code here
        Set<ArrayList<Integer>> ans=new HashSet<>(); //store ans
        ArrayList<Integer> ds=new ArrayList<>(); //store called element 
        boolean isVisited[]=new boolean[nums.size()]; //to store(true) which element is being called
        helper(nums,ds,isVisited,ans); //recursive function to find number of permutation
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(ans);//store set into arrayList of ArrayList
         // Sort the ArrayList of ArrayLists
        Collections.sort(result, (a, b) -> {
            for (int i = 0; i < n; i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });
        return result;
    }
    public static void helper(List<Integer>nums, List<Integer> ds,boolean isVisited[],Set<ArrayList<Integer>> ans){
        int n=nums.size();
        //return when found equal and story list into ans
        //base case
        if(ds.size()==n){
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<ds.size();i++){
                list.add(ds.get(i));
            }
            ans.add(list);
            return;
        }
        for(int i=0;i<n;i++){
            //call only if isVisited is false
            if(isVisited[i]==false){
                ds.add(nums.get(i)); //store called element
                isVisited[i]=true; //mark true when called
                helper(nums,ds,isVisited,ans);
                //backtracking
                isVisited[i]=false;
                ds.remove(ds.size()-1);
            }
    }
    }
};
