#include<bits/stdc++.h>
using namespace std;

int N, M, minCnt=11;
int chk[10] = {0, };
vector<vector<int>> canSolve(10);

void back(int depth, int start) {
    bool finish=true;
    for(int i=0;i<N;i++) {
        if(!chk[i]) {
            finish=false;
            break;
        }
    }
    if(finish) {
        minCnt = min(minCnt, depth);
        return;
    }

    while(start<M) {
        for(int solve:canSolve[start]) {
            chk[solve]++;
        }
        back(depth+1, start+1);
        for(int solve:canSolve[start]) {
            chk[solve]--;
        }
        start++;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> M;
    for(int i=0;i<M;i++) {
        int cnt; cin >> cnt;
        while(cnt-->0) {
            int tmp; cin >> tmp;
            canSolve[i].push_back(tmp-1);
        }
    }
    back(0, 0);
    if(minCnt==11) cout << -1;
    else cout << minCnt;
}