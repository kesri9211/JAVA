/**
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list
k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
You may not alter the values in the list's nodes, only nodes themselves may be changed.
Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]

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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1)return head;
        //create dummy node
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode curr=dummy, prev=dummy, nex=dummy;

        //size of LL
        int count=0;
        while(curr.next!=null){
            count++;
            curr=curr.next;
        }

        while(count>=k){
            curr=prev.next;
            nex=curr.next;
            //follow these steps (k-1)time
            for(int i=1;i<k;i++){
                curr.next=nex.next;
                nex.next=prev.next;
                prev.next=nex;
                nex=curr.next;
            }
            prev=curr;
            count-=k;
        }
        return dummy.next;

    }
}
