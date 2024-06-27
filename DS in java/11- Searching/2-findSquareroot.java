//square root of given number (round off)
public class Main
{
	public static void main(String[] args) {
		int l=0;
		int x=24; //find square root
		int r=x;
		int ans=0;
		while(l<=r){
		    int mid=l+(r-l)/2;
		    if(mid*mid<=x){
		        ans=mid;
		        l=mid+1;
		    }
		    else if(mid*mid>x){
		        r=mid-1;
		    }
		}
		System.out.print(ans);
	}
}
