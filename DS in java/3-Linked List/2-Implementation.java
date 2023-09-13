package Linkedlist;

    public class implementation {

        public static class Node{   //class Node -> user define data type
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }

        public static class Linkedlist{
            Node head=null;
            Node tail=null;
            int size=0; //to track size of LL

            void display(){ //display
                Node temp=head;  //otherwise head will be null
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }
                System.out.println();
            }

//            int size(){ //return size of LL
//                Node flag=head;
//                int c=0;
//                while(flag!=null){
//                    c++;
//                    flag= flag.next;
//                }
//                return c;
//            }

            void at_end(int data) {
                Node temp = new Node(data);  //create new Node to add
                if (head == null) {   //if no node-> then both head and tail will point to that node only
                    head = temp;
                    tail = temp;
                }
                else{
                    tail.next = temp;
                    tail = temp; //shift tail to last node
                }
                size++;
            }

            void at_start(int data){
                Node temp=new Node(data); //create new Node to add
                if(head==null){ //if no node-> then both head and tail will point to that node only
                    head=temp;
                    tail=temp;
                }
                else {
                    temp.next=head;
                    head=temp; //shift head to first node
                }
                size++;
            }

            void at_pos(int data, int pos){
                if(pos==0) {  //insert at start
                    at_start(data);
                    return; //must return to end
                }
                else if(pos==size) {
                    at_end(data);
                    return;
                }
                else{
                    Node temp=new Node(data); //create new node to add
                    Node f=head;  //Pointer to Iterate
                    for(int i=1;i<=pos-1;i++) f = f.next;
                    temp.next=f.next;
                    f.next=temp;
                    f=temp;
                }
                size++;
            }

            int get_at(int pos){
                if(pos<0 || pos>size) return -1;
                Node temp=head;
                for(int i=1;i<=pos;i++)
                    temp=temp.next;
                //System.out.println("element at "+pos+"="+temp.data);
                return temp.data;
            }

            void del_atEnd(int pos){
                Node temp=head;
                for(int i=0;i<pos-1;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next; //del node
                tail=temp; //update tail
                size--;
            }

            void del_atStart(){
                head=head.next;
                size--;
            }

            void del_at(int pos){
                if(pos==size){
                    del_atEnd(pos);
                    return;}
                else if(pos==0)
                    del_atStart();
                else {
                    Node temp = head;
                    for (int i = 0; i < pos - 1; i++) {
                        temp = temp.next;
                    }

                    temp.next = temp.next.next;
                    size--;
                }
            }
        }

        public static void main(String[] args) {
            Linkedlist ll=new Linkedlist();
            ll.at_end(50);
            ll.at_end(5);
            ll.at_start(6);
            ll.display(); //6 -> 5 -> 50
            ll.at_pos(0,2);//6 -> 50 -> 0 -> 5
            ll.display();
            ll.at_pos(8,3);//6 -> 50 -> 0 -> 8 -> 5
            ll.at_pos(8,5);//6 -> 0 -> 8 -> 50 -> 5 ->8 (call at_end)
            ll.display();
            ll.at_pos(9,0); //9-> 6-> 50-> 0-> 8-> 5-> 8 (call at_start)
            ll.display();
            //System.out.println(ll.tail.data); //8
            //System.out.println(ll.get_at(8)); //-1
            ll.del_at(6); //9 -> 6 -> 50 -> 0 -> 8
            ll.display();
            ll.del_at(0); //6 -> 50 -> 0 -> 8 -> 5
            ll.display();
            System.out.println(ll.tail.data); //8
        }
    }
