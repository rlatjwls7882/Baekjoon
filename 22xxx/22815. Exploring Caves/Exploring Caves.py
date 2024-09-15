N = int(input())

while N>0:
    maxDist=maxX=maxY=x=y=0

    while True:
        dx, dy = map(int, input().split())
        if dx==0 and dy==0:
            break
        x += dx
        y += dy
        dist = x**2+y**2
        if dist>maxDist or dist==maxDist and x>maxX:
            maxDist=dist
            maxX=x
            maxY=y
    print(maxX, maxY)
    N-=1