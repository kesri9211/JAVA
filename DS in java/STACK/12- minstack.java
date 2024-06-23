/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.

 

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 */

class MinStack {
    //Approach 2 without extra space
    Stack<Integer>st=new Stack<>();
    int min=Integer.MAX_VALUE;
    public MinStack() {
        //constructor
    }
    public void push(int val) {
        if(st.size()==0){
            st.push(val);
            int min=val;
        }
        else{
            if(val<min) {
                st.push((2*val)-min);
                min=val;
            }
            else st.push(val);
        }
    }
    
    public void pop() {
        if(st.peek()<min){
            min=2*min-st.peek();//restore previous min
            st.pop();
        }
        else st.pop();
    }
    
    public int top() {
        if(st.peek()>min)
            return st.peek();
        else
            return min;
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
