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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        int n = 0;
        ListNode curr = head;
        while(curr != null){
            n++;
            curr = curr.next;
        }
        int Middle = n/2;
        ListNode prev = head;
        for(int i = 0; i< Middle-1; i++){
            prev = prev.next;

        }
        prev.next = prev.next.next;
        return head;
        
    }
}