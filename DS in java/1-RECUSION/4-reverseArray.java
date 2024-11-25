public class Main
{
    static void reverse(int ar[],int i,int j){
       if(i>=j)return;
       int t=ar[i];
       ar[i]=ar[j];
       ar[j]=t;
       reverse(ar,i+1,j-1);
    }
	public static void main(String[] args) {
	    int ar[]={1,2,3,4,5};
	    reverse(ar,0,4);
	    for(int i:ar)System.out.print(i);
	}
}
