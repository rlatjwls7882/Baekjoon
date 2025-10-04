#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<int> v(n);
    for(int i=0;i<n;i++) cin >> v[i];

    vector<int> sorted = v;
    sort(sorted.begin(), sorted.end());

    vector<pair<int, int>> range;
    for(int val : v) {
        int idx = lower_bound(sorted.begin(), sorted.end(), val) - sorted.begin();

        bool chk=false;
        for(auto &e : range) {
            if(idx==e.first-1) e.first--, chk=true;
            else if(idx==e.second+1) e.second++, chk=true;
        }
        if(!chk) range.push_back({idx, idx});
    }
    cout << range.size();
}