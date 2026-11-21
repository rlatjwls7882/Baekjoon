#include<bits/stdc++.h>

using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    char s[N][M];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cin >> s[i][j];
        }
    }

    int cnt=N*M;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(i-1>=0 && s[i-1][j]=='|' && s[i][j]=='|' || j-1>=0 && s[i][j-1]=='-' && s[i][j]=='-') {
                cnt--;
            }
        }
    }
    cout << cnt;
}