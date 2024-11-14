N = int(input())
P = []
for _ in range(N):
    P.append(int(input()))

print(max(min(P) - max(P)//2, 0))