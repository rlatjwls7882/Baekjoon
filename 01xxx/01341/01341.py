def gcd(a, b):
    while(b!=0):
        tmp = a%b
        a = b
        b = tmp
    return a

a, b = map(int, input().split())
rememberA, rememberB = a,b
totalA, totalB, YongSikA, YongSikB=0, 1, 0, 1
res = []
curPercent=1
for _ in range(61):
    curPercent*=2

    # 비율 계산
    gcdVal = gcd(b, curPercent)
    eat = b//gcdVal; # 영식이가 먹어야하는양
    a*=curPercent//gcdVal
    b*=curPercent//gcdVal
    if(a>=eat): # 영식이가 먹을 수 있는 경우는 무조건 먹음
        a-=eat
        res.append('*')
        gcdVal = gcd(YongSikB, curPercent)
        YongSikA = YongSikA*curPercent//gcdVal+YongSikB//gcdVal
        YongSikB *= curPercent//gcdVal
    else: # 영식이가 먹을 수 없는 경우 민식이 먹음
        res.append('-')

    # 모두가 먹은 양
    gcdVal = gcd(totalB, curPercent)
    totalA = totalA*curPercent//gcdVal+totalB//gcdVal
    totalB *= curPercent//gcdVal

    # 값 최소화
    gcdVal = gcd(a, b)
    a //= gcdVal
    b //= gcdVal

    gcdVal = gcd(YongSikA, YongSikB)
    YongSikA //= gcdVal
    YongSikB //= gcdVal

    gcdVal = gcd(totalA, totalB)
    totalA //= gcdVal
    totalB //= gcdVal

    # 비율이 입력값과 같은 경우
    # rememberA/rememberB == (YongSikA/YongSikB) / (totalA/totalB)
    # (YongSikA/YongSikB) * (totalB/totalA)
    gcdVal1 = gcd(YongSikB, totalB)
    gcdVal2 = gcd(YongSikA, totalA)
    tmpA = (YongSikA//gcdVal2)*(totalB//gcdVal1)
    tmpB = (totalA//gcdVal2)*(YongSikB//gcdVal1)
    if rememberA == tmpA and rememberB == tmpB:
        break
if(len(res)>60):
    print(-1)
else:
    for r in res:
        print(r, end='')