package Stack;

import java.util.Stack;

/* given a series of N daily price quotes for a stock we need to calculate the
span of the stock price for all N days, the span of the stocks price in one day is the maximum
number of consecutive days for which the stock price was less than or equal to the price of that day

in->100,80,60,70,60,75,85
ot->1,1,1,2,1,4,6
 */
public class StockPriceSpan {
    static void span(int ar[]){
        //previous greater
        int ans[]=new int[ar.length];
        ans[0]=1;
        Stack<Integer> st=new Stack<>();
        //push index of previous greater
        st.push(0);
        int i=1;
        while(i<ar.length) {
            while (st.size() > 0 && ar[i] > ar[st.peek()]) {
                //pop smaller
                st.pop();
            }
            //span=current index-previous greater index
            ans[i] = i - st.peek();
            //everytime push array element into stack
            st.push(i);

            i++;
        }
        for(int var:ans)
            System.out.print(var+" ");
    }
    public static void main(String[] args) {
        int ar[]={100,80,60,70,60,75,85};
        span(ar);
    }
}
