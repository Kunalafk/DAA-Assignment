# LeetCode 74 - Search a 2D Matrix

## Approach

- Treat the 2D matrix as a single sorted array.
- Initialize two pointers: `start` and `end`.
- Find the middle element using Binary Search.
- Convert the middle index into row and column using division and modulus.
- If the middle element is the target, return `true`.
- If the target is greater, search the right half.
- Otherwise, search the left half.
- Return `false` if the target is not found.
