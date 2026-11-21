n = input()

Champernowne = True
for i in range(1, len(n)):
    if n[0]!='1':
        Champernowne=False
    elif int(n[i-1])+1!=int(n[i]):
        Champernowne=False

if Champernowne:
    print(len(n))
else:
    print('-1')