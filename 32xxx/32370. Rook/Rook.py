Ax, Ay = map(int, input().split())
Bx, By = map(int, input().split())
if Ax==0 or Ay==0:
    if 0<Bx and Bx<Ax or 0<By and By<Ay:
        print(3)
    else:
        print(1)
else:
    print(2)