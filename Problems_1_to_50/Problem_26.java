/*
  Problem 26: Remove Duplicates From Sorted Array

  Time: O(N)
  Space: O(1)
*/

public int removeDuplicates(int[] nums) {
  int len = nums.length;
  if (len == 0) return 0;
  int i = 0;
  for (int j = 1; j < len; ++j) {
    if (nums[i] != nums[j]) {
      ++i;
      nums[i] = nums[j];
    }
  }

  return i + 1; 
}
