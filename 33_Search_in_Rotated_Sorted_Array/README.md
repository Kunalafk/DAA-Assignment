# LeetCode 33 - Search in Rotated Sorted Array

## Approach

- Initialize two pointers: `start` and `end`.
- Find the middle element using Binary Search.
- Check which half of the array is sorted.
- If the target lies in the sorted half, search that half.
- Otherwise, search the other half.
- Repeat until the target is found or the search space becomes empty.
- Return `-1` if the target is not found.
