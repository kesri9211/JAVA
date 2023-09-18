package Linkedlist;
/*Given two linked list in a way such that the resultant
 list must contain the alternate elements from one in java
 */
public class Merge {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class AlternateMerge {
        public static ListNode mergeAlternate(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(0); // Dummy node to simplify the code
            ListNode current = dummy;

            while (l1 != null && l2 != null) {
                current.next = l1; // Add the current node from l1
                l1 = l1.next; // Move to the next node in l1
                current = current.next;

                current.next = l2; // Add the current node from l2
                l2 = l2.next; // Move to the next node in l2
                current = current.next;
            }

            // If one of the lists is longer than the other, add the remaining elements
            if (l1 != null) {
                while (l1 != null) {
                    current.next = l1; // Add the current node from l1
                    l1 = l1.next; // Move to the next node in l1
                    current = current.next;
                }
            }

            if (l2 != null) {
                while (l2 != null) {
                    current.next = l2; // Add the current node from l2
                    l2 = l2.next; // Move to the next node in l2
                    current = current.next;
                }
            }

            return dummy.next;
        }

        public static void printList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            ListNode l1 = new ListNode(10);
            l1.next = new ListNode(20);
            l1.next.next = new ListNode(30);
            l1.next.next.next = new ListNode(40);
            l1.next.next.next.next = new ListNode(50);
            System.out.println("first list");
            printList(l1);

            ListNode l2 = new ListNode(90);
            l2.next = new ListNode(100);
            l2.next.next = new ListNode(200);
            l2.next.next.next = new ListNode(300);
            System.out.println("second list");
            printList(l2);

            ListNode mergedList = mergeAlternate(l1, l2);

            System.out.println("Resultant list:");
            printList(mergedList);
        }
    }

}
