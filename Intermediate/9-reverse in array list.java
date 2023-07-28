import java.util.*;
import java.util.ArrayList;
public class Main
{
    static void revarrlist(ArrayList<Integer> list){
        int i=0;
        int j=list.size()-1;
        while(i<j){
            Integer temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        System.out.println(list);
    }
    
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		l.add(5);
		l.add(4);
		l.add(19);
		l.add(44);
		l.add(6);
		System.out.println("orginal Array");
		System.out.println(l);
		System.out.println("reverse array");
		revarrlist(l);
	}
}
