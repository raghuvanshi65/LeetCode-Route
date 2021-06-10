public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count = 0;
        Set<ListNode> set1 = new HashSet<>();
        while (headA != null || headB != null) {
            if (headA != null) {
                set1.add(headA);
                count++;
                if (set1.size() != count)
                    return headA;
                else
                    headA = headA.next;
            }
            if (headB != null) {
                set1.add(headB);
                count++;
                if (set1.size() != count)
                    return headB;
                else
                    headB = headB.next;
            }

        }

        return null;
    }
}