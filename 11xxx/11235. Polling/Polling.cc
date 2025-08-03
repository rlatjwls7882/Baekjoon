#include<bits/stdc++.h>
using namespace std;

struct element {
    string s;
    int cnt;
    bool operator<(const element e) {
        if(cnt!=e.cnt) return cnt > e.cnt;
        if(s.compare(e.s)<0) return true;
        return false;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    map<string, int> votes;
    while(n--) {
        string s; cin >> s;
        votes[s]++;
    }

    vector<element> res;
    for(auto e : votes) res.push_back({e.first, e.second});
    sort(res.begin(), res.end());

    for(int i=0;i<res.size();i++) {
        if(i>0 && res[i].cnt<res[i-1].cnt) break;
        cout << res[i].s << '\n';
    }
}