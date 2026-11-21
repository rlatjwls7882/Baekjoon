#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    int up[n/2];
    int down[n/2];
    for(int i=0;i<n/2;i++) {
        up[i] = i+1;
    }
    for(int i=0;i<n/2;i++) {
        down[i] = n-(i);
    }

    while(m-->1) {
        int tmp = up[n/2-1];
        for(int i=n/2-1;i>=0;i--) {
            up[i+1] = up[i];
        }
        up[0] = down[1];
        for(int i=1;i<n/2-1;i++) {
            down[i] = down[i+1];
        }
        down[n/2-1] = tmp;
    }

    for(int i=0;i<n/2;i++) {
        cout << up[i] << '-' << down[i] << '\n';
    }
}