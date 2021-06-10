class Solution {
   public int getDecimalValue(ListNode head) {
            StringBuilder sb = new StringBuilder();
            ListNode next = head;
            while(next!=null)
            {
                sb.append(Integer.toString(next.val));
                next = next.next;
            }
            return Integer.parseInt(sb.toString(), 2);
        }
}