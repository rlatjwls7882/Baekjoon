#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, L; cin >> N >> L;
    vector<pair<int, int>> pool(N);
    for(int i=0;i<N;i++) cin >> pool[i].first >> pool[i].second;
    sort(pool.begin(), pool.end());

    int last=0, cnt=0;
    for(auto cur:pool) {
        cur.first = max(cur.first, last);
        int curCnt = (cur.second-cur.first+L-1)/L;
        cnt += curCnt;
        last = cur.first+curCnt*L;
    }
    cout << cnt;
}