import java.util.*;
public class Main
{
    void bubble(int ar[],int n){
        for(int i=0;i<n;i++){
            int f=0;    //has any swap happened 
            for(int j=0;j<n-i-1;j++){
                if(ar[j]>ar[j+1]){
                    f=1;
                    int temp=ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                }
            }
            if(f==0)   //check before going to i loop whether swap happened? 
            return;    //return when no swap happened
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		ar[i]=sc.nextInt();
		Main obj=new Main();
		obj.bubble(ar,n);
		//System.out.println(Arrays.toString(ar));
		for(int i=0;i<n;i++)
		System.out.print(ar[i]+" ");
	}
}
