package collectionFramework;

import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {
        stackExample();
        queueExample();
        priorityQExample();
        dequeExample();
        //setExample();

    }
    static void stackExample(){
        Stack<Integer> st=new Stack<>();
        st.push(3);//3
        st.push(4);//4,3
        System.out.println(st.peek());//4
        st.pop();//4
    }

    static void queueExample(){
        LinkedList<Integer> q=new LinkedList<>();
        q.offer(4);//4
        q.offer(5);//4 5
        q.offer(6);//4 5 6
        q.pop();//5 6
        System.out.println(q.peek());//5
    }

    static void priorityQExample(){
        PriorityQueue<Integer>pq=new PriorityQueue<>();//min
        pq.offer(4);
        pq.offer(8);
        pq.offer(2);
        System.out.println(pq);//2 8 4
        System.out.println(pq.peek());//2
        pq.poll();
        System.out.println(pq);//4 8

        PriorityQueue<Integer> pqmax=new PriorityQueue<>(Comparator.reverseOrder());//max
    }

    static void dequeExample(){
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(2);//2
        dq.addFirst(3);//3 2
        dq.addLast(5);//3 2 5
        System.out.println(dq.pollFirst());//3

    }
}
