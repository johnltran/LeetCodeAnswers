/*
  Problem 6: ZigZag Conversion

  Time: O(max(N, M)) where N is length of the string
        and M is numRows
  Space: O(M) 
*/

public String convert(String s, int numRows) {
  if (numRows == 1) return s;
  List<StringBuilder> cache = new ArrayList<>();

  for (int r = 0; r < numRows; ++r)
    cache.add(new StringBuilder());

  int curRow = 0;
  boolean isDown = false;
  for (char ch : s.toCharArray()) {
    cache.get(curRow).append(ch);

    if (curRow == 0 || curRow == numRows-1)
      isDown = !isDown;

    curRow += isDown ? 1 : -1;
  }

  StringBuilder result = new StringBuilder();
  for (StringBuilder c : cache)
    result.append(c);

  return result.toString();
}
