import java.util.*;
public class Main
{
    static int fibo(int n){
        if(n==1 || n==0) return n;  //base case
        
        return fibo(n-1)+fibo(n-2);    //sub problem recursive + self work
    }
    
	public static void main(String[] args) {
		System.out.println("enter number of term");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		System.out.print(fibo(i)+" ");
	}
}
