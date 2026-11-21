N, M = map(int, input().split())

# 첫 번째 경주 후 순위
rank1 = []
for i in range(1, N+1):
    rank1.insert(int(input())-1, i)

# 두 번째 경주 후 순위
rank2 = []
for i in range(M-1, -1, -1):
    rank2.insert(int(input())-1, rank1[i])

# print
print(rank2[0])
print(rank2[1])
print(rank2[2])