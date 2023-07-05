import java.util.*;
public class Main
{
    static void rev(int ar[]){
        int i=0;
        int j=ar.length-1;
        while(i<=j){    //swaping
            int temp=ar[j];
            ar[j]=ar[i];
            ar[i]=temp;
            i++;
            j--;
        }
        for(int a=0;a<ar.length;a++)
		System.out.print(ar[a]+" "); 
    }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int ar[]={1,2,3,4,5};
	    rev(ar);
	}
}
