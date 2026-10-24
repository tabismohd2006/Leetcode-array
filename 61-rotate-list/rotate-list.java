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
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        k = k % count;

        if (k == 0) {
            return head;
        }

        curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

       
        curr.next = head;

    
        curr = head;
        int steps = count - k - 1;

        for (int i = 0; i < steps; i++) {
            curr = curr.next;
        }

        
        head = curr.next;
        curr.next = null;

        return head;
    }
}
