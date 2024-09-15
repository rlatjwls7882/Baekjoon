n = (int)(input())

robot1 = input()
robot2 = input()
for i in range(0, n):
    if robot1[i]=='R' and robot2[i]=='S' or robot1[i]=='S' and robot2[i]=='R' or robot1[i]=='S' and robot2[i]=='S':
        print('R', end="")
    elif robot1[i]=='P' and robot2[i]=='S' or robot1[i]=='S' and robot2[i]=='P' or robot1[i]=='P' and robot2[i]=='P':
        print('S', end="")
    else:
        print('P', end="")