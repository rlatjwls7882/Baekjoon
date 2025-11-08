#include<bits/stdc++.h>
using namespace std;

bool exist1[20'001], exist2[20'001];
bool exist[20'001][20'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    for(int i=0;i<n;i++) {
        int x, y; cin >> x >> y;
        exist[x][y]=true;
        exist1[x]=true;
        exist2[y]=true;
    }
    if(n==1) {
        if(exist[2][2]) cout << "NO";
        else cout << "YES\n1 1";
        return 0;
    }
    cout << "YES\n";

    for(int i=1;i<=n;i++) {
        if(!exist1[i*2]) {
            for(int j=1;j<=n;j++) cout << i << ' ' << j << '\n';
            return 0;
        }
    }
    for(int i=1;i<=n;i++) {
        if(!exist2[i*2]) {
            for(int j=1;j<=n;j++) cout << j << ' ' << i << '\n';
            return 0;
        }
    }

    for(int i=1;i<=n;i++) {
        if(exist[2*i][2*n]) {
            for(int j=1;j<n;j++) cout << i << ' ' << j << '\n';
            if(i%2) {
                if(!exist[4][2]) cout << "2 1";
                else cout << "2 2";
            } else {
                if(!exist[2][2]) cout << "1 1";
                else cout << "1 2";
            }
            return 0;
        }
    }
}