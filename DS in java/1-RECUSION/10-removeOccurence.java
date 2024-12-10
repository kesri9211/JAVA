/*
remove all occurrence of a from string
*/
public class Main
{
    public static String remove(String s,char c,int idx){
        
        String ans="";
        if(idx==s.length())return "";
   
        if(s.charAt(idx)!=c)
            ans+= s.charAt(idx)+remove(s,c,idx+1);
        else return remove(s,c,idx+1);
        return ans;
    }
	public static void main(String[] args) {
		
		String s="baxcda";
		char c='a';
		String ans="";
		System.out.println(remove(s,c,0)); //bxcd
	}
}

/*
M2
*/
import java.util.*;
public class Main
{
    public static String remove(String s,char c){
        
        if(s.length()==0)return "";
        
        String subString=remove(s.substring(1),c);
        
        if(s.charAt(0)!=c)
            return s.charAt(0)+subString;
        else return subString;

    }
	public static void main(String[] args) {
		
		String s="baxcda";
		char c='a';
		System.out.println(remove(s,c)); //bxcd
	}
}
