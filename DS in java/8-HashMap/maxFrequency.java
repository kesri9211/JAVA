package Hashmap;

import java.util.HashMap;
import java.util.Map;

/*Given an array, find the most frequent element in it. If there are multiple
elements that appear a maximum number of times, print any one of them.
 */
public class Frequency {
    public static void main(String[] args) {
        int ar[]={1,2,3,1,1,4,3,4,5,2,2,2};
        Map<Integer,Integer>mp=new HashMap<>();
//first check map contains array element if not then put and if yes update that key value by one
        for(int i=0;i<ar.length;i++){
            if(!mp.containsKey(ar[i]))
                mp.put(ar[i],1);
            else
                mp.put(ar[i],mp.get(ar[i])+1);
        }
        System.out.println("hash map");
        System.out.println(mp.entrySet()); //[1=3, 2=1, 3=1, 4=1]
        //finding highest frequency
        int keyV=-1;
        int max=-1;
        for (int i:mp.keySet()){
            if(max<mp.get(i)) {
                max = mp.get(i);
                keyV = i;
            }
            }
        System.out.println("highest freq is of "+keyV+" "+max); //highest freq is of 1 3
        }
    }
