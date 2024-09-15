#include<bits/stdc++.h>
using namespace std;

int m[5002][5002] = {0, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    while(M-->0) {
        int a, b, c; cin >> a >> b >> c;
        m[a-1][b-1]++;
        m[a-1][b]--;
        m[a+c][b-1]--;
        m[a+c][b+c+1]++;
        m[a+c+1][b]++;
        m[a+c+1][b+c+1]--;
    }

    // 오른쪽
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            m[i][j+1] += m[i][j];
        }
    }

    // 아래
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            m[i+1][j] += m[i][j];
        }
    }

    // 오른쪽 아래
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            m[i+1][j+1] += m[i][j];
        }
    }

    int cnt=0;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(m[i][j]) cnt++;
        }
    }
    cout << cnt;
}