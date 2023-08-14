import java.util.*;
public class Main
{
    static int fac(int n){
        if(n==0) return 1;
        
        n=n*fac(n-1);
        return n;

    }
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fac(n));
	}
}
