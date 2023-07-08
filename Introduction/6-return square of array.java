import java.util.*;
public class Main
{
    static int[] reverse(int ans[]){
        int j=ans.length-1;
        int i=0;
        while(i<j){
            int temp=ans[i];
            ans[i]=ans[j];
            ans[j]=temp;
            i++; 
            j--;
        }
        return ans;
    }
    
    static void sortsquare(int ar[]){
        int l=0,i=0;
        int n=ar.length;
        int r=n-1;
        int ans[]=new int[n];
        while(l<=r){
            if(Math.abs(ar[l])>Math.abs(ar[r])){
                ans[i++]=ar[l]*ar[l];
                l++;
            }
            else{
                ans[i++]=ar[r]*ar[r];
                r--;
            }
        }
       ans = reverse(ans);
        System.out.println("shorted array");
         for(int k=0;k<n;k++)
		        System.out.print(ans[k]+" ");
    }
	
    
    	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter element of array");
		for(int i=0;i<n;i++)
		ar[i]=sc.nextInt();
		sortsquare(ar);
		    }
}
