/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static boolean partition(int ar[]){  
        int n=ar.length;
        int pref=ar[0];
        int suf=0;
        int total=0;
        
        for(int i=0;i<n;i++)
        total=total+ar[i];
        
        for(int i=1;i<n;i++){
            suf=total-pref;
            if(pref==suf)
            return true;
            pref=pref+ar[i];
        }
        return false;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter element");
		for(int i=0;i<n;i++)    
		ar[i]=sc.nextInt();
		
		System.out.println(partition(ar));

	}
}
