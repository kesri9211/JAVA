
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int ar[]={2,1,1,3,2,3};
		int max=0;
		//set 
		HashSet<Integer>set=new HashSet<>();
		for(int i=0;i<ar.length;i++){
		    if(set.contains(ar[i])){
		        set.remove(ar[i]);
		    }
		    else{
		        set.add(ar[i]);
		        max=Math.max(max,set.size());
		    }
		}
		System.out.println(max);
	}
}
