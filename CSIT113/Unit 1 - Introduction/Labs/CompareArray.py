# The following algorithm correctly checks the equality of two sequences A and B

def CompareArray(A,B,n):
    loopCount = 0
    Result = True
    while (loopCount < n) and (Result == True):
        if A[loopCount] != B[loopCount]:
            Result = False
        loopCount += 1
    return Result

print(CompareArray([3,4,7],[999,888,7],3)) # It all returns False
print(CompareArray([3,4,7,9,0],[3,4,7,9,0],3)) # It all returns True

# The following algorithm correctly checks the equality of two sequences A and B

def CompareArray1(A,B,n):
    loopCount = 0
    Result = True
    while (loopCount < n):
        if A[loopCount] != B[loopCount]:
            Result = False
        else:
            Result = True
        loopCount += 1
    return Result

print(CompareArray1([3,4,7],[999,888,7],3)) # It returns, True. Hence, wrong