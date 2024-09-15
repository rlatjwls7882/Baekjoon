map = []
for i in range(10):
    map.append(input().split())

check = False
for i in range(10):
    cnt1=0
    for j in range(10):
        if map[i][0]==map[i][j]:
            cnt1+=1
    cnt2=0
    for j in range(10):
        if map[0][i]==map[j][i]:
            cnt2+=1
    
    if cnt1==10 or cnt2==10:
        check=True
        break

if check:
    print(1)
else:
    print(0)