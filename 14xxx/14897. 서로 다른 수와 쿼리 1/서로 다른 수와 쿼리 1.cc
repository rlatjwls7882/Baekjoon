#include<bits/stdc++.h>
using namespace std;

int a[1'000'001], cur[1'000'001], sqrtN;

struct element {
    int s, e, idx;
    bool operator<(const element el) const {
        if(s/sqrtN!=el.s/sqrtN) return s/sqrtN < el.s/sqrtN;
        return e < el.e;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    sqrtN = sqrt(n);
    vector<int> nums;
    for(int i=1;i<=n;i++) {
        cin >> a[i];
        nums.push_back(a[i]);
    }
    sort(nums.begin(), nums.end());
    nums.erase(unique(nums.begin(), nums.end()), nums.end());
    for(int i=1;i<=n;i++) a[i] = lower_bound(nums.begin(), nums.end(), a[i]) - nums.begin();

    int q; cin >> q;
    vector<element> v(q);
    for(int i=0;i<q;i++) {
        cin >> v[i].s >> v[i].e;
        v[i].idx=i;
    }
    sort(v.begin(), v.end());

    cur[0]=1;
    vector<int> res(q);
    int cnt=1, l=0, r=0;
    for(auto [s, e, idx]:v) {
        while(l<s) if(--cur[a[l++]]==0) cnt--;
        while(s<l) if(++cur[a[--l]]==1) cnt++;
        while(r<e) if(++cur[a[++r]]==1) cnt++;
        while(e<r) if(--cur[a[r--]]==0) cnt--;
        res[idx]=cnt;
    }
    for(int e:res) cout << e << '\n';
}