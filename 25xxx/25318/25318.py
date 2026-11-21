import datetime

l = [] # 난이도 의견
t = [] # 시간
p = [] # 가중치

# 날짜와 난이도 의견 파싱
N = int(input())
for _ in range(N):
    str = input()
    dt = datetime.datetime.strptime(str[:18], "%Y/%m/%d %H:%M:%S")
    l.append(int(str[20:]))
    t.append(dt)

# 가중치 계산
for i in range(N):
    p.append(max(0.5**((t[N-1]-t[i])/datetime.timedelta(days=365)), 0.9**(N-i-1)))

# 난이도 계산
X=0
for i in range(N):
    X += (p[i]*l[i])/sum(p)
print(round(X))