/*
  Problem 3: Longest Substring without Repeating Characters

  Time: O(N)
  Space: O(N)
*/

public int lengthOfLongestSubstring(String s) {
  int len = s.length();
  if (len == 0) return 0;

  int result = 1; 
  Map<Character, Integer> cache = new HashMap<>();
  int start = 0;
  for (int i = 0; i < len; ++i) {
    char ch = s.charAt(i);
    if (cache.containsKey(ch))
      start = Math.max(start, cache.get(ch) + 1);

    cache.put(ch, i);
    result = Math.max(result, i - start + 1);
  }

  return result;
}
