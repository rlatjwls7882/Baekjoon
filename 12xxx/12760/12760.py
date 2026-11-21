N, M = map(int, input().split())

score = [0 for _ in range(N)]
cards = [list(map(int, input().split())) for _ in range(N)]
for i in range(N):
    cards[i].sort(reverse=True)

for i in range(M):
    maxVal=0
    for j in range(N):
        maxVal = max(maxVal, cards[j][i])
    for j in range(N):
        if cards[j][i]==maxVal:
            score[j]+=1

maxScore = max(score)
for i in range(N):
    if score[i] == maxScore:
        print(i+1, end=' ')