/*
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by an array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9

*/

//t.c O(N)
class Solution {
    public int trap(int[] height) {
        //prefix-- store highest of left
        //suffix-- store highest of right
        //formula- min(prefix[i],suffix[i])-ar[i]
        int n=height.length;
        int prefix[]=new int[n];
        prefix[0]=height[0];
        int suffix[]=new int[n];
        suffix[n-1]=height[n-1];

        for(int i=1;i<n;i++){
            if(height[i]>=prefix[i-1]) prefix[i]=height[i];
            else prefix[i]=prefix[i-1];
        }
        for(int i=n-2;i>=0;i--){
            if(height[i]>=suffix[i+1]) suffix[i]=height[i];
            else suffix[i]=suffix[i+1];
        }
        int res=0;
        for(int i=0;i<n;i++){
            res+=Math.min(prefix[i],suffix[i])-height[i];
        }
        return res;
    }
}



//m2- using 2 pointers without extra space
