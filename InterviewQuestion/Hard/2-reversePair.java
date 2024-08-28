/*
Given an integer array nums, return the number of reverse pairs in the array.
A reverse pair is a pair (i, j) where:
0 <= i < j < nums.length and
nums[i] > 2 * nums[j].

Example 1:
Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1

Approach: used merge sort
let if we have 2 sort array compare ar[i] > 2*br[j++] then count++
so just before merging to sorted array countPair
*/


class Solution {
    static int count=0;
    public static void countPair(int nums[],int st,int mid,int end){
        int right=mid+1;
        for(int i=st;i<=mid;i++){
            while(right<=end && nums[i]>2L*nums[right]) right++;
            //increment count 
            count+=right-(mid+1);
        }
    }
    public static void merge(int nums[],int st,int mid,int end){
        int n1=mid-st+1;
        int n2=end-mid;
        int left[]=new int [n1];
        int right[]=new int [n2];

        for(int i=0;i<n1;i++) left[i]=nums[i+st];
        for(int j=0;j<n2;j++) right[j]=nums[mid+1+j];

        //merge sorted array
        int i=0;int j=0; int k=st;
        while(i<n1 && j<n2){
            if(left[i]<right[j]) nums[k++]=left[i++];
            else nums[k++]=right[j++];
        }
        while(i<n1) nums[k++]=left[i++];
        while(j<n2) nums[k++]=right[j++];
    }
    public static void mergesort(int nums[],int st, int end){
        if (st>=end) return; //base condition 
        int mid=(st+end)/2;
        mergesort(nums,st,mid); //recursive call
        mergesort(nums,mid+1,end);
        countPair(nums,st,mid,end); //before merging count pair
        merge(nums,st,mid,end);
        
    }
    public int reversePairs(int[] nums) {
        count=0; //global variable
        mergesort(nums,0,nums.length-1);
        return count;
    }
}
