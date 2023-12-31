package Hashmap;
import java.util.*;
public class Introduction {
    public static void main(String[] args) {
        //syntax of Hashmap
        Map<String,Integer>mp=new HashMap<>();
        //Adding element
        mp.put("Akash",1);
        mp.put("Anuj",10);
        mp.put("Kesri",11);
        mp.put("Puneet",31);
        mp.put("Sita",12);
        mp.put("Geeta",14);
        //getting value of key from hashmap
        System.out.println(mp.get("Kesri")); //11
        //changing value of key in hashmap
        mp.put("Akash",15);//value of akash get updated-contains unique keys
        System.out.println(mp.get("Akash"));//15
        //removing a pair from hashmap
        System.out.println(mp.remove("Anuj"));//10
        System.out.println(mp.remove("Ritu"));//null
        //checking key exit or not
        System.out.println(mp.containsKey("Kesri"));//true
        //adding new entry only if key does not exit
        mp.putIfAbsent("Yash",23);
        //getting all key in the hashmap
        System.out.println(mp.keySet()); //[Kesri, Geeta, Sita, Yash, Akash, Puneet]
        //get all value in the hashmap
        System.out.println(mp.values()); //[11, 14, 12, 23, 15, 31]
        //get all entry in the hashmap
        System.out.println(mp.entrySet()); //[Kesri=11, Geeta=14, Sita=12, Yash=23, Akash=15, Puneet=31]
        //traversing all entries of hashmap
        for(String key: mp.keySet())
            System.out.println( key + " "+mp.get(key));
        System.out.println();
        //or
        for(Map.Entry<String,Integer>e:mp.entrySet())
            System.out.printf("Age of %s %d\n",e.getKey(),e.getValue());
        System.out.println();
        //or
        for (var e:mp.entrySet())
            System.out.printf("Age of %s %d\n",e.getKey(),e.getValue());

    }
}
