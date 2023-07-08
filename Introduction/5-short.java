import java.util.*;
public class Main
{
    static void swap(int ar[],int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
    
    static void shortzo(int ar[]){
        int l=0;
        int r=ar.length-1;
        while(l<r){
            if(ar[l]==1 && ar[r]==0){
                swap(ar,l,r);
                l++;
                r--;
            }
            if(ar[l]==0)
            l++;
            
            if(ar[r]==1)
            r--;
        }
        System.out.println("shorted array");
         for(int i=0;i<ar.length;i++)
		        System.out.print(ar[i]+" ");
    }
  
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter element of array");
		for(int i=0;i<n;i++)
		ar[i]=sc.nextInt();
		
		shortzo(ar);
		    }
}
