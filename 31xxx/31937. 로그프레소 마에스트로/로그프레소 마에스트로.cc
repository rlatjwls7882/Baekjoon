#include<bits/stdc++.h>
using namespace std;

bool chk[1001], cur[1001];
vector<int> affected;

struct query {
    int t, a, b;
    bool operator<(const query q) const {
        return t < q.t;
    }
};

vector<query> queries;

int getAns() {
    for(int firstAffected : affected) {
        memset(cur, false, sizeof cur);
        cur[firstAffected]=true;
        for(query q : queries) {
            if(cur[q.a]) cur[q.b]=true;
        }
        if(memcmp(chk, cur, sizeof chk)==0) return firstAffected;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;

    while(k--) {
        int no; cin >> no;
        affected.push_back(no);
        chk[no] = true;
    }

    while(m--) {
        int t, a, b; cin >> t >> a >> b;
        queries.push_back({t, a, b});
    }
    sort(queries.begin(), queries.end());
    cout << getAns();
}