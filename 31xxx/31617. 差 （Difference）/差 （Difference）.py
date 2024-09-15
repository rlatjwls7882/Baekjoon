K = int(input())
N = int(input())
A = list(map(int, input().split()))
M = int(input())
B = list(map(int, input().split()))

cnt=0
for i in range(N):
    for j in range(M):
        if A[i]+K==B[j]:
            cnt+=1
print(cnt)