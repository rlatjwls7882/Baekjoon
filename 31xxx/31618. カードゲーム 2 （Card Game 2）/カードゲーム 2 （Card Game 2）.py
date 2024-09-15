N = int(input())
A = list(map(int, input().split()))

card = [False]*200001
for i in range(N):
    card[A[i]]=True

check=False
for i in range(1, 199_995):
    if card[i] and card[i+3] and card[i+6]:
        check=True
        break

if(check):
    print("Yes")
else:
    print("No")