#include<bits/stdc++.h>
using namespace std;

int prv[100'001];

struct element {
    int a, b, idx;
    bool operator<(const element e) const {
        return a < e.a;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<element> v(n+1);
    for(int i=1;i<=n;i++) cin >> v[i].a >> v[i].b;
    sort(v.begin()+1, v.end());

    vector<element> lis;
    for(int i=1;i<=n;i++) {
        v[i].idx = i;
        if(lis.empty() || lis.back().b < v[i].b) {
            if(!lis.empty()) prv[i] = lis.back().idx;
            lis.push_back(v[i]);
        } else {
            int left=0, right=lis.size()-1;
            while(left<right) {
                int mid = (left+right)/2;
                if(lis[mid].b>v[i].b) right=mid;
                else left=mid+1;
            }
            if(lis[left].b>v[i].b) {
                lis[left] = v[i];
                if(left!=0) prv[i] = lis[left-1].idx;
            }
        }
    }

    set<int> res;
    for(int i=1;i<=n;i++) res.insert(v[i].a);
    for(int i=lis.back().idx;i!=0;i = prv[i]) res.erase(v[i].a);

    cout << res.size() << '\n';
    for(int e : res) cout << e << '\n';
}