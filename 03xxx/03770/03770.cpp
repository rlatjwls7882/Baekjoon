#include<bits/stdc++.h>
using namespace std;

const int MAX = 1001;

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
        ret+=arr[i];
        i-=i&-i;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    for(int tc=1;tc<=t;tc++) {
        memset(arr, 0, sizeof arr);
        int n, m, k; cin >> n >> m >> k;
        vector<pair<int, int>> v(k);
        for(int i=0;i<k;i++) cin >> v[i].first >> v[i].second;
        sort(v.begin(), v.end());

        long long res=0;
        for(auto [s, e]:v) {
            res += query(m) - query(e);
            update(e);
        }
        cout << "Test case " << tc << ": " << res << '\n';
    }
}