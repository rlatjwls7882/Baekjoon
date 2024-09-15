#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    string m[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    vector<pair<int, int>> v;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(m[i][j]=='.' && ((j==0 || m[i][j-1]=='#') && j+2<M && m[i][j+1]=='.' && m[i][j+2]=='.' || (i==0 || m[i-1][j]=='#') && i+2<N && m[i+1][j]=='.' && m[i+2][j]=='.')) {
                v.push_back(make_pair(i+1, j+1));
            }
        }
    }

    cout << v.size() << '\n';
    for(auto p:v) {
        cout << p.first << ' ' << p.second << '\n';
    }
}