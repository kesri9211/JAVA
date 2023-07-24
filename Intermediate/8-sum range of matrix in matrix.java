import java.util.*;
public class Main
{
    static void prefixsum(int ar[][],int r,int c){
        //traverse horizontally to calculate row-wise prefix sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                ar[i][j]=ar[i][j]+ar[i][j-1];
            }
        }
        //traverse vertically to calculate column-wise prefix sum
        for(int j=0;j<c;j++){  //fixing col 
            for(int i=1;i<r;i++){
                ar[i][j]+=ar[i-1][j];
            }
        }
    }
    
    // static void sumran2(int ar[][],int r,int c,int l1,int r1,int l2,int r2){
    //     //m2: pre-calculating the horizontal sum for each row in the matrix
    //     prefixrow(ar,r,c);
    //     int sum=0;
    //     for(int i=l1;i<=l2;i++){
    //         if(r1>=1)
    //         sum+=ar[i][r2]-ar[i][r1-1];
    //         else
    //         sum+=ar[i][r2];
    //     }
    //     System.out.println("sum is "+sum);
    // }
    
    static void sumran3(int ar[][],int r,int c,int l1,int r1,int l2,int r2){
        prefixsum(ar,r,c);
        int ans=0 ,sum=0,left=0,up=0,upleft=0;
        
        sum=ar[l2][r2];
        if(l1>=1)
        up=ar[l1-1][r2];
        if(r1>=1)
        left=ar[l2][r1-1];
        if(l1>=1 && r1>=1)
        upleft=ar[l1-1][r1-1];
        
        ans=sum-up-left+upleft;
        System.out.println("sum is "+ans);
    }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int ar[][]=new int[r][c];
		System.out.println("enter element");
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        ar[i][j]=sc.nextInt();
		    }
		}
		System.out.println("enter range of sum l1,r1,l2,r2");
		int l1=sc.nextInt();
		int r1=sc.nextInt();
		int l2=sc.nextInt();
		int r2=sc.nextInt();
// 		sumran2(ar,r,c,l1,r1,l2,r2);
		sumran3(ar,r,c,l1,r1,l2,r2);
	}
}
