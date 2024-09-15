#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    string m[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    for(int i=1;i<N-1;i++) {
        bool chk=false;
        for(int j=0;j<M;j++) {
            if(m[i][j]=='#') chk=true;
            else if(m[i-1][j]=='#' && m[i+1][j]=='#') {
                if(chk) cout << "RIGHT";
                else cout << "LEFT";
                return 0;
            }
        }
    }

    for(int i=1;i<M-1;i++) {
        bool chk=false;
        for(int j=0;j<N;j++) {
            if(m[j][i]=='#') chk=true;
            else if(m[j][i-1]=='#' && m[j][i+1]=='#') {
                if(chk) cout << "DOWN";
                else cout << "UP";
                return 0;
            }
        }
    }
}