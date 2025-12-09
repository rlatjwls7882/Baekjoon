#include<bits/stdc++.h>
using namespace std;

const int MAX = 2001;

int arr[MAX];

void update(int i) {
    while(i<MAX) {
        arr[i]++;
        i+=i&-i;
    }
}

int query(int i) {
    int ret=0;
    while(i) {
        ret += arr[i];
        i-=i&-i;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    vector<pair<int, int>> v(m);
    for(int i=0;i<m;i++) cin >> v[i].first >> v[i].second;
    sort(v.begin(), v.end());

    long long cnt=0;
    for(auto [s, e]:v) {
        cnt += query(n) - query(e);
        update(e);
    }
    cout << cnt;
}