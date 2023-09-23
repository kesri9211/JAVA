package Linkedlist;

public class Reverse {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    static void displayrev(Node temp){
        if(temp==null) return;
    displayrev(temp.next);
    System.out.print(temp.val+" ");
}
    static void display(Node temp){
        if(temp==null) return;
        System.out.print(temp.val+" ");
        display(temp.next);
    }

    static Node reverse(Node head){
        if(head.next==null) return head; //base
//recursive call which will reverse all connection from head.next
        Node newHead=reverse(head.next);
        head.next.next=head; //self work (interchange connection)
        head.next=null;  //point head to null
        return newHead;
    }

    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(5);
        Node c=new Node(3);
        Node d=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        display(a);
        Node newHead=reverse(a);
        System.out.println();
        display(newHead);

    }
}
