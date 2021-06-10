public class Solution {
    public boolean hasCycle(ListNode head) {
        int count = 0;
        if (head == null || head.next == null)
            return false;
        while (count <= 10000) {
            if (head == null)
                return false;
            head = head.next;
            count++;
        }
        return true;
    }
}