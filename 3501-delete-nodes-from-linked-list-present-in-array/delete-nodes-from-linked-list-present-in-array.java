class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

        HashSet<Integer> set = new HashSet<>();

        // nums ki values Set mein daalo
        for (int num : nums) {
            set.add(num);
        }

        // Dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = dummy;

        while (curr.next != null) {

            if (set.contains(curr.next.val)) {
                // node delete
                curr.next = curr.next.next;
            } else {
                // aage badho
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}