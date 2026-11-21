#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

int cnt[4];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=1;i<=3*n;i++) {
        int cur; cin >> cur;
        cnt[cur]++;
    }
    if(cnt[1]>cnt[2] && cnt[1]>cnt[3]) {
        if(cnt[2]<cnt[3]) cout << 2;
        else cout << 3;
        cout << "\n1";
    } else if(cnt[2]>cnt[3]) {
        if(cnt[1]<cnt[3]) cout << 1;
        else cout << 3;
        cout << "\n2";
    } else {
        if(cnt[1]<cnt[2]) cout << 1;
        else cout << 2;
        cout << "\n3";
    }
}