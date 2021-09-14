/*
  Problem 13: Roman to Integer

  Time: O(N)
  Space: O(1)
*/

private int getValue1(char ch) {
  switch (ch) {
    case 'M': return 1000;
    case 'D': return 500;
    case 'C': return 100;
    case 'L': return 50;
    case 'X': return 10;
    case 'V': return 5;
    case 'I': return 1;
    default: return 0;
  }
}

private int getValue2(char x, char y) {
  if (x == 'C' && y == 'M') return 900;
  else if (x == 'C' && y == 'D') return 400;
  else if (x == 'X' && y == 'C') return 90;
  else if (x == 'X' && y == 'L') return 40;
  else if (x == 'I' && y == 'X') return 9;
  else if (x == 'I' && y == 'V') return 4;

  return 0;
}

public int romanToInt(String s) {
  int len = s.length();
  int result = 0;
  for (int i = 0; i < len; ++i) {
    if (i == len-1) {
      result += getValue1(s.charAt(i));
      return result;
    }

    int temp = getValue2(s.charAt(i), s.charAt(i+1));
    if (temp != 0) {
      result += temp;
      ++i;
      continue;
    } else {
      result += getValue1(s.charAt(i));
    }
  }

  return result;
}
