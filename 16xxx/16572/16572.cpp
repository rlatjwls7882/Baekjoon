#include<bits/stdc++.h>
using namespace std;

int m[2002][2002] = {0, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    while(n-->0) {
        int a, b, c; cin >> a >> b >> c;
        m[a+c][b-1]++;
        m[a+c][b]--;
        m[a][b-1]--;
        m[a][b+c]++;
        m[a-1][b]++;
        m[a-1][b+c]--;
    }

    for(int i=0;i<2002;i++) {
        for(int j=0;j<2001;j++) {
            m[i][j+1] += m[i][j];
        }
    }

    for(int i=2001;i>0;i--) {
        for(int j=0;j<2002;j++) {
            m[i-1][j] += m[i][j];
        }
    }

    for(int i=2001;i>0;i--) {
        for(int j=0;j<2001;j++) {
            m[i-1][j+1] += m[i][j];
        }
    }

    int cnt=0;
    for(int i=0;i<2002;i++) {
        for(int j=0;j<2002;j++) {
            if(m[i][j]) cnt++;
        }
    }
    cout << cnt;
}