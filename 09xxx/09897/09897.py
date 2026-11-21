L, G, R = map(int, input().split())

people=[]
lanton=[0]*L
for i in range(0, G):
    people.append(input().split())
    people[i][1] = int(people[i][1])-1
    people[i][2] = int(people[i][2])

for i in range(0, R):
    move = input()
    for j in range(0, G):
        if(move==people[j][0]):
            a = people[j][1]
            d = people[j][2]
            while(a<L):
                lanton[a]+=1
                a+=d
            break

cnt=0
for i in range(0, L):
    if(lanton[i]%2==1):
        cnt+=1
print(cnt)