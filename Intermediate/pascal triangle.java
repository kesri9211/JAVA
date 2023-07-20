import java.util.*;
public class Main
{
    
    static void pascal(int r){
        int p[][]=new int[r][];

        for(int i=0;i<r;i++){
                      //i row has i+1 column
            p[i]=new int[i+1];
                      //first and last element in every row is 1 
            p[i][0]=p[i][i]=1;

            for(int j=1;j<i;j++){
                p[i][j]=p[i-1][j]+p[i-1][j-1];
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<=i;j++){
            System.out.print(p[i][j]+" ");
        }
        System.out.println();
    }
    }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();

		System.out.println("pascal");
		pascal(n);

 	}
}
