/*
  Problem 8: String to Integer (atoi)

  Time: O(N)
  Space: O(1)
*/

public int myAtoi(String s) {
  int len = s.length();
  if (len == 0) return 0;

  int i = 0, sign = 1, result = 0;
  int MIN_INT = Integer.MIN_VALUE, MAX_INT = Integer.MAX_VALUE;

  // Ignore leading whitespace
  while (i < len && s.charAt(i) == ' ') ++i;
  if (i >= len) return 0;

  // Check sign
  if (s.charAt(i) == '+' || s.charAt(i) == '-') {
    sign = (s.charAt(i) == '-') ? -1 : 1;
    ++i;
  }

  // Read digits
  while (i < len && Character.isDigit(s.charAt(i))) {
    int digit = s.charAt(i) - '0';

    // Check overflow
    if (result > MAX_INT / 10 || (result == MAX_INT / 10 && digit > MAX_INT % 10)) {
      return (sign == -1) ? MIN_INT : MAX_INT;
    }

    result = result * 10 + digit;
    ++i;
  }

  return sign * result;
}
