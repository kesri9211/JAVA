import java.util.*;
public class Main
{
    static void sort(int ar[]){
        int n=ar.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(ar[j]==0 && ar[j+1]!=0){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
    }
	public static void main(String[] args) {
	    int ar[]={0,3,0,5,6,0};
		System.out.println("ans");
		sort(ar);
		for(int i=0;i<ar.length;i++)
		System.out.print(ar[i]+" ");
	}
}
