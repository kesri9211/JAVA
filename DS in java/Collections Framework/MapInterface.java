package collectionFramework;
import java.util.*;
public class mapInterfaceExample {
    public static void main(String[] args) {
        Map<Integer,String>mp=new HashMap<>();
        mp.put(1,"Aman");
        mp.put(4,"Riya");
        mp.put(2,"Sohan");
        mp.put(3,"Amit");
        System.out.println(mp);//{1=Aman, 2=Sohan, 3=Amit, 4=Riya}
        System.out.println(mp.get(2));//Sohan
        System.out.println(mp.containsKey(5));//false //containsValue("KESRI")
        mp.putIfAbsent(1,"kesri");//will not override aman
        System.out.println(mp.keySet());//return keys [1, 2, 3, 4]

        //iterate over values
        for(var i:mp.values()){
            System.out.println(i);
        }

        //iterate over key value mapping
        for(var j:mp.entrySet()){
            // System.out.println(j); //print all
           // System.out.println(j.getKey()); //print only keys
            System.out.println(j.getValue());
        }

    }
}
