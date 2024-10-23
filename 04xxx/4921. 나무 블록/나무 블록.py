caseNum=0
while True:
    # input
    s = input()
    if s=='0':
        break
    caseNum+=1
    print(f"{caseNum}. ", end='')

    # 블럭이 잘 조립되는지 확인
    isValid=True
    if s[0]!='1' or s[-1]!='2':
        isValid=False
    for i in range(1, len(s)):
        if s[i]=='1' or s[i-1]=='2' or ((s[i-1]=='1' or s[i-1]=='3') and (s[i]!='4' and s[i]!='5')) or ((s[i-1]=='4' or s[i-1]=='6') and (s[i]!='2' and s[i]!='3')) or ((s[i-1]=='5' or s[i-1]=='7') and s[i]!='8') or (s[i-1]=='8' and (s[i]!='6' and s[i]!='7')):
            isValid=False

    # print
    if isValid:
        print("VALID")
    else:
        print("NOT")