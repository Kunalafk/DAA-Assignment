# LeetCode 704 - Binary Search

1. Initialize two pointers: `start` and `end`.
2. Find the middle element using `mid = start + (end - start) / 2`.
3. If the middle element is the target, return its index.
4. If the target is greater than the middle element, search the right half.
5. Otherwise, search the left half.
6. Repeat until the target is found or the search space becomes empty.

