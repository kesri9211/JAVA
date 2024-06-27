//program to find first occurance of element using binary search

public class Main
{
	public static void main(String[] args) {
		int ar[]={2,5,5,5,6,6,8,9,9,9};
		int l=0;
		int first=-1;
		int r=ar.length-1;
		while(l<=r){
		    int mid=(l+r)/2;
		    if(ar[mid]==5){
		        first=mid;
		        r=mid-1;
		    }
		    else if(ar[mid]<5){
		        l=mid+1;
		    }
		    else{
		        r=mid-1;
		    }
		}
		System.out.print(first);
	}
}
