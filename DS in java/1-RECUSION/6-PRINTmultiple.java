//program to get multiple of k n times using recursion
public class Main
{
    public static void multiple(int k,int n){
        if(n==0)return; //base case
        multiple(k,n-1); //recursive call
        System.out.println(k*n); //self work
    }
	public static void main(String[] args) {
		int k=5;
		int n=4;
		multiple(k,n);
	}
}
