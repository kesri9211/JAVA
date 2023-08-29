import java.util.*;
public class Main
{
    static void sort(String s){
        int n=s.length();
        //convert string into Character
        char []ar = s.toCharArray();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(ar[j]>ar[j+1]){   
                    char temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
           }
        }
        for(int i=0;i<n;i++ )
         System.out.print(ar[i]+" ");
    }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		    String s=sc.next();
		 System.out.print(s);
		System.out.println("\nafter sorting");
		sort(s);
	}
}
