/*
program to find GCD using euclid's algo

euclid's algo: 
        gcd(x,y)=gcd(y,x%y)
        gcd(x,0)=x
lcm*gcd=x*y
*/
public class Main
{
    public static int gcd(int a,int b){

        if(b==0)return a;
        return gcd(b,a%b);
        
    }
	public static void main(String[] args) {
		int a=24;
		int b=12;
		System.out.println(gcd(a,b)); //12
	}
}
