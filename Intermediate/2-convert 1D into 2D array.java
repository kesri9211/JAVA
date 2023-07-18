import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter size of array");
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int x=n*m;
	    int ar[]=new int[x];
		System.out.println("enter element");
		int c=0,k=0;
		int br[][]=new int[n][m];
		for(int i=0;i<x;i++){
		        ar[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        for(int j=0;j<m;j++){
		            br[i][j]=ar[k++];
		            c++;
		            if(c==m){
		                c=0;
		                break;
		            }
		        }
		    }
		System.out.println("2d array");
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        System.out.print(br[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
