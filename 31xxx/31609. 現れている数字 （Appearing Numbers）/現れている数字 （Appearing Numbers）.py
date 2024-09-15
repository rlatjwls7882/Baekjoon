N = int(input())
A = list(map(int, input().split()))

check = [False]*10
for i in range(N):
    check[A[i]]=True

for i in range(10):
    if check[i]:
        print(i)