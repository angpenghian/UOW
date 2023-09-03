def max_index_divide_and_conquer(arr, start, end):
    # Base case: If there's only one element in the portion, return its index.
    if start == end:
        return start

    # Divide the portion into two halves.
    mid = (start + end) // 2

    # Recursively find the indices of the largest elements in both halves.
    left_index = max_index_divide_and_conquer(arr, start, mid)
    right_index = max_index_divide_and_conquer(arr, mid + 1, end)

    # Compare the largest elements from both halves and return the index of the largest.
    if arr[left_index] >= arr[right_index]:
        return left_index
    else:
        return right_index

# Function to find the index of the largest element in an array.
def find_max_index(arr):
    if not arr:
        return None  # Handle empty array case.

    return max_index_divide_and_conquer(arr, 0, len(arr) - 1)

# Example usage:
arr = [5, 2, 9, 1, 5, 6]
largest_index = find_max_index(arr)
print(f"The largest element is {arr[largest_index]} at index {largest_index}")