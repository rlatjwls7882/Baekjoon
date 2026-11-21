#include<bits/stdc++.h>
using namespace std;

const int MAX_VAL = 1'000'001;
const int MAX = 100'001;

int sqrtN, A[MAX], chk[MAX_VAL];

struct query {
    int s, e, i;
    bool operator<(const query q2) const {
        if(s/sqrtN != q2.s/sqrtN) return s/sqrtN < q2.s/sqrtN;
        return e < q2.e;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) cin >> A[i];
    sqrtN = sqrt(n);

    int m; cin >> m;
    vector<query> queries(m);
    for(int i=0;i<m;i++) {
        cin >> queries[i].s >> queries[i].e;
        queries[i].i=i;
    }
    sort(queries.begin(), queries.end());

    vector<int> res(m);
    int cnt=0, left=0, right=0;
    for(int i=0;i<m;i++) {
        while(queries[i].s<left) if(++chk[A[--left]]==1) cnt++;
        while(right<queries[i].e) if(++chk[A[++right]]==1) cnt++;
        while(left<queries[i].s) if(--chk[A[left++]]==0) cnt--;
        while(queries[i].e<right) if(--chk[A[right--]]==0) cnt--;
        res[queries[i].i]=cnt;
    }
    for(int e:res) cout << e << '\n';
}