/*
  Problem 24: Swap Nodes in Pairs

  Time: O(N)
  Space: O(1)
*/

public ListNode swapPairs(ListNode head) {
  ListNode dummy = new ListNode(0);
  dummy.next = head;
  ListNode prev = dummy;
  ListNode cur = dummy.next;
  while (cur != null && cur.next != null) {
    ListNode first = cur;
    ListNode second = cur.next;
    
    prev.next = second;
    first.next = second.next;
    second.next = first;

    prev = first;
    cur = first.next;
  }

  return dummy.next;
}
