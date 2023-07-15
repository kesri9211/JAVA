import java.util.*;
public class Main
{
    static void mularray(int ar[][],int r1,int c1,int br[][],int r2,int c2){
        if(c1!=r2){
            System.out.println("wrong input,input again");
            return;
        }
        int ans[][]=new int[r1][c2];   //resultant matrix [r1*c2]
        
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++) //c1==r2
                ans[i][j]+=ar[i][k]*br[k][j];
            }
        }
        
        System.out.println("multiplication of array");
        for(int i=0;i<r1;i++){
		    for(int j=0;j<c2;j++){
		        System.out.print(ans[i][j]+ " ");
		    }
		    System.out.println();
		}
    }
    
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter size of first array");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int ar[][]=new int[r1][c1];
		System.out.println("enter element of first array");
		for(int i=0;i<r1;i++){
		    for(int j=0;j<c1;j++){
		        ar[i][j]=sc.nextInt();
		    }
		}
		
		System.out.println("enter size of second array");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int br[][]=new int[r2][c2];
		System.out.println("enter element of second array");
		for(int i=0;i<r2;i++){
		    for(int j=0;j<c2;j++){
		        br[i][j]=sc.nextInt();
		    }
		}
		
		mularray(ar,r1,c1,br,r2,c2);
		
		
	}
}
