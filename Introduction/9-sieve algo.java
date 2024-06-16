//SIMPLE SIEVE ALGO for finding range of prime number
/*create list of consecutive integers from 2 through the limit 
set a variable p to 2, the smallest prime Number
cross out all multiple of p form the list straring from the list , starting from p^2
find the next num in the list that is not crossed out. THis is the next prime Number
set p to the next orime num found in step 4 and repeat steps 3-5 until p^2 is greator than the limit 
the remaining Number in teh list are all prime Number*/
public class Main
{
	public static void main(String[] args) {
	    int limit=40;
		boolean prime[]=new boolean[limit+1];
		// for(int i=2;i<=limit;i++){
		//     prime[i]=true;
		// }   OR
		Arrays.fill(prime, true);
		
		for(int p=2;p*p<=limit;p++){
		    if(prime[p]==true){
		        for(int i=p*p;i<=limit;i+=p){
		            prime[i]=false;
		        }
		    }
		}
		
		for(int i=2;i<=limit;i++){
		    if(prime[i]==true) System.out.print(i+" ");
		}
	}
}
//time complexity is O(n logn)
