//maximum sum of hour glass in matrix
// total number of hour glass=(c-2)(r-2)
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int sum=0;
	    int max_sum=Integer.MIN_VALUE;
	    int ar[][]={
	        {1,2,1},{1,2,1},{1,2,1}
	    };
	   for(int i=0;i<1;i++){
	       for(int j=0;j<1;j++){
	           sum=(ar[i][j]+ar[i][j+1]+ar[i][j+2])+
	           (ar[i+1][j+1])
	           +(ar[i+2][j]+ar[i+2][j+1]+ar[i+2][j+2]);
	           
	           max_sum=Math.max(max_sum,sum);
	       }
	   }
	   System.out.println(max_sum);
	}
}
