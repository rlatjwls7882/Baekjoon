#include<bits/stdc++.h>
using namespace std;

int sqrn;
int exist[1000001];

struct Query {
    int s, e, i;
    bool operator<(const Query q) const {
        if(this->s/sqrn == q.s/sqrn) return this->e < q.e;
        return this->s/sqrn < q.s/sqrn;
    }
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    sqrn = sqrt(n);
    int A[n];
    for(int i=0;i<n;i++) cin >> A[i];

    int m; cin >> m;
    vector<Query> v;
    for(int i=0;i<m;i++) {
        int s, e; cin >> s >> e;
        v.push_back({s-1, e-1, i});
    }
    sort(v.begin(), v.end());

    int res[m];
    int curCnt=0;
    for(int i=v[0].s;i<=v[0].e;i++) {
        if(++exist[A[i]]==1) curCnt++;
    }
    res[v[0].i]=curCnt;

    for(int i=1;i<m;i++) {
        while(v[i-1].s<v[i].s) if(--exist[A[v[i-1].s++]]==0) curCnt--;
        while(v[i-1].e>v[i].e) if(--exist[A[v[i-1].e--]]==0) curCnt--;
        while(v[i-1].s>v[i].s) if(++exist[A[--v[i-1].s]]==1) curCnt++;
        while(v[i-1].e<v[i].e) if(++exist[A[++v[i-1].e]]==1) curCnt++;
        res[v[i].i] = curCnt;
    }
    for(int i=0;i<m;i++) cout << res[i] << '\n';
}