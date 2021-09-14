/*
  Problem 14: Longest Common Prefix

  Time: O(A) where A is total characters in array
  Space: O(1)
*/

public String longestCommonPrefix(String[] strs) {
  int len = strs.length;
  if (len == 0) return "";
  if (len == 1) return strs[0];

  String first = strs[0];
  for (int i = 1; i < len; ++i) {
    if (first.isEmpty()) return "";
    String cur = strs[i];
    int j = 0;

    while (j < first.length() && j < cur.length() &&
      first.charAt(j) == cur.charAt(j)) ++j;

    first = first.substring(0, j);
  }

  return first;
}
