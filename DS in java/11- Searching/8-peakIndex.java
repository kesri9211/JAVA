/*
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.

Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1
*/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        while(st<end){
            int mid=st+(end-st)/2;
            if(arr[mid]<arr[mid+1]) {//upHiLL
                ans=mid+1;
                st=mid+1;
            }
            else{   //down hill
                ans=mid;
                end=mid;
            }
        }
        return ans;
    }
}
