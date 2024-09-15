#include<bits/stdc++.h>
using namespace std;

int m[501][501] = {0, };

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    while(n-->0) {
        int x1, y1, x2, y2; cin >> x1 >> y1 >> x2 >> y2;
        m[x1][y1]++;
        m[x1][y2]--;
        m[x2][y1]--;
        m[x2][y2]++;
    }

    for(int i=0;i<=500;i++) {
        for(int j=0;j<500;j++) {
            m[i][j+1]+=m[i][j];
        }
    }
    for(int i=0;i<=500;i++) {
        for(int j=0;j<500;j++) {
            m[j+1][i]+=m[j][i];
        }
    }

    int cnt=0;
    for(int i=0;i<=500;i++) {
        for(int j=0;j<=500;j++) {
            if(m[i][j]) {
                cnt++;
            }
        }
    }
    cout << cnt;
}