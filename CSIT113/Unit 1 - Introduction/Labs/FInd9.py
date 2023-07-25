# What is the value returned by Find9([15, 3, 7, 9], 4)?

def Find9(s, key):
    EleFound = s[0]
    for i in range(key):
        if s[i] < EleFound:
            EleFound = s[i]
    return EleFound # This return closes the function and returns the last value 3. Which is correct.

print(Find9([15, 3, 7, 9], 4))