import java.util.*;
public class Main
{   
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
    
		System.out.println("enter array element");
		for(int i=0;i<n;i++)
		ar[i]=sc.nextInt();
		
		 int freq[]=new int[100002];         //making frequency array
        for(int i=0;i<ar.length;i++)
            freq[ar[i]]++;
		
		System.out.println("number of queries?");
		int q=sc.nextInt();
		while(q-->0){
		    System.out.print("enter number to searched ");
		    int x=sc.nextInt();
		    if(freq[x]>0)
		    System.out.println("yes "+freq[x]);
		    else
		    System.out.println("no "+freq[x]);
		   		}
	}
}
