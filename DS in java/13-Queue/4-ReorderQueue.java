//interleave 1st half with second half using stack
//input: 1 2 3 4 5 6 7 8
//output: 1 5 2 6 3 7 4 8 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // input
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        Stack<Integer> st = new Stack<>(); // extra space
        
        // Move first half to stack q = 5 6 7 8
        int size = q.size();
        for (int i = 0; i < size / 2; i++) {
            st.push(q.remove());
        }
        
        // Add back to queue q = 5 6 7 8 4 3 2 1
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        
        // Move first half to stack q = 4 3 2 1
        for (int i = 0; i < size / 2; i++) {
            st.push(q.remove());
        }
        
        // Interleave elements from stack and front of queue q = 3 2 1 8 4
        while (!st.isEmpty()) {
            q.add(st.pop()); // Add element from stack
            q.add(q.remove()); // Add element from front of queue
        }
        
        // Move elements to stack
        while (!q.isEmpty()) {
            st.push(q.remove());
        }
        
        // Move back to queue q = 1 5 2 6 3 7 4 8
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        
        System.out.print(q);
    }
}
