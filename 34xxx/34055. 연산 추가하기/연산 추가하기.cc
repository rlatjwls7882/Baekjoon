#include<bits/stdc++.h>
using namespace std;

long long preSum[200'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, h; cin >> n >> h;
    vector<pair<int, int>> cycles(n);
    for(int i=0;i<n;i++) cin >> cycles[i].first >> cycles[i].second;
    sort(cycles.begin(), cycles.end());

    vector<int> len;
    int last=0;
    for(auto cycle : cycles) {
        if(cycle.first<=last) last = max(last, cycle.second);
        else {
            len.push_back(cycle.first - last - 1);
            last = cycle.second;
        }
    }
    len.push_back(h - last);
    sort(len.begin(), len.end());

    for(int i=0;i<len.size();i++) preSum[i+1] = preSum[i] + len[i];

    long long sum=0;
    int q; cin >> q;
    while(q--) {
        int t; cin >> t;

        if(len.back()<t) {
            cout << "0\n";
        } else {
            int idx = lower_bound(len.begin(), len.end(), t) - len.begin();
            cout << preSum[len.size()] - preSum[idx] - (t-1)*(len.size() - idx) << '\n';
        }
    }
}