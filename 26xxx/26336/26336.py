t = int(input())
for _ in range(t):
    a, b, c = map(int, input().split())
    print(a, b, c)
    stopCnt=0
    for i in range(1, a):
        if i%b==0 or i%c==0:
            stopCnt+=1
    print(stopCnt)