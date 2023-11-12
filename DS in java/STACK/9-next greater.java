package Stack;

import java.util.Stack;

/*return next greater element of each integer */
public class nextGreater {
    public static void find(int ar[]){
        int n=ar.length;
        int res[]=new int[n];
        Stack<Integer> st=new Stack<>();
        res[n-1]=-1; //last element has no element greater
        st.push(ar[n-1]); //push last element into stack
        //traverse from backward
        for(int i=n-2;i>=0;i--){
            //pop if stack element is less than array element because we need greater number
            while(st.peek()<ar[i] && st.size()>0){
                st.pop();
            }
            //if no next greater element is there
            if(st.size()==0) res[i]=-1;
            //else top element of stack is next greater
            else res[i]=st.peek();
            //everytime put each element into stack
            st.push(ar[i]);
        }
        for(int var:res)
            System.out.print(var+" ");
    }
    public static void main(String[] args) {
        int ar[]={1,3,2,1,8,6,3,4};
        find(ar);

    }
}
