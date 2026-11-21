#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll LINF = 0x3f3f3f3f3f3f3f3f;

int SZ=1;

struct node {
    ll sum, maxPref, maxSuff, best, minPref, minSuff, worst;
} arr[888'888];

node merge(node a, node b) {
    return {a.sum+b.sum, max(a.maxPref, a.sum+b.maxPref), max(b.maxSuff, b.sum+a.maxSuff), max({a.best, b.best, a.maxSuff+b.maxPref}), min(a.minPref, a.sum+b.minPref), min(b.minSuff, b.sum+a.minSuff), min({a.worst, b.worst, a.minSuff+b.minPref})};
}

void update(int i, ll val) {
    arr[i].sum+=val;
    arr[i].maxPref+=val;
    arr[i].maxSuff+=val;
    arr[i].best+=val;
    arr[i].minPref+=val;
    arr[i].minSuff+=val;
    arr[i].worst+=val;
    while(i>1) {
        i>>=1;
        arr[i]=merge(arr[i*2], arr[i*2+1]);
    }
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int s, q; cin >> s >> q;
    while(SZ<s) SZ<<=1;
    for(int i=SZ;i<SZ+s;i++) arr[i] = {0, 0, 0, 0, 0, 0, 0};
    for(int i=SZ+s;i<2*SZ;i++) arr[i] = {0, -LINF, -LINF, -LINF, LINF, LINF, LINF};
    for(int i=SZ-1;i>0;i--) arr[i]=merge(arr[i*2], arr[i*2+1]);

    while(q--) {
        ll op, a, b; cin >> op;
        if(op==1) {
            cin >> a >> b;
            update(a-1+SZ, b);
        } else {
            cout << max(arr[1].best, arr[1].sum-arr[1].worst ? arr[1].sum-arr[1].worst : -LINF) << '\n';
        }
    }
}