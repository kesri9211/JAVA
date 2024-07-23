/*
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
*/

class Solution {
    public int findMin(int[] nums) {
        int st=0;
        int end=nums.length-1;
        int ans=0;
  //in rotated sorted array smallest element of first part > largest element of second part(n-1)
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]>nums[nums.length-1]){ //first part--->move to second part
                st=mid+1;
            }
            else {ans=nums[mid];
                end=mid-1;};
        }
        return ans;
    }
}
