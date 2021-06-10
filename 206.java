class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;

        while (head != null) {
            ListNode nextNode = head.next;
            head.next = newHead;
        }
    }
}