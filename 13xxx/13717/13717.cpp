#include<bits/stdc++.h>
using namespace std;


int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    string name;
    int maxCnt=-1, cntSum=0;
    while(N-->0) {
        string P; cin >> P;
        int K, M; cin >> K >> M;
        int curCnt=0;
        while(M>=K) {
            int cur = M/K;
            curCnt += cur;
            M = M-cur*K+2*cur;
        }

        if(curCnt>maxCnt) {
            maxCnt=curCnt;
            name=P;
        }
        cntSum += curCnt;
    }
    cout << cntSum << '\n' << name;
}