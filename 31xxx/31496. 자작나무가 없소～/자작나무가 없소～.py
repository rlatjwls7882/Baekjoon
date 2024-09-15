N, S = input().split()

N = int(N)
sum=0
for i in range(0, N):
    name, cnt = input().split()
    name = name.split('_')
    if S in name:
        sum += int(cnt)
print(sum)