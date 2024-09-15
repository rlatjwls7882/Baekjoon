#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    long long totalDepth=1;
    long long val; cin >> val;
    set<long long> vals;
    map<long long, int> depthes;
    vals.insert(val);
    depthes[val]=1;

    while(n-->1) {
        cin >> val;
        auto next = vals.upper_bound(val);
        auto before = next; before--;
        if(next == vals.end()) depthes[val] = depthes[*before]+1;
        else if(next == vals.begin()) depthes[val] = depthes[*next]+1;
        else depthes[val] = max(depthes[*before], depthes[*next])+1;
        totalDepth += depthes[val];
        vals.insert(val);
    }
    cout << totalDepth;
}