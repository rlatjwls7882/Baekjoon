#include<bits/stdc++.h>
using namespace std;

int n, k, cnt;
struct Subject {
    int w, s, e;
    bool operator<(const Subject a) const {
        if(w == a.w) {
            if(s == a.s) return e < a.e;
            return s < a.s;
        }
        return w < a.w;
    }
};
vector<Subject> v;

void dfs(int cur, int curK, int lastW, int lastE) {
    if(curK>=k) {
        if(curK==k) cnt++;
        return;
    }
    for(int i=cur;i<v.size();i++) {
        if(v[i].w==lastW && v[i].s>lastE || v[i].w>lastW) dfs(i+1, curK+v[i].e-v[i].s+1, v[i].w, v[i].e);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> k;
    for(int i=0;i<n;i++) {
        int w, s, e; cin >> w >> s >> e;
        if(w!=5) v.push_back({w, s, e});
    }
    sort(v.begin(), v.end());
    dfs(0, 0, 0, 0);
    cout << cnt;
}