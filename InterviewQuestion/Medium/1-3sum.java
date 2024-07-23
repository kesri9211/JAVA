/*Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Use a HashSet to avoid duplicate triplets
        HashSet<List<Integer>> st = new HashSet<>(); //hashset of list
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        // Create a list to store the triplet
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        // Sort the triplet to avoid duplicate sets in different orders
                        Collections.sort(triplet);
                        st.add(triplet);
                    }
                }
            }
        }
        
        // Convert the set to a list of lists
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(nums);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}



//Method 2 optimise TC: O(N^2)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>>st=new HashSet<>(); //hashset of list to store unique triplet
        List<Integer> triplet=new ArrayList<>(); //store 3 sum
        for(int i=0;i<nums.length-2;i++){
            HashSet<Integer>table=new HashSet<>(); //maintain hashtable-- store third number need to find
            for(int j=i+1;j<nums.length;j++){
                int find=-(nums[i]+nums[j]);
                if(table.contains(find)){//found triplet 
                    triplet = Arrays.asList(nums[i], nums[j], find); //store as list
                    Collections.sort(triplet); //sort to avoid duplicate
                    st.add(triplet); //store unique triplet (list of hashset)
                }
                else{
                    table.add(nums[j]);//update table 
                }
            }
        }
        List<List<Integer>>ans=new ArrayList<>(st);// Convert the set to a list of lists
        return ans;
    }
}



//method 3 most optimize without extra space
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer>triplet=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
     for(int i=0;i<nums.length-2;i++){
        if(i>0 && nums[i]==nums[i-1])continue;
        int j=i+1;
        int k=nums.length-1;
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum<0)j++;
            else if(sum>0)k--;
            else{//3 sum found
                triplet = Arrays.asList(nums[i], nums[j], nums[k]); //store as list
                ans.add(triplet);
                j++;
                k--;
                while(j<k && nums[j]==nums[j-1])j++;
                while(j<k && nums[k]==nums[k+1])k--;
            }
        }
     } 
     return ans;  
    }
}
