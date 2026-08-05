# LeetCode 215 - Kth Largest Element in an Array

## Approach

- Create a min heap using a Priority Queue.
- Traverse all elements of the array.
- Insert each element into the Priority Queue.
- If the heap size becomes greater than `k`, remove the smallest element.
- After processing all elements, the heap contains the `k` largest elements.
- The smallest element in the heap is the `k`th largest element.
- Return `pq.peek()`.
