#include<bits/stdc++.h>
using namespace std;

int n, m, r, c;
bool arr[100][100];

bool chk() {
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(arr[i][j]) return false;
        }
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        cin >> n >> m >> r >> c;
        if(!n) break;
        for(int i=0;i<n;i++) {
            string s; cin >> s;
            for(int j=0;j<m;j++) arr[i][j] = s[j]-'0';
        }

        int cnt=0;
        for(int i=0;i<=n-r;i++) {
            for(int j=0;j<=m-c;j++) {
                if(arr[i][j]) {
                    cnt++;
                    for(int k=0;k<r;k++) {
                        for(int l=0;l<c;l++) {
                            arr[i+k][j+l]^=1;
                        }
                    }
                }
            }
        }
        cout << (chk() ? cnt : -1) << '\n';
    }
}