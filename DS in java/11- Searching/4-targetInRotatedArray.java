//search target element is given sorted rotated array 
//in 'rotated sorted array' defenately one part is sorted
public class Main
{
	public static void main(String[] args) {
		int ar[]={3,4,5,1,2};
		int l=0;
		int r=ar.length-1;
		int target=5;
		while(l<=r){
		    int mid=l+(r-l)/2;
		    if(ar[mid]==target){
		        System.out.print(mid); //2
		        break;
		    }
		    else if(ar[mid]<ar[r]){
		        //from mid to r array is sorted
		        if(target>ar[mid] && target<=ar[r]){     //target lies between mid and r because array is sorted   
		            l=mid+1;
		        }
		        else{
		            r=mid-1;
		        }
		    }
		    else{
		        //defenately other part of array is sorted
		        if(target>=ar[l] && target<ar[mid]){
		            r=mid-1;
		        }
		        else{
		            l=mid+1;
		        }
		    }
		}
	}
}
