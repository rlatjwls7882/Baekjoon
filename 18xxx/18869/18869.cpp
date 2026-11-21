#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M, N; cin >> M >> N;
    vector<vector<int>> v(M, vector<int>(N));
    for(int i=0;i<M;i++) {
        vector<pair<int, int>> a; 
        for(int j=0;j<N;j++) {
            int tmp; cin >> tmp;
            a.push_back(make_pair(tmp, j));
        }
        sort(a.begin(), a.end());
        int rank=0;
        for(int j=0;j<N;j++) {
            if(j>0 && a[j-1].first!=a[j].first) rank++;
            v[i][a[j].second]=rank;
        }
    }
    sort(v.begin(), v.end());

    int cnt=0;
    for(int i=0;i<M;i++) {
        for(int j=i+1;j<M;j++) {
            bool chk=true;
            for(int k=0;k<N;k++) {
                if(v[i][k]!=v[j][k]) {
                    chk=false;
                    break;
                }
            }
            if(chk) cnt++;
            else break;
        }
    }
    cout << cnt;
}