# LeetCode 88 - Merge Sorted Array

## Approach

- Start from the last valid element of both arrays.
- Compare the last elements of both arrays.
- Place the larger element at the end of `nums1`.
- Move the corresponding pointer one step back.
- Repeat until one array is exhausted.
- If any elements remain in `nums2`, copy them into `nums1`.
