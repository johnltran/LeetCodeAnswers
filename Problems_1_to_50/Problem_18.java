/*
  Problem 18: 4Sum

  Time: O(N^3)
  Space: O(1)
*/

public List<List<Integer>> fourSum(int[] nums, int target) {
  int len = nums.length;
  List<List<Integer>> result = new ArrayList<>();
  if (len < 4) return result;

  Arrays.sort(nums);

  for (int i = 0; i < len; ++i) {
    // check for duplicates
    if (i > 0 && nums[i] == nums[i-1]) continue;

    for (int j = i + 1; j < len; ++j) {
      // check for duplicates
      if (j > i + 1 && nums[j] == nums[j-1]) continue;

      int left = j + 1;
      int right = len - 1;
      while (left < right) {
        int sum = nums[i] + nums[j] + nums[left] + nums[right];
        if (sum < target) ++left;
        else if (sum > target) --right;
        else {
          result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

          // check for duplicates
          while (left + 1 < len && nums[left] == nums[left+1])
            ++left;
          while (right - 1 >= 0 && nums[right] == nums[right-1])
            --right;

          ++left;
          --right;
        }
      }
    }
  }
  return result; 
}
