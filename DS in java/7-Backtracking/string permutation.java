package Backtracking;
//Q: return all permutation of given string
//approach: recursion-- divide string and store into another string till str become empty (see examp in copy)
import java.lang.reflect.Array;
import java.util.ArrayList;

public class stringPermutation {
    public static void printp(String str, String t, ArrayList<String>l){
        //base case
        if(str.equals("")){
            l.add(t); //storing all permutation into arraylist
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i); //b
            String left=str.substring(0,i); //a
            String right=str.substring(i+1); //c
            String rem=left+right;//ac
            printp(rem,t+ch,l); //ac/b
        }
    }

    public static void main(String[] args) {
        String str="abc";
        ArrayList<String>l=new ArrayList<>();
        printp(str,"",l);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
