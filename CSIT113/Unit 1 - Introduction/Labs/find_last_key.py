# Write an algorithm that returns the index of the last occurrence of  the value key in the sequence s[0], . . , s[n-1]. If key is not in the sequence, the  algorithm returns the value 99999. 

def find_last_key(s, key):
    last = 99999
    for i in range(len(s)):
        if s[i] == key:
            last = i
        else:
            last = last
    return last

print(find_last_key([1,2,3,4,5,6,7,8,9,10], 5))