class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> st=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                Set<Long>table=new HashSet<>(); //maintain hashtable-- store forth number need to find
                for(int k=j+1;k<nums.length;k++){
                    long find=(long)target-((long)nums[i]+(long)nums[j]+(long)nums[k]);
                    if(table.contains(find)){
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[k], (int) find);
                        Collections.sort(quad);
                        st.add(quad); //store in Hashset of list
                    }
                    else table.add((long)nums[k]);
                }
            }
        }
        return new ArrayList<>(st);
    }
}
