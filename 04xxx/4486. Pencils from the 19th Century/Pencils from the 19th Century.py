for n in range(1, 32):
    nn = (int)(input())
    if(nn==0):
        break

    print("Case ",n,":", sep="")
    print(nn," pencils for ",nn," cents", sep="")

    chk=True
    i=j=1
    k=2
    while True:
        if(i*4>nn):
            break
        while True:
            if i*4+j/2>nn or i+j+k>nn:
                break
            while True:
                if i*4+j/2+k/4>nn or i+j+k>nn:
                    break
                elif i*4+j/2+k/4==nn and i+j+k==nn:
                    print(i," at four cents each", sep="")
                    print(j," at two for a penny", sep="")
                    print(k," at four for a penny\n", sep="")
                    chk=False
                    break
                k+=2
            k=2
            j+=1
        j=1
        i+=1
    
    if chk:
        print("No solution found.\n")