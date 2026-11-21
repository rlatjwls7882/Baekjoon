r, c = map(int, input().split())

if(r==1 and c>1):
    print(0)
else:
    mod=998244353
    cnt=1
    for i in range(0, c):
        if(i==0):
            cnt=cnt*r%mod
        else:
            cnt=cnt*(r-1)%mod
    print(cnt)