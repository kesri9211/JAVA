import java.util.*;
public class Main
{
    static void bucketSort(float ar[]){
        int n=ar.length;
      //create bucket -> array of arrayLIST
        ArrayList<Float>buckets[]=new ArrayList[n];
      //create empty buckets
        for(int i=0;i<n;i++)
        buckets[i]=new ArrayList<Float>();
      //add element into bucket
        for(int i=0;i<n;i++){
            int bucketindex=(int)ar[i]*n;
            buckets[bucketindex].add(ar[i]);
        }
      //sort each bucket individually
        for(int i=0;i<n;i++)
        Collections.sort(buckets[i]);
      //merge all bucket to get final sorted ArrayList
        int index=0;
        for(int i=0;i<buckets.length;i++){
            ArrayList<Float> currBucket=buckets[i];
        for(int j=0;j<currBucket.size();j++){
        ar[index++]=currBucket.get(j);
        }
    }
    }
	public static void main(String[] args) {
		float ar[]={0.5f,0.3f,0.6f,0.1f};
		bucketSort(ar);
		for(float val:ar)
		System.out.print(val+" ");
	}
}
