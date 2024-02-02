/*strobagrammatic number: A strobogrammatic number is a number whose numeral is rotationally 
symmetric, so that it appears the same when rotated 180 degrees. In other words, 
the numeral looks the same right-side up and upside down.
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String num="9086";
		Map<Character,Character>map=new HashMap<Character,Character>();
		map.put('6','9');
		map.put('9','6');
		map.put('0','0');
		map.put('1','1');
		map.put('8','8');
		
		int left=0;
		int right=num.length()-1;
		int flage=0;
		while(left<=right){
		  //  if(!map.containsKey(num.charAt(left)))
		  //      return false;
		        
		    if(map.get(num.charAt(left))!=num.charAt(right)){
		        flage=1;
		        break;
		    }
		       
		    left++;
		    right--;
		}
		if(flage==1) 
		System.out.println("false");
		else
		System.out.println("true");
		
	}
}
