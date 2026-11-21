#include<bits/stdc++.h>
using namespace std;

int cover[100'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int lastCover=0;
    for(int i=0;i<n;i++) {
        int a; cin >> a;
        for(int j=lastCover+1;j<=min(a+i, n);j++) cover[j]=i+1;
        lastCover = max(lastCover, a+i);
    }

    int q; cin >> q;
    while(q--) {
        int s; cin >> s;
        cout << cover[s] << ' ';
    }
}