/*
the greatest element in an array 
*/
public class Main
{
    public static int max(int ar[],int idx,int ans){

       if(idx==ar.length)return ans;
       if(ar[idx]>ans)ans=ar[idx];
       return max(ar,idx+1,ans);

    }
	public static void main(String[] args) {
		int ar[]={1,7,5,3,9,0};
		int ans=0;
		System.out.println(max(ar,0,ans)); //9
	}
}

/*
sum of all element in array
*/
public class Main
{
    public static int sum(int ar[],int idx){

       if(idx==ar.length)return 0; //base case 
       return ar[idx]+sum(ar,idx+1); //recursive 
    }
	public static void main(String[] args) {
		int ar[]={1,7,5,3,9,0};
		
		System.out.println(sum(ar,0)); //25
	}
}
