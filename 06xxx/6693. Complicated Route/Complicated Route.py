import re
import math

while(True):
    step = re.split('[,.]', input())
    if step[0]=='END':
        break
    
    x=y=0
    for i in step:
        if 'NW' in i:
            x -= math.sqrt(float(i[0:len(i)-2])**2/2)
            y += math.sqrt(float(i[0:len(i)-2])**2/2)
        elif 'NE' in i:
            x += math.sqrt(float(i[0:len(i)-2])**2/2)
            y += math.sqrt(float(i[0:len(i)-2])**2/2)
        elif 'SW' in i:
            x -= math.sqrt(float(i[0:len(i)-2])**2/2)
            y -= math.sqrt(float(i[0:len(i)-2])**2/2)
        elif 'SE' in i:
            x += math.sqrt(float(i[0:len(i)-2])**2/2)
            y -= math.sqrt(float(i[0:len(i)-2])**2/2)
        elif 'N' in i:
            y += float(i[0:len(i)-1])
        elif 'S' in i:
            y -= float(i[0:len(i)-1])
        elif 'E' in i:
            x += float(i[0:len(i)-1])
        elif 'W' in i:
            x -= float(i[0:len(i)-1])
    print('You can go to (%.03f,%.03f), the distance is %.03f steps.' %(x, y, math.sqrt(x**2+y**2)))