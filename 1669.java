class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count = 1;

        ListNode first = list1;
        while (count++ < a) first = first.next;
        ListNode second = first;
        while (a++ <= b) second = second.next;

        first.next = list2;
        while (list2.next != null) list2 = list2.next;
        list2.next = second.next;

        return list1;
    }
}