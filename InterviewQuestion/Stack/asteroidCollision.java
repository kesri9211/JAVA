/*
We are given an array asteroids of integers representing asteroids in a row.
For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the
same direction will never meet.
 
Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.

*/
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            if(asteroids[i]>=0){
                st.push(asteroids[i]);
            }
            else{ 
                //when a negative element is encountered check all elements on the left side and pop if it is less 
                while(st.size()>0 && st.peek()>0 && st.peek()<Math.abs(asteroids[i])){
                   st.pop();
                }
                if(st.size()!=0 && st.peek()==Math.abs(asteroids[i])) //[8,-8] when this type of case encounter
                    st.pop();
                else if(st.size()==0 || st.peek()<0) //store negative element only if stack is empty or top element is negative
                    st.push(asteroids[i]);
            }
            
        }
        int size=st.size();
        int ans[]=new int[size];
        while(st.size()>0){
            ans[--size]=st.pop();
        }
        return ans;
    }
}
