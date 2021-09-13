/*
  Problem 9: Palindrome Number

  Time: O(log N)
  Space: O(1)
*/

public boolean isPalindome(int x) {
  if (x == 0) return true;
  if (x < 0 || x % 10 == 0) return false;

  int half = 0;
  while (x > half) {
    half = half * 10 + (x % 10);
    x /= 10;
  }

  // after the loop, half >= x
  return x == half || x == half/10; 
}
