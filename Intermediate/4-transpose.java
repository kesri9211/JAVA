import java.util.*;
public class Main
{
    static void transpose(int ar[][],int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                //swap matrix[i][j] and martrix[j][i] of uppar diagonal
                int temp=ar[i][j];
                ar[i][j]=ar[j][i];
                ar[j][i]=temp;
            }
        }
    }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ar[][]=new int[n][m];
		
		System.out.println("enter element array");
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        ar[i][j]=sc.nextInt();
		    }
		}
		transpose(ar,n,m);
		System.out.println("transpose of array");
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(ar[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
