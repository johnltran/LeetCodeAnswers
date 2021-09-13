/*
  Problem 12: Integer to Roman

  Time: O(1)
  Space: O(1)
*/

public String intToRoman(int num) {
  /*
    1000 -> M         900 -> CM
    500  -> D         400 -> CD
    100  -> C         90  -> XC
    50   -> L         40  -> XL
    10   -> X         9   -> IX
    5    -> V         4   -> IV
    1    -> I
  */

  int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
  String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
  StringBuilder result = new StringBuilder();
  for (int i = 0; i < values.length; ++i) {
    while (values[i] <= num) {
      num -= values[i];
      result.append(symbols[i]);
    }
  }

  return result.toString();
}
