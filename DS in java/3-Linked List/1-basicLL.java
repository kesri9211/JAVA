public class BasicLl
{
    //display Linkedlist
    public static void display(Node temp){
        while(temp!=null){
		    System.out.print(temp.data+" ");
		    temp=temp.next;
    }
    }
    
    //display Linkedlist recursively
    public static void displayr(Node head){
        if(head==null) return;
		   System.out.print(head.data+" ");
		    displayr(head.next);
    }
    
    static class Node{ //class Node -> user define data type
        int data; //store data
        Node next;  //store address of next node 
        
        Node(int x){ //constructor
            this.data=x;
            this.next=null;
        }
    }
    
	public static void main(String[] args) {
		Node a=new Node(5);
		System.out.println(a.next);  //null
		System.out.println(a.data);  //5
		Node b=new Node(6);
		Node c=new Node(8);
		Node d=new Node(2);
		// 5 6 8 2
		a.next=b;
		b.next=c;
		c.next=d;
		// 5 -> 6 -> 8 -> 2
		System.out.println(a.next.data); //6
		
		//insert element at position 2
		Node e=new Node(7);
		e.next=b;
		a.next=e;// 5 -> 7-> 6 -> 8 -> 2
		System.out.println(a.next.data); //7
		
		//print Linkedlist
		display(a);   //passing head
		System.out.println("\nprint recursively");
		displayr(a);
		
	}
}
