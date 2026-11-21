var n = Int(readLine()!)!

var cnt=0
while n > 1 {
    n = n%2==1 ? n*3+1 : n/2
    cnt += 1
}
print(cnt)