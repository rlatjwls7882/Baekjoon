#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, D, K; cin >> N >> D >> K;
    
    int maxS=0;
    for(int i=0;i<N;i++) {
        int s; cin >> s;
        maxS = max(maxS, s);
    }
    
    int clearCnt=0, cur=0;
    while(D--) {
        if(cur+maxS>K) {
            clearCnt++;
            cur=0;
        }
        cur += maxS;
    }
    cout << clearCnt;
}