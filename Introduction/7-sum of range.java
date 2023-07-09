import java.util.*;
public class Main
{
    static int[] prefixsum(int ar[]){    //making prefix array
        int n=ar.length;
        for(int i=1;i<n;i++)
        ar[i]=ar[i]+ar[i-1];
        
        return ar;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int ar[]=new int[n+1];
		System.out.println("enter element");
		for(int i=1;i<=n;i++)    //1 based indexing
		ar[i]=sc.nextInt();
		
		prefixsum(ar);
		System.out.println("enter quiery");
		int q=sc.nextInt();
		
		while(q-->0){
		    System.out.println("enter range");
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    System.out.println("result "+(ar[b]-ar[a-1]));
		}

	}
}
