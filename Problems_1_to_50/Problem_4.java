/*
  Problem 4: Median of Two Sorted Arrays

  Time: O(log(min(M, N)))
  Space: O(1)
*/

public double findMedianSortedArrays(int[] nums1, int[] nums2) {
  int len1 = nums1.length;
  int len2 = nums2.length;
  if (len1 > len2)
    return findMedianSortedArrays(nums2, nums1);

  int lo = 0, hi = len1;
  int MIN = Integer.MIN_VALUE, MAX = Integer.MAX_VALUE;
  while (lo <= hi) {
    int div1 = (lo + hi) / 2;
    int div2 = (len1 + len2 + 1) / 2 - div1;

    int maxLeft1 = (div1 == 0) ? MIN : nums1[div1 - 1];
    int maxLeft2 = (div2 == 0) ? MIN : nums2[div2 - 1];
    int minRight1 = (div1 == len1) ? MAX : nums1[div1];
    int minRight2 = (div2 == len2) ? MAX : nums2[div2];

    if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
      if ((len1 + len2) % 2 == 0) {
        int x = Math.max(maxLeft1, maxLeft2);
        int y = Math.min(minRight1, minRight2);
        return (double) (x + y) / 2;
      }

      return (double) Math.max(maxLeft1, maxLeft2);
    } else if (maxLeft1 > minRight2) {
      hi = div1 - 1;
    } else {
      lo = div1 + 1;
    }
  }

  return 0.0;
}
