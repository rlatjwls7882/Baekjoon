#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    vector<vector<int>> parent = vector<vector<int>>(N+1);
    for(int i=1;i<=N;i++) {
        int m, d; cin >> m >> d;
        parent[i].push_back(m);
        parent[i].push_back(d);
    }

    bool chk[N+1] = {true, false, };
    int M; cin >> M;
    while(M-->0) {
        int die; cin >> die;
        chk[die]=true;
    }

    int cnt=0;
    for(int i=1;i<=N;i++) {
        if(chk[i] || chk[parent[i][0]] || chk[parent[i][1]]) {
            continue;
        }
        cnt++;
    }
    cout << cnt;
}