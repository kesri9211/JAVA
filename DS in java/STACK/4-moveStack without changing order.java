/*move stack to another stack in same order*/
import java.util.*;
public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>(); //stack
        st.push(1); //push element in stack
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st); //print stack

        Stack<Integer> rt=new Stack<>(); //declare stack
        while(st.size()>0){
            rt.push(st.pop()); //store reverse
        }

        Stack<Integer> cStack=new Stack<>();
        while(rt.size()>0){
            cStack.push(rt.pop()); //store reverse of reverse=original
        }
        System.out.println(cStack);
    }
}
