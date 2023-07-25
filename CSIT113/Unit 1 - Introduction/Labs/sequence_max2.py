# Find the max value in an sequence s of n numbers using a for loop

s = [-3,20,450,89,90]

def sequence_max2(n):
    large = n[0]
    for i in range(len(n)):
        if n[i] > large:
            large = n[i]
    return large

print(sequence_max2(s))