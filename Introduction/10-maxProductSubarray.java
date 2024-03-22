//max product of subarray of array
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int ar[]={5,4,-5,-5,6,10};
	    int max=ar[0];
	    int product=1;
	    int nevpro=1;
		for(int i=0;i<ar.length;i++){
		    if(ar[i]==0){
		        product=1;
		    }
		    
		    else if(ar[i]>0){
		        product*=ar[i];
		    }
		    else {
		        product=1;
		        nevpro*=ar[i]; //when continous 2 negative numbers are found
		    }
		    max=Math.max(max,product);
		    max=Math.max(max,nevpro);
		}
		System.out.println(max);
	}
}
