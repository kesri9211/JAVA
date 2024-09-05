/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    //count the lenght of ll
    //point last node to first node(circular ll)
    //move head to n-k+1 node 
    //point (n-k) node to null

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        //1
        ListNode temp=head;
        int len=1;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        //2
        temp.next=head;
        k=k%len; //if k>len
        //move point to n-k node
        temp=head;
        int t=len-k;
        while(t-->1){
            temp=temp.next;
        }
        //3
        head=temp.next;
        //4
        temp.next=null;
        
        return head;
    }
}
