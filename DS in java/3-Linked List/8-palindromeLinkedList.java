class Solution {
    // Function to reverse a linked list
    static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node nextNode = null;
        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    
    // Function to check whether the list is palindrome
    boolean isPalindrome(Node head) {
        if (head == null || head.next == null) 
            return true; // Empty list or single node is palindrome
        
        Node slow = head;
        Node fast = head;
        
        // Find the middle of the linked list
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Reverse the second half of the linked list
        Node secondHalf = reverse(slow.next);
        
        // Compare the first half with the reversed second half
        Node firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false; // Not a palindrome
            
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true; // Palindrome
    }
}
