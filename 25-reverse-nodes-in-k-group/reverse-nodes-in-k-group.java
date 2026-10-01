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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        ListNode previousGroupEnd = null;
        ListNode newHead = head;
        while(curr != null){
            ListNode temp = curr;
            int count = 0;
            while(temp != null && count < k){
                temp = temp.next;
                count++;
            }
            if(count < k){
                break;
            }
            ListNode groupStart = curr;
            ListNode prev = null;
            for(int i=0; i< k; i++){
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }
            if(previousGroupEnd == null){
                newHead = prev;
            } else {
                previousGroupEnd.next = prev;
            }
            groupStart.next = curr;
            previousGroupEnd = groupStart;
        }
        return newHead;
        
    }
}