package Stack;

import java.util.Stack;

/* remove all consecutive subsequence of length greater than or equal to 2 that
contain the same element
 */
public class removeConsecutive {
    public static int[] remove(int ar[]){
        Stack<Integer> st=new Stack<>();
        int n=ar.length;
        for(int i=0;i<n;i++){
            if(st.size()==0 ||st.peek()!=ar[i])
                st.push(ar[i]);
            else if(st.peek()==ar[i]){ //if equal again compare with next element in array
                if(i==n-1 || ar[i]!=ar[i+1])
                    st.pop();
                //if(ar[i]==ar[i+1]) do nothing
            }
        }
        //convert stack into array
        int res[]=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--)
            res[i]=st.pop();
        return res;
    }
    public static void main(String[] args) {
        int ar[]={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int res[]=remove(ar);
        for(int var:res) System.out.print(var+" ");
    }
}
