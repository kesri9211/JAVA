/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.

Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
*/
class Solution {
    public int longestConsecutive(int[] nums) {
        //create hashSet
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxlen=0;
        //find the starting point of each element in the set
        for(int i:set){
            if(!set.contains(i-1)){ //starting point    
                int currNum=i;
                int currStreak=1; //length of consecutive sequence
                while(set.contains(currNum+1)){ //creating streak
                    currStreak++;
                    currNum++;
                }
                if(currStreak>maxlen) maxlen=currStreak;
            }
        }
        return maxlen;
    }
}
