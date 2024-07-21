/*
Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.
Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

*/

class Solution {
    //Approach observation
    /*
    if all postive-- product all
    if odd negative--product all
    if odd negative-- remove one odd that divide the array into two part
    then find max of the product of both part.
    */
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int prefixProduct=1 , suffixProduct=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(prefixProduct==0) prefixProduct=1; //not carry zero
            if(suffixProduct==0) suffixProduct=1;

            prefixProduct*=nums[i];
            suffixProduct*=nums[n-i-1];
            max=Math.max(max,Math.max(prefixProduct,suffixProduct));
            //System.out.println("Step " + i + ": prefixProduct = " + prefixProduct + ", suffixProduct = " + suffixProduct + ", max = " + max);

        }
        return max;
        
    }
}
