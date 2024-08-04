/*
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
You can only see the k numbers in the window. Each time the sliding window moves right by one position.
Return the max sliding window.

Example 1:
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
*/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[]=new int [nums.length-k+1];
        int t=0; //ans index
        Deque<Integer>dq=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            //check valid window
            //remove all element from deque with lower index than idx-k
            if(!dq.isEmpty() && dq.peekFirst()<=i-k)
                dq.pollFirst();
                
            //maintain deque in decreasing order of element
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])
                dq.pollLast();
            
            dq.offer(i);//push index
            // Start adding results after first 'k' elements
            if(i>=k-1)
                ans[t++]=nums[dq.peekFirst()];

        }
        return ans; 
    }
}
