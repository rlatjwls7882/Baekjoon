L = int(input())
score = list(map(int, input().split()))

maxSum, maxD = 0, 0
for d in range(1, L+1):
    sum=0
    for i in range(d-1, L, d):
        sum += score[i]
    if maxSum<sum:
        maxSum=sum
        maxD=d
print(maxD, maxSum)