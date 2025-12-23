t = int(input())
for _ in range(t):
    x = input()
    s = input()
    print("!" if "!" in s or eval(s)>=10 else eval(s));