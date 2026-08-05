# LeetCode 35 - Search Insert Position

## Approach

- Initialize two pointers: `start` and `end`.
- Find the middle element using `mid = start + (end - start) / 2`.
- If the middle element is the target, return its index.
- If the target is greater than the middle element, search the right half.
- Otherwise, search the left half.
- If the target is not found, `start` will be the correct position to insert it.
- Return `start`.
