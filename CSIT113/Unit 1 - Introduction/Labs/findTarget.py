# What is the value returned by findTarget([3, 15, 7, 2], 4)?

def findTarget(s, key):
    EleFound = s[0]
    for i in range(key):
        if s[i] > EleFound:
            EleFound = s[i]
        return EleFound # This return closes the function and returns the first value 3. Which is not correct.

print(findTarget([3, 15, 7, 2], 4))

# What is the value returned by findTarget([3, 15, 7, 2], 4)?

def findTarget1(s, key):
    EleFound = s[0]
    for i in range(key):
        if s[i] > EleFound:
            EleFound = s[i]
    return EleFound # This return closes the function and returns the last value 15. Which is correct.

print(findTarget1([3, 15, 7, 2], 4))