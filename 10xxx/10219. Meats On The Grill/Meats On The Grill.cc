#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int h, w; cin >> h >> w;
        string s[h];
        for(int i=0;i<h;i++) {
            cin >> s[i];
        }

        for(int i=h-1;i>=0;i--) {
            for(int j=0;j<w;j++) {
                cout << s[i][j];
            }
            cout << '\n';
        }
        cout << '\n';
    }
}