public class Main
{
    static boolean palindrome(char s[],int i){
        int n=s.length;
       if(i>=n/2) return true;
       if(s[i]!=s[n-i-1]) return false;
       return palindrome (s,i+1);
    }
	public static void main(String[] args) {
	    String s="madam";
	    char ch[]=s.toCharArray();
	    System.out.print(palindrome(ch,0));
	}
}
