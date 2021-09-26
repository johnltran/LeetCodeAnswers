/*
  Problem 19: Remove Nth Node from End of List

  Time: O(N)
  Space: O(1)
*/

public ListNode removeNthFromEnd(ListNode head, int n) {
  ListNode dummy = new ListNode(0);
  dummy.next = head;
  ListNode fast = dummy;
  while (n > 0) {
    fast = fast.next;
    --n;
  }

  ListNode slow = dummy;
  while (fast.next != null) {
    fast = fast.next;
    slow = slow.next;
  }

  slow.next = slow.next.next;
  return dummy.next;
}
