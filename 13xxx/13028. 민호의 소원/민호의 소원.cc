#include<bits/stdc++.h>
using namespace std;

int cnt, sqrtN, a[100'001], cur[100'001];

struct element {
    int s, e, idx;
    bool operator<(const element el) const {
        if(s/sqrtN!=el.s/sqrtN) return s/sqrtN < el.s/sqrtN;
        return e < el.e;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;
    sqrtN = sqrt(n);
    for(int i=1;i<=n;i++) cin >> a[i];

    vector<element> queries(q);
    for(int i=0;i<q;i++) {
        cin >> queries[i].s >> queries[i].e;
        queries[i].idx=i;
    }
    sort(queries.begin(), queries.end());

    cur[0]=1;
    int left=0, right=0;
    vector<int> res(q);
    for(auto [s, e, idx]:queries) {
        while(left<s) if(--cur[a[left++]]==2) cnt--;
        while(s<left) if(++cur[a[--left]]==3) cnt++;
        while(right<e) if(++cur[a[++right]]==3) cnt++;
        while(e<right) if(--cur[a[right--]]==2) cnt--;
        res[idx]=cnt;
    }
    for(int e:res) cout << e  << '\n';
}