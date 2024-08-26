/*
Prasad is developing a program to convert a given integer into its corresponding Excel column name.
He wants to create a function that takes an integer as input and returns its corresponding Excel column name. In Excel, column names are represented using capital letters from A to Z, and then AA, AB, and so on. For example, 1 corresponds to "A", 2 corresponds to "B", 26 corresponds to "Z", 27 corresponds to "AA", and so forth.
Prasad's function should handle the conversion accurately. Can you help Prasad write this program?
Note: Ensure that the returned string is in the upper case.
*/
public class Main
{
	public static void main(String[] args) {
	    String ans="";
	    int n=28;
        while(n>0){
            int rem=(n-1)%26;
            ans=(char)(65+rem)+ans;
            n=(n-1)/26;
            System.out.println(rem+" "+n);
            
        }System.out.println(ans);
        
	}
}
