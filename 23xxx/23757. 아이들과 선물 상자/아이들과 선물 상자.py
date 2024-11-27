from queue import PriorityQueue

N, M = map(int, input().split())
pq = PriorityQueue()

present = list(map(int, input().split()))
for e in present:
    pq.put(-e)

w = list(map(int, input().split()))
for want in w:
    top = -pq.get()
    if top<want:
        print(0)
        exit()
    if top-want>0:
        pq.put(-(top-want))
print(1)