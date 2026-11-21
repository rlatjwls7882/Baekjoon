#include<bits/stdc++.h>
using namespace std;


int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, W; cin >> N >> W;

    vector<vector<int>> conn(N+1);
    for(int i=0;i<N-1;i++) {
        int U, V; cin >> U >> V;
        conn[U].push_back(V);
        conn[V].push_back(U);
    }

    double leafCnt=0;
    for(int i=2;i<=N;i++) {
        if(conn[i].size()==1) leafCnt++;
    }
    cout << setprecision(4) << fixed << W/leafCnt;
}