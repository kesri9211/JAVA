/*
Given an array of integers. Find the Inversion Count in the array.  Two array elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
If an array is sorted in the reverse order then the inversion count is the maximum. 

Examples:

Input: n = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
*/
class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long count=0;
     static void merge(long ar[],int l,int mid,int r){
        int n1=mid-l+1;  //size of left array
        int n2=r-mid;    //size of right array 
        long left[]=new long[n1];
        long right[]=new long[n2];
        
        //make subarrays left and right
        int i,j,k;
        for(i=0;i<n1;i++) left[i]=ar[l+i];
        for(j=0;j<n2;j++) right[j]=ar[mid+1+j];
        
        //merge sorted array
        i=0;j=0;k=l;
        while(i<n1 && j<n2){
            if(left[i]>right[j]){ 
               ar[k++]=right[j++];
               count+=n1-i;//new
            }
            else {
                 ar[k++]=left[i++];
            }
              
        }
        while(i<n1) ar[k++]=left[i++];
        while(j<n2) ar[k++]=right[j++];
    }
    
    static void mergesort(long ar[] ,int l,int r){
            if(l>=r)return;
            int mid=(l+r)/2;
            mergesort(ar,l,mid);
            mergesort(ar,mid+1,r);
            merge(ar,l,mid,r);
        }
    static long inversionCount(long arr[], int n) {
         count = 0;
        mergesort(arr,0,n-1);
        return count;
        
    }
}
