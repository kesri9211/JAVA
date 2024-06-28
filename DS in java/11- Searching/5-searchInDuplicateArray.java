//search target element in rotated sorted array with duplicate element 
public class Main
{
	public static void main(String[] args) {
		int ar[]={3,3,4,4,5,1,1,2,2,3};
		int l=0;
		int f=0;
		int r=ar.length-1;
		int target=3;
		while(l<=r){
		    int mid=l+(r-l)/2;
		    if(ar[mid]==target){
		        System.out.print(mid+" "); 
		        f=1;
		        break;
		    }
		    //when l==mid==r reduce search space 
		    else if(ar[l]==ar[mid] && ar[mid]==ar[r]){
		        l++;
		        r--;
		    }
          /* pivot will never lie between mid and r if l!=r and mid==end 
          hence mid to r array is sorted*/
		    else if(ar[mid]<=ar[r]){
		        if(target>ar[mid] && target<=ar[r]){
		            //target lies between mid and r because array is sorted 
		            l=mid+1;
		        }
		        else{
		            r=mid-1;
		        }
		    }
		    else{
		        //definitely other part of the array is sorted
		        if(target>=ar[l] && target<ar[mid]){
		            r=mid-1;
		        }
		        else{
		            l=mid+1;
		        }
		    }
		}
		if(f==1)System.out.println("true"); //1 true
		else System.out.println("false");
	}
}
