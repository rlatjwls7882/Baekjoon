#include<bits/stdc++.h>
using namespace std;

int a[1000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int m, n, q; cin >> m >> n >> q;
    for(int i=0;i<n;i++) cin >> a[i];

    vector<int> ans(n, 1);
    for(int i=0;i<m;i++) {
        cout << "? " << i+1 << ' ' << i+1 << '\n' << flush;
        int res; cin >> res;
        ans[i] = res%a[i]+1; // i번째 사람의 i번째 속성과 다르게 설정
    }
    cout << "!";
    for(int i=0;i<n;i++) cout << ' ' << ans[i];
}