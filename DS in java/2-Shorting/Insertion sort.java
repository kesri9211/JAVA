import java.util.*;
public class Main
{
    static void insertion(int ar[]){
        int n=ar.length;
        for(int i=1;i<n;i++){ 
            int j=i;
            while(j>0 && ar[j]<ar[j-1]){
                //swap to find correct position of element in sorted part
            int temp=ar[j];    
            ar[j]=ar[j-1];
            ar[j-1]=temp;
            j--;
        }
    }
    }
	public static void main(String[] args) {
	    int ar[]={1,4,6,3,2,9};
	    //Main obj=new Main();
	    insertion(ar);
		for(int i:ar)
		System.out.print(i+" ");
	}
}
