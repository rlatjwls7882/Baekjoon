#include<bits/stdc++.h>
using namespace std;

int cnt9[100'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int h, w, c, d; cin >> h >> w >> c >> d;

    for(int i=0;i<h;i++) {
        cnt9[i] += i;
        d -= i;
    }
    for(int i=h-1;i>=0;i--) {
        int cnt = max(0, min(d, w-h+1));
        cnt9[i] += cnt;
        d -= cnt;
    }

    if(d) {
        cout << -1;
    } else {
        for(int i=0;i<h;i++) {
            for(int j=0;j<w;j++) {
                if(j<cnt9[i]) cout << "9 ";
                else cout << "1 ";
            }
            cout << '\n';
        }
    }
}