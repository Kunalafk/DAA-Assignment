# LeetCode 53 - Maximum Subarray

## Approach

- Initialize `currentSum` and `maxSum`.
- Traverse the array from left to right.
- At each element, decide whether to start a new subarray or extend the current one.
- Update the current sum using the maximum of the current element and the current sum plus the element.
- Keep updating the maximum sum found so far.
- Return the maximum sum at the end.
