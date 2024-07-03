/*mplement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.
*/
import java.util.Stack;

class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        // Move all elements from st to helper
        while (!st.isEmpty()) {
            helper.push(st.pop());
        }
        int ans = helper.pop();
        // Move all elements back from helper to st
        while (!helper.isEmpty()) {
            st.push(helper.pop());
        }
        return ans;
    }
    
    public int peek() {
        // Move all elements from st to helper
        while (!st.isEmpty()) {
            helper.push(st.pop());
        }
        int ans = helper.peek();
        // Move all elements back from helper to st
        while (!helper.isEmpty()) {
            st.push(helper.pop());
        }
        return ans;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}
