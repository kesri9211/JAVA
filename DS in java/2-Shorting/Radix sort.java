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

  
    static void CountSort(int ar[],int place){
        int n=ar.length;
        int output[]=new int[n];
        //create freq array
        int freq[]=new int[10];
        for (int i=0;i<ar.length;i++){ //ar[i]=105 ,freq[5]++,place=1
            freq[(ar[i]/place)%10]++;
        }
        //create prefix sum array of freq array
        for(int i=1;i<freq.length;i++)
        freq[i]=freq[i]+freq[i-1]; //update there only
        
        //find index of each element in original array and put in output array
        //traverse backward
        for(int i=n-1;i>=0;i--){
            int index=--freq[(ar[i]/place)%10];
    //Decrement value of prefixSumArray,which gives new position of index(element in original array)
            output[index]=ar[i];
        }
        for(int i=0;i<n;i++)
        ar[i]=output[i]; //update orginal array and again sort with tens 
    }
    
    static void RadixSort(int ar[]){
        int max=maxValue(ar);//get maximum element from array
        //sort digit by digit using count sort
        for(int place=1;max/place>0;place*=10){
            CountSort(ar,place);
    }
    }
    
	public static void main(String[] args) {
		int ar[]={170,45,75,802,2,76};
		RadixSort(ar);
		display(ar);
		
	}
}
