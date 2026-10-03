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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        ListNode previous = null;
        ListNode newHead = null;
        while(curr != null && curr.next != null){
            ListNode first = curr;
            ListNode second = curr.next;
            ListNode nextNode = second.next;
            
            second.next = first;
            first.next = nextNode;
              if(previous == null){
            newHead = second;
        } else {
            previous.next = second;
        }
        previous = first;
        curr = nextNode;
        }
        return newHead;
      
        
    }
}