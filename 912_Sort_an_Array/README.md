# LeetCode 912 - Sort an Array

## Approach

- Use Merge Sort to sort the array.
- Divide the array into two halves until each part has one element.
- Sort both halves recursively.
- Merge the two sorted halves by comparing their elements.
- Copy the merged elements back into the original array.
- Repeat until the entire array is sorted.
- Return the sorted array.
