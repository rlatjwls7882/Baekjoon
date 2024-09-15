#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;

    set<int> depth1;
    vector<pair<int, int>> v;
    while(m-->0) {
        int a, b; cin >> a >> b;
        if(a==1) depth1.insert(b);
        else if(b==1) depth1.insert(a);
        else v.push_back(make_pair(a, b));
    }

    set<int> depth2;
    for(int i=0;i<v.size();i++) {
        if(depth1.count(v[i].first)) depth2.insert(v[i].second);
        else if(depth1.count(v[i].second)) depth2.insert(v[i].first);
    }

    depth1.merge(depth2);
    cout << depth1.size();
}