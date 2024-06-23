/*Given an array of integers heights representing the
histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.

*/
class Solution {
    public int largestRectangleArea(int[] heights) {
        //find next smaller
        //find previous smaller
        //(next-prev-1)*heights
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int nse[]=new int[n];
        int pse[]=new int[n];
        if(n==1) return heights[0];
//calculate nse
        st.push(n-1);
        nse[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0)
                nse[i]=n;
            else
                nse[i]=st.peek();
            st.push(i);//push index
        }
        //emplying stack
        while(st.size()!=0){
            st.pop();
        }
    //calculate pse
        st.push(0);
        pse[0]=-1;
        for(int i=0;i<n;i++){
            while(st.size()>0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0)
                pse[i]=-1;
            else 
                pse[i]=st.peek();
            st.push(i);
            }
        //area
        int max=-1;
        for(int i=0;i<n;i++){
            int area=heights[i]*(nse[i]-pse[i]-1);
            if(max<area)
                max=area;
        }
        return max;
    }
}
