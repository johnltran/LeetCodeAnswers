/*
  Problem 25: Reverse Nodes in k-Groups

  Time: O(N)
  Space: O(1)
*/

public ListNode reverseKGroup(ListNode head, int k) {
  if (head == null || head.next == null || k == 1)
    return head;

  ListNode dummy = new ListNode(0);
  dummy.next = head;
  ListNode begin = dummy, cur = head;
  int i = 0;
  while (cur != null) {
    ++i;
    if (i % k == 0) {
      begin = reverseHelper(begin, cur.next);
      cur = begin.next;
    } else {
      cur = cur.next;
    }
  }

  return dummy.next;
}

private ListNode reverseHelper(ListNode begin, ListNode end) {
  ListNode prev = begin, cur = begin.next;
  ListNode first = begin.next;
  while (cur != end) {
    ListNode next = cur.next;
    cur.next = prev;
    prev = cur;
    cur = next;
  }

  begin.next = prev;
  first.next = cur;

  return first;
}
