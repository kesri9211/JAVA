package Stack;

public class StackUsingLL {

    public static class Node { //create class Node-> user define data type
        int data;
        Node next;
        Node(int data){ //constructor
            this.data=data;
            this.next=null;
        }
    }

    public static class Implement{   //class to implement various function on stack
        Node top=null; //for traversing stack
        
        void push(int data){
            Node temp=new Node(data); //new Node you want to push
            temp.data=data;// initialize data into temp data field
            temp.next=top;//connect nodes(put top reference into temp)
            top=temp;//update top reference
            System.out.println("element push "+top.data);
        }

        void pop(){
            if(top==null){
                System.out.println("stack underflow");
                return;
            }
            System.out.println("element poped "+top.data);
            top=top.next; //update top
        }

        void display(){
            Node flag=top;
            if(top==null){
                System.out.println("Stack Underflow");
                return;
            }
            while(flag!=null){
                System.out.print(flag.data+" -> ");
                flag=flag.next;
            }
            System.out.println("null");
        }

        }

    public static void main(String[] args) {
        Implement obj=new Implement();
        obj.push(5);
        obj.push(4);
        obj.push(2);
        obj.push(1);
        obj.display();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.display();
    }
    }

