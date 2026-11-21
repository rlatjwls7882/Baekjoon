#include<bits/stdc++.h>
using namespace std;

vector<pair<int, int>> idx(1'000'001);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            int a; cin >> a;
            idx[a] = {i, j};
        }
    }

    int cnt=0;
    int left=n, right=0, up=n, down=0;
    for(int i=1;i<=n*n;i++) {
        up = min(up, idx[i].first);
        down = max(down, idx[i].first);
        left = min(left, idx[i].second);
        right = max(right, idx[i].second);
        if((down-up+1)*(right-left+1)==i) cnt++;
    }
    cout << cnt;
}