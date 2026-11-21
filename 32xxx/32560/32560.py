list1 = [0 for _ in range(26)]
list2 = [0 for _ in range(26)]

for ch in input():
    list1[ord(ch)-ord('a')]+=1
for ch in input():
    list2[ord(ch)-ord('a')]+=1

for i in range(26):
    for j in range(max(list1[i], list2[i])):
        print(chr(97+i), end='')