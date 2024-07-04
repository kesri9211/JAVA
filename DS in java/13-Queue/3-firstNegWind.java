/*
Given an array A[] of size N and a positive integer K, find the first negative integer for
each and every window(contiguous subarray) of size K.
 
Example 1:
Input : 
N = 5
A[] = {-8, 2, 3, -6, 10}
K = 2
Output : 
-8 0 -6 -6
Explanation :
First negative integer for each window of size k
{-8, 2} = -8
{2, 3} = 0 (does not contain a negative integer)
{3, -6} = -6
{-6, 10} = -6

*/

class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        Queue<Integer>q=new LinkedList<>(); //store index of negative number
        long result[]=new long[N-K+1]; //size when sliding window
        int t=0; //index to maintain result
        //make queue
        for(int i=0;i<N;i++){
            if(A[i]<0) q.add(i);
        }
        for(int i=0;i<N-K+1;i++){
            if(q.size()>0 && i>q.peek() ){
                q.remove(); // remove only when not in existing window
                //result[t++]=A[q.peek()];
            }
            if(q.size()>0 && q.peek()<=i+K-1){ //if index lies in window
                result[t++]=A[q.peek()]; //store first neg element in particular window 
            }
            else{ //when no negative number found in window or q.size() is 0
                result[t++]=0;
            }
        }
        return result;
    }
}
