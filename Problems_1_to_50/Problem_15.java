/*
  Problem 15: 3Sum

  Time: O(N^2)
  Space: O(1)
*/

public List<List<Integer>> threeSum(int[] nums) {
  List<List<Integer>> result = new ArrayList<>();
  int len = nums.length;
  if (len < 3) return result;

  Arrays.sort(nums);

  for (int i = 0; i < len; ++i) {
    // check for duplicates
    if (i > 0 && nums[i] == nums[i-1]) continue;

    int left = i + 1;
    int right = len - 1; 
    while (left < right) {
      int sum = nums[i] + nums[left] + nums[right];
      if (sum < 0) ++left;
      else if (sum > 0) --right;
      else {
        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

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

  return result;
}
