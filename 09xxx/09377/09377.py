while True:
    n = (int)(input())
    if n==0:
        break

    strings=[]
    for i in range(n):
        strings.append(input())

    step=0
    while True:
        chk=False
        for i in range(n):
            if strings[i] in strings[0:i] or strings[i] in strings[i+1:n]:
                chk=True
                break

        if "" in strings or chk:
            print(step-1)
            break

        for i in range(n):
            strings[i] = strings[i][1:]
        step+=1