/*
  Problem 23: Merge K Sorted Lists

  Time: O(N log N)
  Space: O(N)
*/

public ListNode mergeKLists(ListNode[] lists) {
  if (lists.length == 0) return null;

  // min heap
  PriorityQueue<ListNode> q = new PriorityQueue<>((x, y) -> x.val - y.val);
  for (ListNode list : lists) {
    if (list != null) q.add(list);
  }

  ListNode dummy = new ListNode(0);
  ListNode cur = dummy;
  while (!q.isEmpty()) {
    ListNode node = q.poll();
    cur.next = node;
    cur = cur.next;

    if (node.next != null) q.add(node.next);
  }
  
  return dummy.next;
}
