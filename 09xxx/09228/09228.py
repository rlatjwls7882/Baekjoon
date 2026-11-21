while True:
    n = input()
    if(n=='#'):
        break

    length = len(n)
    sum=0
    for i in range(0, length):
        sum += int(n[i])*(length-i+1)
    
    print(n+' -> ', end='')
    if 11-sum%11==10:
        print('Rejected')
    elif 11-sum%11==11:
        print('0')
    else:
        print(11-sum%11)