n = int(input())
lastF = float(input())
minVal, maxVal = 30, 4000
for i in range(n-1):
    curF, CloserOrFurther = input().split()
    curF = float(curF)
    if lastF<curF:
        if CloserOrFurther=='closer':
            minVal = max(minVal, (lastF+curF)/2)
        else:
            maxVal = min(maxVal, (lastF+curF)/2)
    else:
        if CloserOrFurther=='closer':
            maxVal = min(maxVal, (lastF+curF)/2)
        else:
            minVal = max(minVal, (lastF+curF)/2)
    lastF=curF
print(minVal, maxVal)