t=0
while True:
    t+=1
    s = input()
    if s[0]=='-':
        break

    stk = []
    for ch in s:
        if len(stk)!=0 and stk[-1]=='{' and ch=='}':
            stk.pop()
        else:
            stk.append(ch)
    
    cnt=0
    while len(stk):
        if(stk.pop()=='{'):
            cnt+=1
        if(stk.pop()=='}'):
            cnt+=1
    print(f"{t}. {cnt}")