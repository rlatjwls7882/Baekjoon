#include<bits/stdc++.h>
using namespace std;

int arr[3000][3000];
int idx[3000]; // i번째 행

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, q; cin >> n >> m >> q;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) cin >> arr[i][j];
        idx[i]=i;
    }

    while(q--) {
        int x, i, j; cin >> x >> i >> j;
        if(x==0) {
            int k; cin >> k;
            arr[idx[i]][j] = k;
        } else {
            swap(idx[i], idx[j]);
        }
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) cout << arr[idx[i]][j] << ' ';
        cout << '\n';
    }
}