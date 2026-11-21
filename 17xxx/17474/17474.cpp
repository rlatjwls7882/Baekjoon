#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef pair<ll, ll> pll;

struct node {
    ll max1, max2, maxCnt, sum;
};

int SZ=1;
node arr[4'000'000];

node merge(node a, node b) {
    if(a.max1==b.max1) return {a.max1, max(a.max2, b.max2), a.maxCnt+b.maxCnt, a.sum+b.sum};
    if(a.max1<b.max1) swap(a, b);
    return {a.max1, max(a.max2, b.max1), a.maxCnt, a.sum+b.sum};
}

void updateLazy(int i) {
    if(i<SZ) {
        for(int j:{i*2, i*2+1}) {
            if(arr[i].max1<arr[j].max1) {
                arr[j].sum-=(arr[j].max1-arr[i].max1)*(ll)arr[j].maxCnt;
                arr[j].max1=arr[i].max1;
            }
        }
    }
}

void updateRange(int L, int R, int x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    updateLazy(nodeNum);
    if(nodeR<L || R<nodeL || arr[nodeNum].max1<=x) return;
    if(L<=nodeL && nodeR<=R && x>arr[nodeNum].max2) {
        arr[nodeNum].sum-=(arr[nodeNum].max1-x)*(ll)arr[nodeNum].maxCnt;
        arr[nodeNum].max1=x;
        updateLazy(nodeNum);
        return;
    }
    int mid = nodeL+nodeR>>1;
    updateRange(L, R, x, nodeNum*2, nodeL, mid);
    updateRange(L, R, x, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum] = merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

pll query(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    updateLazy(nodeNum);
    if(nodeR<L || R<nodeL) return {-1, 0};
    if(L<=nodeL && nodeR<=R) return {arr[nodeNum].max1, arr[nodeNum].sum};
    int mid=nodeL+nodeR>>1;
    auto [m1, s1] = query(L, R, nodeNum*2, nodeL, mid);
    auto [m2, s2] = query(L, R, nodeNum*2+1, mid+1, nodeR);
    return {max(m1, m2), s1+s2};
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    while(SZ<n) SZ<<=1;
    for(int i=SZ;i<SZ+n;i++) {
        int a; cin >> a;
        arr[i] = {a, -1, 1, a};
    }
    for(int i=SZ-1;i>0;i--) arr[i]=merge(arr[i*2], arr[i*2+1]);

    int m; cin >> m;
    while(m--) {
        int op, l, r, x; cin >> op >> l >> r;
        if(op==1) {
            cin >> x;
            updateRange(l-1, r-1, x);
        } else {
            auto [m, s] = query(l-1, r-1);
            cout << (op==2 ? m : s) << '\n';
        }
    }
}