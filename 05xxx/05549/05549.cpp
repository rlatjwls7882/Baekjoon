#include<bits/stdc++.h>
using namespace std;

int JOI[1001][1001][3];
string s[1000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, M, K; cin >> N >> M >> K;
    for(int i=0;i<N;i++) cin >> s[i];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            for(int k=0;k<3;k++) {
                JOI[i+1][j+1][k] = JOI[i][j+1][k]+JOI[i+1][j][k]-JOI[i][j][k];
                if("JOI"[k]==s[i][j]) {
                    JOI[i+1][j+1][k]++;
                }
            }
        }
    }

    while(K-->0) {
        int a, b, c, d; cin >> a >> b >> c >> d;
        for(int i=0;i<3;i++) cout << JOI[c][d][i] - JOI[a-1][d][i] - JOI[c][b-1][i] + JOI[a-1][b-1][i] << ' ';
        cout << '\n';
    }
}