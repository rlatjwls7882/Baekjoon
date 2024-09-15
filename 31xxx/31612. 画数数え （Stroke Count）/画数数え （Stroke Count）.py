N = int(input())
S = input()

cnt=0
for i in range(N):
    if(S[i]=='o'):
        cnt+=1
    else:
        cnt+=2
print(cnt)