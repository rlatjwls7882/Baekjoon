#include<bits/stdc++.h>
using namespace std;

int cnt=1, sqrtN, p[100'001], cur[200'001], exist[100'001];

struct element {
    int s, e, idx;
    bool operator<(const element el) const {
        if(s/sqrtN!=el.s/sqrtN) return s/sqrtN < el.s/sqrtN;
        return e < el.e;
    }
};

void add(int i) {
    exist[cur[p[i]]]--;
    cur[p[i]]++;
    exist[cur[p[i]]]++;
    cnt = max(cnt, cur[p[i]]);
}

void sub(int i) {
    exist[cur[p[i]]]--;
    cur[p[i]]--;
    exist[cur[p[i]]]++;
    if(!exist[cnt]) cnt--;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;
    sqrtN = sqrt(n);
    for(int i=1;i<=n;i++) {
        cin >> p[i];
        p[i] += 100'000;
    }

    vector<element> query(q);
    for(int i=0;i<q;i++) {
        cin >> query[i].s >> query[i].e;
        query[i].idx=i;
    }
    sort(query.begin(), query.end());

    vector<int> res(q);
    cur[0]=1; exist[0]=n-1, exist[1]=1;
    int left=0, right=0;
    for(auto [s, e, idx]:query) {
        while(left<s) sub(left++);
        while(s<left) add(--left);
        while(right<e) add(++right);
        while(e<right) sub(right--);
        res[idx]=cnt;
    }
    for(int e:res) cout << e << '\n';
}
