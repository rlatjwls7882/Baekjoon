n = int(input())
last = list(map(int, input().split()))

for _ in range(n-1):
    cur = list(map(int, input().split()))
    if last[0]>cur[0] or last[1]>cur[1]:
        print("no")
        exit()
    last = cur
print("yes")