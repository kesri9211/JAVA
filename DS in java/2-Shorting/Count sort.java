import java.util.*;
public class Main
{
    //find maximum element from array
    static int maxValue(int ar[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if (ar[i]>max)
            max=ar[i];
        }
        return max;
    }
    //create freq array
    static int [] CreatefreqArr(int ar[]){
        int max=maxValue(ar); 
        int freq[]=new int[max+1];
        for (int i=0;i<ar.length;i++){
            freq[ar[i]]++;
        }
        return freq;
    }
	public static void main(String[] args) {
		int ar[]={4,3,1,5,3,1,3,5};
		int freq[]=CreatefreqArr(ar);
		int k=0;
		//store element into answer array using frequency(occurance) to get sorted array
		for(int i=0;i<freq.length;i++){
		    int c=freq[i];
		 //when freq is greater than zero enter number equals to 'frequency' number of time
		    while(c>0){ 
		        ar[k++]=i; //can update in same array
		        c--;
		    }
		}
		//print
		for(int i:ar)
		System.out.print(i+" ");
	}
}
