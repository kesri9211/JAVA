package Stack;
//insert at bottom/index of stack
import java.util.*;
public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(); //stack
        st.push(1); //push element in stack
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st); //print stack
      
//insert at particular index
        int ind=2;
        int val=10;
        Stack<Integer> rt = new Stack<>(); //declare new stack
        while (st.size() >ind) { //pop till that index
            rt.push(st.pop()); //and store it in different stack
        }
        st.push(val); //insert value in stack

        while (rt.size()>0) {
            st.push(rt.pop()); //again push poped element into original stack
        }
        System.out.println(st);
    }
}
