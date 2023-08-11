//write a program to print 1 to n using recursion
import java.util.*;
public class Main
{
    static void pi(int n){
        if(n==1){
            System.out.println("1");
            return;
        }
        pi(n-1);
        System.out.println(n);
    }
    
	public static void main(String[] args) {
		System.out.println("enter n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		pi(n);
	}
}
