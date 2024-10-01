import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int ar[]={1,2,3,4,5};
		int k=2;
		int n=ar.length;
		while(k-->0){
		    int temp=ar[n-1];
		    for(int i=n-1;i>0;i--){
		        ar[i]=ar[i-1];
		    }
		    ar[0]=temp;
		}
		for(int i:ar)
		System.out.print(i+" ");
	}
}
