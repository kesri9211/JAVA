/*
Given an integer array nums, find the 
subarray with the largest sum, and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

*/
class Solution {
    public int maxSubArray(int[] nums) {
        //approach: kadane's algorithm
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max)max=sum;
            if(sum<0)sum=0;
        }
        return max;
    }
}
