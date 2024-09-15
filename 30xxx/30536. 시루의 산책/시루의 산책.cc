#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int pos[N][2];
    for(int i=0;i<N;i++) cin >> pos[i][0] >> pos[i][1];

    int P[M];
    for(int i=0;i<M;i++) cin >> P[i];

    int R[M+1];
    for(int i=0;i<=M;i++) cin >> R[i];

    int type[N] = {0, };
    for(int i=0;i<M;i++) {
        for(int next=0;next<N;next++) {
            if(pow(pos[P[i]-1][0]-pos[next][0], 2)+pow(pos[P[i]-1][1]-pos[next][1], 2)<=R[i+1]*R[i+1]) {
                type[next]=1;
            }
        }
    }

    int maxCnt=0;
    for(int i=0;i<N;i++) {
        if(type[i]==0) {
            queue<int> q; q.push(i);
            int cnt=1;
            type[i]=2;
            while(!q.empty()) {
                int cur = q.front(); q.pop();
                for(int next=0;next<N;next++) {
                    if(type[next]!=2 && pow(pos[cur][0]-pos[next][0], 2)+pow(pos[cur][1]-pos[next][1], 2)<=R[0]*R[0]) {
                        type[next]=2;
                        q.push(next);
                        cnt++;
                    }
                }
            }
            maxCnt = max(maxCnt, cnt);
        }
    }
    cout << maxCnt;
}