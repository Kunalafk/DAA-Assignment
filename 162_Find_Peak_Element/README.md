# LeetCode 162 - Find Peak Element

## Approach

- Initialize two pointers: `low` and `high`.
- Find the middle element using Binary Search.
- Compare the middle element with its next element.
- If the next element is greater, move to the right half.
- Otherwise, move to the left half including the middle element.
- Repeat until `low` and `high` point to the same index.
- Return that index as the peak element.
