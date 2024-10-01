/*
Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.

NOTE*: A subarray is a contiguous part of any given array.

Example 1:

Input:
N = 4, K = 2
Arr = [100, 200, 300, 400]
Output:
700
Explanation:
Arr3  + Arr4 =700,
which is maximum.
*/
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long currSum=0;
        for(int i=0;i<K;i++){
            currSum+=Arr.get(i);
        }
        long max=currSum;
        for(int i=K;i<N;i++){
            //sliding window
            currSum+=Arr.get(i)-Arr.get(i-K);
            max=Math.max(max,currSum);
        }
        return max;
    }
}
