/*
  Problem 5: Longest Palindromic Substring

  Time: O(N^2)
  Space: O(1)
*/

public String longestPalindrome(String s) {
  int len = s.length();
  if (len < 2) return s;

  int start = 0, end = 0;
  for (int i = 0; i < len; ++i) {
    char ch = s.charAt(i);
    int left = i, right = i;

    // check for duplicates
    while (left >= 0 && s.charAt(left) == ch)
      --left;
    while (right < len && s.charAt(right) == ch)
      ++right;

    // expand
    while (left >= 0 && right < len && s.charAt(left) == s.charAt(right)) {
      --left;
      ++right;
    }

    left = left + 1;
    if (end - start < right - left) {
      start = left;
      end = right;
    }
  }

  return s.substring(start, end);
}
