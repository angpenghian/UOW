# Find the max value in an sequence s of n numbers using a while loop

s = [-3,20,450,89,90]

def sequence_max1(n):
    large = n[0]
    i = 1
    while i < len(n):
        if n[i] > large:
            large = n[i]
        i += 1
    return large

print(sequence_max1(s))