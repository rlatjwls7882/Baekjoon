T = int(input())
finished = False # res값을 찾았는지 여부
S = "" # 입력된 문자열
res = [0 for _ in range(9)] # 결과값
seed = [0 for _ in range(9)] # seed값
iToIdx = [0 for _ in range(9)] # 문자가 빙고판에서 어디에 위치하는지
Map = ["" for _ in range(3)] # 빙고판
visited = [False for _ in range(9)] # 방문 확인 리스트

# 문자가 빙고판에서 어디에 위치하는지 확인
def findIdx(val):
    for i in range(3):
        for j in range(3):
            if Map[i][j] == val:
                return i*3+j

# 현재 몇 빙고인지 확인
def chkCnt():
    cnt=0
    for i in range(3):
        if visited[3*i] and visited[3*i+1] and visited[3*i+2]:
            cnt+=1
        if visited[i] and visited[i+3] and visited[i+6]:
            cnt+=1
    if visited[0] and visited[4] and visited[8]:
        cnt+=1
    if visited[2] and visited[4] and visited[6]:
        cnt+=1
    return cnt

# 백트래킹
def back(depth, beforeCnt):
    global res, finished

    # depth가 9가 되는 경우 결과를 찾은 것
    if depth==9:
        finished=True
        return

    # 현재 seed가 일치할때만 다음으로 이동
    for i in range(9):
        if finished:
            return
        if not visited[iToIdx[i]]:
            visited[iToIdx[i]]=True
            curCnt = chkCnt()
            if curCnt-beforeCnt == seed[depth]:
                res[depth] = S[i]
                back(depth+1, curCnt)
            visited[iToIdx[i]]=False
    return

for _ in range(T):
    S = input()
    for i in range(3):
        Map[i] = input()

    # S의 시드 계산
    lastCnt=0
    for i in range(9):
        visited[findIdx(S[i])]=True
        curCnt = chkCnt()
        seed[i] = curCnt-lastCnt
        lastCnt=curCnt
    
    # S를 정렬하여 가장 먼저 나오는 결과 선택
    S = sorted(S)
    for i in range(9):
        iToIdx[i] = findIdx(S[i])

    # 초기화
    visited = [False for _ in range(9)]
    finished = False

    # 백트래킹
    back(0, 0)

    for seedVal in seed:
        print(seedVal, end='')
    print(end=' ')
    for resVal in res:
        print(resVal, end='')
    print()