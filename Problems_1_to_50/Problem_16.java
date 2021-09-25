/*
  Problem 16: 3Sum Closest

  Time: O(N^2)
  Space: O(1)
*/

public int threeSumClosest(int[] nums, int target) {
  int len = nums.length;
  if (len < 3) return 0;

  Arrays.sort(nums);

  int dist = Integer.MAX_VALUE;
  int closestSum = 0;
  for (int i = 0; i < len; ++i) {
    int left = i + 1;
    int right = len - 1;
    while (left < right) {
      int sum = nums[i] + nums[left] + nums[right];
      if (Math.abs(target - sum) < dist) {
        dist = Math.abs(target - sum);
        closestSum = sum;
      }

      if (sum < target) ++left;
      else if (sum > target) --right;
      else return closestSum;
    }
  }

  return closestSum;
}
