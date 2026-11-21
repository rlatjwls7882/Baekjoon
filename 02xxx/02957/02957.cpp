#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    map<long long, int> depths;
    long long totalDepth=0;
    for(int i=0;i<n;i++) {
        long long val; cin >> val;
        if(i==0) {
            depths[val]=0;
        } else {
            auto next = depths.upper_bound(val);
            auto before = prev(next);

            if(next == depths.end()) depths[val] = (*before).second+1;
            else if(next == depths.begin()) depths[val] = (*next).second+1;
            else depths[val] = max((*before).second, (*next).second)+1;
            totalDepth += depths[val];
        }
        cout << totalDepth << '\n';
    }
}