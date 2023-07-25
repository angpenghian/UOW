# Example: find the largest element in an sequence

A = [9,10,25,34,6]

def sequenceMax(n):
    max = n[0]
    for i in n:
        if i > max:
            max = i
    return max

print(sequenceMax(A))