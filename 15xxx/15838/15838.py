t=0
while True:
    t+=1
    N = int(input())
    if(N==0):
        break
    
    total = [0, 0, 0, 0]
    for _ in range(N):
        li = list(map(int, input().split()))
        for i in range(4):
            total[i] += li[i]
    print(f"Case #{t}: RM{total[0]*0.8-total[0]/85*7.5 + total[1]-total[1]/85*24 + total[2]*1.2-total[2]/85*32 - (total[0]+total[1]+total[2])/85*8 + total[3]*0.6:.2f}")