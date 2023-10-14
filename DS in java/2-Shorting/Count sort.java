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
    static void display(int ar[]){
        for(int i:ar)
		System.out.print(i+" ");
    }
    static void basicCountSort(int ar[]){
        int max=maxValue(ar); 
        //1-create freq array
        int freq[]=new int[max+1];
        for (int i=0;i<ar.length;i++){
            freq[ar[i]]++;
        }
        int k=0;
		//2-store element into answer array using frequency(occurance) to get sorted array
		for(int i=0;i<freq.length;i++){
		    int c=freq[i];
		 //when freq is greater than zero enter number equals to 'frequency' number of time
		    while(c>0){ 
		        ar[k++]=i; //can update in same array
		        c--;
		    }
		}
    }
                  /*-----------STABLE--------*/
    static void CountSort(int ar[]){
        int n=ar.length;
        int max=maxValue(ar); 
        int output[]=new int[n];
        //1-create freq array
        int freq[]=new int[max+1];
        for (int i=0;i<ar.length;i++){
            freq[ar[i]]++;
        }
        //2-create prefix sum array of freq array
        for(int i=1;i<freq.length;i++)
        freq[i]=freq[i]+freq[i-1]; //update there only
        
        //3-find index of each element in original array and put in output array
        //traverse backward
        for(int i=n-1;i>=0;i--){
            int index=--freq[ar[i]];
    //Decrement value of prefixSumArray,which gives new position of index(element in original array)
            output[index]=ar[i];
        }
        display(output);
    }
    
	public static void main(String[] args) {
		int ar[]={4,3,1,5,3,1,3,5};
		//basicCountSort(ar);
		CountSort(ar);
	}
}
