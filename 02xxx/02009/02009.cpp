#include<bits/stdc++.h>
using namespace std;

string h[100], r[100], c[100];
bool block[100][100][100];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int j=0;j<n;j++) cin >> h[j];
    for(int i=0;i<n;i++) cin >> r[i];
    for(int i=0;i<n;i++) cin >> c[i];

    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            for(int k=0;k<n;k++) {
                if(h[j][k]=='1' && r[i][k]=='1' && c[i][j]=='1') block[i][j][k]=1;
            }
        }
    }

    for(int j=0;j<n;j++) {
        for(int k=0;k<n;k++) {
            if(h[j][k]=='1') {
                bool chk=false;
                for(int i=0;i<n;i++) {
                    if(block[i][j][k]) {
                        chk=true;
                    }
                }
                if(!chk) {
                    cout << "NO";
                    return 0;
                }
            }
        }
    }

    for(int i=0;i<n;i++) {
        for(int k=0;k<n;k++) {
            if(r[i][k]=='1') {
                bool chk=false;
                for(int j=0;j<n;j++) {
                    if(block[i][j][k]) {
                        chk=true;
                    }
                }
                if(!chk) {
                    cout << "NO";
                    return 0;
                }
            }
        }
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(c[i][j]=='1') {
                bool chk=false;
                for(int k=0;k<n;k++) {
                    if(block[i][j][k]) {
                        chk=true;
                    }
                }
                if(!chk) {
                    cout << "NO";
                    return 0;
                }
            }
        }
    }

    cout << "YES\n";
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            for(int k=0;k<n;k++) {
                cout << block[i][j][k];
            }
            cout << '\n';
        }
    }
}