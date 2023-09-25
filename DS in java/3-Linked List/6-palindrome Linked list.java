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
    public boolean isPalindrome(ListNode head) {
    ListNode slow=head;
    ListNode fast=head;
    while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    ListNode p2=reverse(slow.next);
    ListNode p1=head;
    while(p2!=null){
        if(p1.val!=p2.val) return false;
        p1=p1.next;
        p2=p2.next;
    }
    return true;
    }

public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode agla=null;
        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
}   
}
//M2 store linked list into array and check

//         ArrayList<Integer> list= new ArrayList<>();
//         ListNode temp=head;
//         while(temp!=null){
//             list.add(temp.val);
//             temp=temp.next;
//         }
//         int n=list.size();
//         for(int i=0;i<n/2;i++){
//             if(list.get(i)!=list.get(n-i-1)) return false;
//         }
// return true;
