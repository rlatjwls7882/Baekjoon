N = int(input())
S = input()

check = True
for i in range(1, N):
    if(S[0]!=S[i]):
        check=False
        break

if(check):
    print("Yes")
else:
    print("No")