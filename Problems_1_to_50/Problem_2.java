/*
  Problem 2: Add Two Numbers

  Time: O(max(N, M))
  Space: O(1)
*/

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
  if (l1 == null) return l2;
  if (l2 == null) return l1;

  ListNode dummy = new ListNode(0);
  ListNode cur = dummy;
  int carry = 0;
  while (l1 != null || l2 != null || carry != 0) {
    int sum = carry;

    if (l1 != null) {
      sum += l1.val;
      l1 = l1.next;
    }

    if (l2 != null) {
      sum += l2.val;
      l2 = l2.next;
    }

    cur.next = new ListNode(sum % 10);
    cur = cur.next;
    carry = sum / 10;
  }

  return dummy.next;
}
