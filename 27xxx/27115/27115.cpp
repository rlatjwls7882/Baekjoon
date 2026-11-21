#include<bits/stdc++.h>
using namespace std;

int m[12004][12004] = {0, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, K; cin >> N >> M >> K;
    while(K-->0) {
        int y, x, p; cin >> y >> x >> p;
        y += 3000;
        x += 3000;
        m[y-p][x]++;
        m[y-p][x+1]--;
        m[y+p+3][x]--;
        m[y+p+3][x+1]++;
        m[y+1][x-(p+1)]--;
        m[y+1][x+(p+2)]++;
        m[y+2][x-(p+1)]++;
        m[y+2][x+(p+2)]--;
    }

    for(int i=0;i<3001+N;i++) {
        for(int j=0;j<12004;j++) {
            m[i+1][j]+=m[i][j];
        }
    }

    for(int i=0;i<3001+N;i++) {
        for(int j=0;j<12003;j++) {
            m[i][j+1]+=m[i][j];
        }
    }

    for(int i=0;i<3001+N;i++) {
        for(int j=1;j<12004;j++) {
            m[i+1][j-1]+=m[i][j];
        }
    }

    for(int i=0;i<3001+N;i++) {
        for(int j=0;j<3001+M;j++) {
            m[i+1][j+1]+=m[i][j];
        }
    }

    int cnt=0;
    for(int i=3001;i<3001+N;i++) {
        for(int j=3001;j<3001+M;j++) {
            if(m[i][j]) cnt++;
        }
    }
    cout << cnt;
}