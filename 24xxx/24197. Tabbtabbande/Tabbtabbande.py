n, m = map(int, input().split())
list = list(map(int, input().split()))

last=1
cnt=0
for i in list:
    cnt += min((i+n-last)%n, (last+n-i)%n)
    last = i
print(cnt)