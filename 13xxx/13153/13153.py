import math

pos = []
for i in range(3):
    x, y = map(int, input().split())
    pos.append([x, y])
r = float(input())

a = math.sqrt((pos[0][0]-pos[1][0])**2+(pos[0][1]-pos[1][1])**2)
b = math.sqrt((pos[1][0]-pos[2][0])**2+(pos[1][1]-pos[2][1])**2)
c = math.sqrt((pos[2][0]-pos[0][0])**2+(pos[2][1]-pos[0][1])**2)

calcedR = 1/2*math.sqrt(4*a*a*b*b-(a*a+b*b-c*c)**2)/(a+b+c)

if calcedR>r:
    print((calcedR-r)/r*100)
else:
    print("-%f" %((r-calcedR)/r*100))