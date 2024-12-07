//program to find sum of n term with alternate sign
public class Main
{
    public static int sum(int n){

        if(n==0)return 0; //base case
        if(n%2==0)return sum(n-1)-n;
        else return sum(n-1)+n;
    }
	public static void main(String[] args) {
		int n=4;
		System.out.println(sum(n)); //-2
	}
}
