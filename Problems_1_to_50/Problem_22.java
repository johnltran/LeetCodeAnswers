/*
  Problem 22: Generate Parentheses

  Time:
  Space:
*/

public List<String> generateParentheses(int n) {
  List<String> result = new ArrayList<>();
  if (n == 0) {
    result.add("");
    return result;
  }

  for (int i = 0; i < n; ++i) {
    for (String left : generateParentheses(i)) {
      for (String right : generateParentheses(n - 1 - i)) {
        result.add("(" + left + ")" + right);
      }
    }
  }

  return result; 
}
