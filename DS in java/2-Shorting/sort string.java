import java.util.*;
public class Main
{      //selection sort
    static void sort(String ar[]){
        int n=ar.length;
        for(int i=0;i<n-1;i++){
            int min=i;    //store value of smallest index
            for(int j=i+1;j<n;j++){
//compare string and find index of smallest value and then place it on its right postion by swapping
                if(ar[j].compareTo(ar[min])<0) min=j;   
                
                /* j<min =-1 
                   j>min =1 
                   j=min =0.  */
            }
            //swap ar[min] and ar[i]
            String temp=ar[min];
            ar[min]=ar[i];
            ar[i]=temp;
        }
    }
	public static void main(String[] args) {
	    String ar[]={"kesri","arpita","ayush","rohit","puneet","girish"};
		System.out.println("ans");
		sort(ar);
		for(String val:ar)
		System.out.print(val+", ");
	}
}
