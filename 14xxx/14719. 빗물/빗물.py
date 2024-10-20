H, W = map(int, input().split())
blocks = list(map(int, input().split()))

total=0
for i in range(W):
    leftMax=0
    for j in range(0, i):
        leftMax = max(leftMax, blocks[j])
    rightMax=0
    for j in range(i+1, W):
        rightMax = max(rightMax, blocks[j])
    total += max(0, min(leftMax, rightMax) - blocks[i])
print(total)