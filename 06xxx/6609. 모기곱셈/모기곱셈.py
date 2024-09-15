while True:
    try:
        M, P, L, E, R, S, N = map(int, input().split())
        for i in range(N):
            nextL = M*E
            nextP = L//R
            nextM = P//S
            L=nextL
            P=nextP
            M=nextM
        print(M)
    except:
        break