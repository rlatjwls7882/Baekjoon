#include<bits/stdc++.h>
using namespace std;

int pos[50001], idx[50001];

void rev(int i, int j) {
    for(int k=0;k<(j-i+1)/2;k++) {
        swap(idx[pos[i+k]], idx[pos[j-k]]);
        swap(pos[i+k], pos[j-k]);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int tc=1;;tc++) {
        int n, r; cin >> n >> r;
        if(!n) break;
        cout << "Genome " << tc << '\n';
        for(int i=1;i<=n;i++) pos[i]=idx[i]=i;

        while(r--) {
            int i, j; cin >> i >> j;
            rev(i, j);
        }

        int q; cin >> q;
        while(q--) {
            int i; cin >> i;
            cout << idx[i] << '\n';
        }
    }
}