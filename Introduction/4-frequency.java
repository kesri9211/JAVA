import java.util.*;
public class Main
{
    static int[] makefreqarray(int ar[]){
       
         int freq[]=new int[100002];
        for(int i=0;i<ar.length;i++)
            freq[ar[i]]++;
        return freq;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter array element");
		for(int i=0;i<n;i++)
		ar[i]=sc.nextInt();
		
		int freq[]=makefreqarray(ar);
		
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
