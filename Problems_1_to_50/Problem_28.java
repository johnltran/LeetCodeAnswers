/*
  Problem 28: Implement strStr()

  Time: O(N * M)
  Space: O(1)
*/

public int strStr(String haystack, String needle) {
  int len1 = haystack.length(), len2 = needle.length();
  if (len2 == 0) return 0;
  if (len1 == 0) return -1;

  for (int i = 0; i < len1; ++i) {
    if (i + len2 > len1) break;

    for (int j = 0; j < len2; ++j) {
      if (needle.charAt(j) != haystack.charAt(i + j)) break;
      if (j == len2 - 1) return i;
    }
  }

  return -1;
}
