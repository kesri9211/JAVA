//The code provided attempts to find the smallest element in a rotated sorted array using binary search.
public class Main
{
	public static void main(String[] args) {
		int ar[]={4,5,6,7,8,1,2,3};
		int l=0;
		int r=ar.length-1;
		int ans=0;
		while(l<r){
		    int mid=(l+r)/2;
		    if(ar[mid]>ar[r]){
		        //move to second part of array
		        l=mid+1;
		    }
		    else {
		        //ans=mid;
		        r=mid;
		    }
		}
		System.out.print(ar[l]);
	}
}
