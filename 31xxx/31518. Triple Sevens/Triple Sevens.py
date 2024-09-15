n = (int)(input())

cnt=0
for i in range(0, 3):
    if '7' in input().split():
        cnt+=1

if cnt==3:
    print('777')
else:
    print('0')