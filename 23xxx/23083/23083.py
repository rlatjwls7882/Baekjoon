N, M = map(int, input().split())

# 구멍
hole = [[False for _ in range(M)] for _ in range(N)]
K = int(input())
for _ in range(K):
    x, y = map(int, input().split())
    hole[x-1][y-1] = True

# dp 수행
dp = [[0 for _ in range(M)] for _ in range(N)]
dp[0][0]=1

for j in range(M):
    for i in range(N):
        # 공통
        dp[i][j] %= 1_000_000_007
        if i+1<N and not hole[i+1][j]:
            dp[i+1][j] += dp[i][j]
        if j+1<M and not hole[i][j+1]:
            dp[i][j+1] += dp[i][j]

        # 홀수번째 열
        if j%2==0:
            if i-1>=0 and j+1<M and not hole[i-1][j+1]:
                dp[i-1][j+1] += dp[i][j]

        # 짝수번째 열
        else:
            if i+1<N and j+1<M and not hole[i+1][j+1]:
                dp[i+1][j+1] += dp[i][j]
print(dp[N-1][M-1])