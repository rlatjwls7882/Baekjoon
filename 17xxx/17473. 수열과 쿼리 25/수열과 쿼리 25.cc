#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

const int MAX = 800'000;
const int FULL = (1<<20)-1;

struct node {
    int mx, zero, one;
};

int SZ=1, lazyAnd[MAX], lazyOr[MAX];

node arr[MAX];

node merge(node a, node b) {
    return {max(a.mx, b.mx), a.zero&b.zero, a.one&b.one};
}

void propagate(int i) {
    if(!arr[i].zero && !arr[i].one) return;
    arr[i].mx&=~lazyAnd[i];
    arr[i].zero|=lazyAnd[i];
    arr[i].one&=~lazyAnd[i];

    arr[i].mx|=lazyOr[i];
    arr[i].zero&=~lazyOr[i];
    arr[i].one|=lazyOr[i];

    if(i<SZ) {
        for(int j:{i*2, i*2+1}) {
            lazyAnd[j]=(lazyAnd[j]&~lazyOr[i])|lazyAnd[i];
            lazyOr[j]=(lazyOr[j]&~lazyAnd[i])|lazyOr[i];
        }
    }
    lazyAnd[i]=lazyOr[i]=0;
}

void AND(int L, int R, int x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    propagate(nodeNum);
    if(nodeR<L || R<nodeL) return;
    x&=~arr[nodeNum].zero;
    if(L<=nodeL && nodeR<=R && (x&arr[nodeNum].one)) {
        lazyAnd[nodeNum]=x&arr[nodeNum].one;
        x&=~arr[nodeNum].one;
        propagate(nodeNum);
    }
    if(!x) return;
    int mid=nodeL+nodeR>>1;
    AND(L, R, x, nodeNum*2, nodeL, mid);
    AND(L, R, x, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum] = merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

void OR(int L, int R, int x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    propagate(nodeNum);
    if(nodeR<L || R<nodeL) return;
    x&=~arr[nodeNum].one;
    if(L<=nodeL && nodeR<=R && (x&arr[nodeNum].zero)) {
        lazyOr[nodeNum]=x&arr[nodeNum].zero;
        x&=~arr[nodeNum].zero;
        propagate(nodeNum);
    }
    if(!x) return;
    int mid=nodeL+nodeR>>1;
    OR(L, R, x, nodeNum*2, nodeL, mid);
    OR(L, R, x, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum] = merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

int query(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    propagate(nodeNum);
    if(nodeR<L || R<nodeL) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum].mx;
    int mid=nodeL+nodeR>>1;
    return max(query(L, R, nodeNum*2, nodeL, mid), query(L, R, nodeNum*2+1, mid+1, nodeR));
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    while(SZ<n) SZ<<=1;
    for(int i=SZ;i<SZ+n;i++) {
        int a; cin >> a;
        arr[i]={a, a^FULL, a};
    }
    for(int i=SZ+n;i<2*SZ;i++) arr[i]={0, FULL, 0};
    for(int i=SZ-1;i>0;i--) arr[i] = merge(arr[i*2], arr[i*2+1]);

    int q; cin >> q;
    while(q--) {
        int op, l, r, x; cin >> op >> l >> r;
        if(op==1) {
            cin >> x;
            AND(l-1, r-1, x^FULL);
        } else if(op==2) {
            cin >> x;
            OR(l-1, r-1, x);
        } else {
            cout << query(l-1, r-1) << '\n';
        }
    }
}
