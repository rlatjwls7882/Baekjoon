#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    string m[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    if(N<3) {
        cout << 0;
        return 0;
    }

    int cnt=0;
    for(int i=0;i<N-2;i++) {
        if(m[0][i]>='1') {
            cnt++;
            m[0][i]--; m[0][i+1]--; m[0][i+2]--;
            m[1][i]--;              m[1][i+2]--;
            m[2][i]--; m[2][i+1]--; m[2][i+2]--;
        }
    }
    for(int i=0;i<N-2;i++) {
        if(m[i][N-1]>='1') {
            cnt++;
            m[i][N-3]--;   m[i][N-2]--;   m[i][N-1]--;
            m[i+1][N-3]--;                m[i+1][N-1]--;
            m[i+2][N-3]--; m[i+2][N-2]--; m[i+2][N-1]--;
        }
    }
    for(int i=0;i<N-2;i++) {
        if(m[N-1][N-1-i]>='1') {
            cnt++;
            m[N-3][N-3-i]--; m[N-3][N-2-i]--; m[N-3][N-1-i]--;
            m[N-2][N-3-i]--;                  m[N-2][N-1-i]--;
            m[N-1][N-3-i]--; m[N-1][N-2-i]--; m[N-1][N-1-i]--;
        }
    }
    for(int i=0;i<N-2;i++) {
        if(m[N-1-i][0]>='1') {
            cnt++;
            m[N-3-i][0]--; m[N-3-i][1]--; m[N-3-i][2]--;
            m[N-2-i][0]--;                m[N-2-i][2]--;
            m[N-1-i][0]--; m[N-1-i][1]--; m[N-1-i][2]--;
        }
    }
    cout << cnt+(max(N-4, 0)*max(N-4, 0));
}