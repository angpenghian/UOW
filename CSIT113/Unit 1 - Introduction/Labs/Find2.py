# What is the value returned by Find2([2, 10, 6, 8], 4)? 

def Find2(s,n):
    EleFound = s[0]
    for i in range(n):
        if s[i] > EleFound:
            EleFound = i
    return EleFound

print(Find2([2, 10, 6, 8], 4))