/*
  Problem 17: Letter Combinations of a Phone Number

  Time: O(4^N) where N is length of string
  Space: O(1)
*/

public List<String> letterCombinations(String digits) {
  LinkedList<String> result = new LinkedList<>();
  if (digits.isEmpty()) return result;
  result.add("");
  String[] map = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs",
    "tuv", "wxyz" };

  while (result.get(0).length() < digits.length()) {
    String cur = result.poll();
    char digit = digits.charAt(cur.length()); 
    String key = map[digit - '0'];

    for (char ch : key.toCharArray())
      result.add(cur + ch);
  }

  return result;
}
