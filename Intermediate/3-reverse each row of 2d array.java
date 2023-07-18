import java.util.*;
public class Main
{
    static void rev(int row[],int i,int m){   //reverse array passed(row of 2d array)
        m=m-1;
        i=0;
        while(i<m){          //swapping technique
            int temp=row[i];
            row[i]=row[m];
            row[m]=temp;
            i++;
            m--;
        }
        for(int a=0;a<row.length;a++)  //printing row
        System.out.print(row[a]+" ");
        System.out.println();
    }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter size of array");
	    int n=sc.nextInt();
	    int m=sc.nextInt();
		System.out.println("enter element");
		int ar[][]=new int[n][m];

		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        ar[i][j]=sc.nextInt();
		    }
		}
		int i=0;
		int row[]=new int[m];
		 while(i<n){                //store rows of 2d array into single array
		     for(int x=0;x<m;x++)
		     row[x]=ar[i][x];
		     
		     rev(row,i,m);          //then reverse row and print one by one 
		     i++;
		 }
	}
}
