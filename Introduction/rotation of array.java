import java.util.*;
public class Main
{
    static void rotate(int ar[],int x){
        int n=ar.length;
        int j=0;
        int ans[]=new int[n];
        
        for(int i=n-x;i<=n-1;i++)  //[n-x to n-1]
        ans[j++]=ar[i];
        
        for(int i=0;i<=n-x-1;i++)  //[0 to n-x-1]
        ans[j++]=ar[i];
        
        for(int i=0;i<n;i++)
        System.out.print(ans[i]+" ");
        
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter size of array");
	    int n=sc.nextInt();
	    int ar[]=new int[n];
	    for(int i=0;i<n;i++){
	        ar[i]=sc.nextInt();
	    }
	    System.out.println("enter Number of rotation you want");
	    int k=sc.nextInt();
	    k=k%n;    //when k>n rotation will repeat 
	    rotate(ar,k);
		
	}
}

               //M2: without using extra space
                   //1: reverve part 1 of array then reverse part 2 of array
                   //2: reverse whole array to get rotated array
import java.util.*;
public class Main
{
    static void rev(int ar[],int i,int j){
        while(i<j){
            int temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int ar[],int k){
        int n=ar.length;
        int j=0;
        rev(ar,n-k,n-1);  //reverse part1 of array
        rev(ar,0,n-k-1);  //reverse part2 of array
        rev(ar,0,n-1);    //reverse whole array to get rotated array
        
        for(int i=0;i<n;i++)
        System.out.print(ar[i]+" ");
        
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter size of array");
	    int n=sc.nextInt();
	    int ar[]=new int[n];
	    for(int i=0;i<n;i++){
	        ar[i]=sc.nextInt();
	    }
	    System.out.println("enter Number of rotation you want");
	    int k=sc.nextInt();
	    k=k%n;    //when k>n rotation will repeat 
	    rotate(ar,k);
		
	}
}
