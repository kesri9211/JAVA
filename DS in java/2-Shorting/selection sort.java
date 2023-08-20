import java.util.*;
public class Main
{
    static void selection(int ar[]){
        int n=ar.length;
        for(int i=0;i<n-1;i++){    //represent current index
            int mininx=i;
            for(int j=i+1;j<n;j++){
                if(ar[mininx]>ar[j]){     //find the minimum value/index in unsorted array
                mininx=j;
            }
            }
            int temp=ar[mininx];      //swap current element and smallest 
            ar[mininx]=ar[i];
            ar[i]=temp;
        }
    }
	public static void main(String[] args) {
	    int ar[]={1,4,6,3,2,9};
	    selection(ar);
		System.out.println(Arrays.toString(ar));
	}
}
