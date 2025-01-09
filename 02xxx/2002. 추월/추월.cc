#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<string> v(n);
    for(int i=0;i<n;i++) cin >> v[i];

    int idx=0;
    set<string> bad;
    for(int i=0;i<n;i++) {
        string s; cin >> s;
        while(idx<n && bad.count(v[idx])) idx++;
        if(idx<n && v[idx].compare(s)==0) idx++;
        else bad.insert(s);
    }
    cout << bad.size();
}