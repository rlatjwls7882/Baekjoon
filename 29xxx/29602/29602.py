import numbers

N = (int)(input())
t = list(map(int, input().split()))

idx=1
while(True):
    if idx>N:
        break

    min=99999999
    for j in range(0, N):
        if isinstance(t[j], numbers.Integral) and min>t[j]:
            min = t[j]
        
    for j in range(0, N):
        if min==t[j]:
            t[j] = [t[j], idx]
            idx+=1

for i in range(0, N):
    print(t[i][1], end=" ")