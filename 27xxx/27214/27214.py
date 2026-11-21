k = int(input())
w = int(input())
h = int(input())
t = int(input())

for i in range(h*k+t*(h+1)):
    for j in range(w*k+t*(w+1)):
        if i%(t+k)<t or j%(t+k)<t:
            print('*', end='')
        else:
            print('.', end='')
    print()