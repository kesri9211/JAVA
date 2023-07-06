//array manupulation

import java.util.*;
public class Main
{
    static int findmax(int ar[]){  //find max
       int mx=Integer.MIN_VALUE;
       for(int i=0;i<ar.length;i++){
           if(ar[i]>mx)
           mx=ar[i];
       }
       return mx;
    }
    static void secmax(int ar[]){
        int a=findmax(ar);
        for(int i=0;i<ar.length;i++){  //mark all max as -infinity
            if(ar[i]==a)
            ar[i]=Integer.MIN_VALUE;
        }
        int ans=findmax(ar);   //find max again (second max hoga)
        System.out.println("value is "+ans);
        
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter size ");
	    int n=sc.nextInt();
	    int ar[]=new int[n];
		System.out.println("enter "+n+"number");
		for(int i=0;i<n;i++)
		ar[i]=sc.nextInt();
		
		secmax(ar);
	}
}
