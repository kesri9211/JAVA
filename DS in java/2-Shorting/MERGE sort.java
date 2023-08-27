public class Main
{
    static void merge(int ar[],int l,int mid,int r){
        int n1=mid-l+1;  //size of left array
        int n2=r-mid;    //size of right array 
        int left[]=new int[n1];
        int right[]=new int[n2];
        
        //make subarrays left and right
        int i,j,k;
        for(i=0;i<n1;i++) left[i]=ar[l+i];
        for(j=0;j<n2;j++) right[j]=ar[mid+1+j];
        
        //merge sorted array
        i=0;j=0;k=l;
        while(i<n1 && j<n2){
            if(left[i]>right[j]) 
               ar[k++]=right[j++];
            else 
               ar[k++]=left[i++];
        }
        while(i<n1) ar[k++]=left[i++];
        while(j<n2) ar[k++]=right[j++];
    }
    
    static void mergesort(int ar[] ,int l,int r){
        if(l>=r)return;    //base case 
        int mid=(l+r)/2;
        mergesort(ar,l,mid); //(recusive function) will sort subarray
        mergesort(ar,mid+1,r);
        merge(ar,l,mid,r);//merge sorted array(self work)
    }
	public static void main(String[] args) {
		int ar[]={1,4,7,5,3};
		int n=ar.length;
		mergesort(ar,0,n-1);
		System.out.print("sorted array: ");
		for(int i:ar)
		System.out.print(i+" ");
	}
}
