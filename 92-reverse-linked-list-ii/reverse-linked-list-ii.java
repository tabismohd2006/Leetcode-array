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
    public ListNode reverseBetween(ListNode head, int left, int right) {
             if (head == null || left == right) {
            return head;
        }
        ListNode before = null;
        ListNode curr = head;
        for(int i = 1; i< left; i++){
            before = curr; curr = curr.next;
        }
        ListNode reversestart = curr; 
        ListNode prev = null;
        for(int i = left; i <= right; i++){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev= curr;
            curr = nextNode;

            if (before != null){
                before.next = prev;
            } else {
                head = prev;
            }
            reversestart.next = curr;
           
        }
         
        return head;
        
    }
}