#include<bits/stdc++.h>
using namespace std;

int pos[301], cur[301]; // pos[i] : i번 사람이 pos[i]번 위치에 있다.

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) {
        int a; cin >> a;
        pos[a]=i;
    }

    int m; cin >> m;
    while(m--) {
        memcpy(cur, pos, sizeof cur);
        int l, r; cin >> l >> r;
        sort(cur+l, cur+r+1);

        vector<int> res(301);
        for(int i=1;i<=n;i++) res[cur[i]]=i;
        for(int i=1;i<=n;i++) cout << res[i] << ' ';
        cout << '\n';
    }
}