package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setInterfaceExamp {
    public static void main(String[] args) {
        hashSet();
        linkedHashset();
        treeSet();
    }
    static void hashSet(){
        //unordered
        //unique
        //uses hashing internally
        HashSet<Integer>hs=new HashSet<>();
        hs.add(1);//1
        hs.add(2);//1 2
        hs.add(3);//1 2 3
        hs.add(8);//1 2 3 8
        System.out.println(hs);
        hs.remove(1);
        System.out.println(hs.contains(1));//false
    }

    static void linkedHashset(){
        //ordered
        //unique
        //used linked+hash table internally
        LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
        lhs.add(1);//1
        lhs.add(2);//1 2
        lhs.add(3);//1 2 3
        lhs.add(6);//1 2 3 6
        System.out.println(lhs);
    }

    static void treeSet(){
        //sorted order
        //self-balancing BST
        //RED-Black tree
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(5);
        ts.add(76);
        ts.add(6);
        ts.add(3);
        ts.add(89);
        System.out.println(ts);//[3, 5, 6, 76, 89]
    }


}
