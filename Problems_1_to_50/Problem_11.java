/*
  Problem 11: Contain With Most Water

  Time: O(N)
  Space: O(1)
*/

public int maxArea(int[] height) {
  int left = 0, right = height.length - 1;
  int area = 0;
  while (left < right) {
    int curArea = (right - left) * Math.min(height[left], height[right]);
    area = Math.max(area, curArea);

    if (height[left] < height[right])
      ++left;
    else
      --right;
  }

  return area;
}
