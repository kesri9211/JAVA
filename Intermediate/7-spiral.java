import java.util.*;
public class Main
{
    
    static void spiral(int ar[][],int r,int c){
        int t=0;
        int tr=0,br=r-1,lc=0, rc=c-1;
        
        while(t<(r*c)){
            //toprow-> leftcol to rightcol
            for(int i=lc;i<=rc && t<r*c ;i++){
            System.out.print(ar[tr][i]+" ");
            t++;}
            tr++;
            
            //rightcol-> toprow to bottomrow
            for(int i=tr;i<=br && t<r*c ;i++){
            System.out.print(ar[i][rc]+" ");
            t++;}
            rc--;
            
            //bottomrow-> rightcol to leftcol
            for(int i=rc;i>=lc && t<r*c ;i--){
            System.out.print(ar[br][i]+" ");
            t++;}
            br--;
            
            //leftcol-> bottomrow to toprow 
            for(int i=br;i>=tr && t<r*c ;i--){
            System.out.print(ar[i][lc]+" ");
            t++;}
            lc++;
        
        }
    }
       
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter size of first array");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int ar[][]=new int[r][c];
		System.out.println("enter array");
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        ar[i][j]=sc.nextInt();
		}
		}	
		System.out.println("result");
		spiral(ar,r,c);
	}
}
