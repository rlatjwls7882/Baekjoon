#include<bits/stdc++.h>
using namespace std;

bool chk[100][100] = {false, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int rank[N];
    for(int i=0;i<N;i++) {
        int r; cin >> r;
        rank[r-1]=i;
    }

    for(int i=0;i<N;i++) {
        int m; cin >> m;
        while(m-->0) {
            int k; cin >> k;
            chk[i][k-1]=true;
        }
    }

    int Q; cin >> Q;
    while(Q-->0) {
        int k; cin >> k;
        bool cnt=false;
        for(int i=0;i<N;i++) {
            if(chk[rank[i]][k-1]) {
                cout << rank[i]+1 << ' ';
                cnt=true;
            }
        }
        if(!cnt) cout << -1;
        cout << '\n';
    }
}