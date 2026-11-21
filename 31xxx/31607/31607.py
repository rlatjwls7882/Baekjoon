num = []
num.append(int(input()))
num.append(int(input()))
num.append(int(input()))
num = sorted(num)

if num[0] + num[1] == num[2]:
    print(1)
else:
    print(0)