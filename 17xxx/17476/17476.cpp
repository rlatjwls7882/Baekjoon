#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

const int MAX = 400'000;

struct node {
    ll mx, mn, sum;
};

int SZ=1;
node arr[MAX];
ll lazy1[MAX], lazy2[MAX];

node merge(node a, node b) {
    return {max(a.mx, b.mx), min(a.mn, b.mn), a.sum+b.sum};
}

void propagate(int nodeNum, int nodeL, int nodeR) {
    if(!lazy1[nodeNum] && !lazy2[nodeNum]) return;
    if(!lazy2[nodeNum]) {
        arr[nodeNum].mx += lazy1[nodeNum];
        arr[nodeNum].mn += lazy1[nodeNum];
        arr[nodeNum].sum += (nodeR-nodeL+1)*lazy1[nodeNum];
        if(nodeNum<SZ) {
            lazy1[nodeNum*2]+=lazy1[nodeNum];
            lazy1[nodeNum*2+1]+=lazy1[nodeNum];
        }
    } else {
        arr[nodeNum].mx = arr[nodeNum].mn = lazy1[nodeNum]+lazy2[nodeNum];
        arr[nodeNum].sum = (nodeR-nodeL+1)*(lazy1[nodeNum]+lazy2[nodeNum]);
        if(nodeNum<SZ) {
            lazy1[nodeNum*2]=lazy1[nodeNum];
            lazy1[nodeNum*2+1]=lazy1[nodeNum];
            lazy2[nodeNum*2]=lazy2[nodeNum];
            lazy2[nodeNum*2+1]=lazy2[nodeNum];
        }
    }
    lazy1[nodeNum]=lazy2[nodeNum]=0;
}

void sq(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    propagate(nodeNum, nodeL, nodeR);
    if(nodeR<L || R<nodeL) return;
    if(L<=nodeL && nodeR<=R) {
        if(int(sqrt(arr[nodeNum].mn))==int(sqrt(arr[nodeNum].mx))) {
            lazy2[nodeNum]=int(sqrt(arr[nodeNum].mx));
            propagate(nodeNum, nodeL, nodeR);
            return;
        }
        if(arr[nodeNum].mn+1==arr[nodeNum].mx) {
            lazy1[nodeNum]=int(sqrt(arr[nodeNum].mn))-arr[nodeNum].mn;
            propagate(nodeNum, nodeL, nodeR);
            return;
        }
    }
    int mid = nodeL+nodeR>>1;
    sq(L, R, nodeNum*2, nodeL, mid);
    sq(L, R, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum] = merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

void add(int L, int R, int x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    propagate(nodeNum, nodeL, nodeR);
    if(nodeR<L || R<nodeL) return;
    if(L<=nodeL && nodeR<=R) {
        lazy1[nodeNum]=x;
        propagate(nodeNum, nodeL, nodeR);
        return;
    }
    int mid = nodeL+nodeR>>1;
    add(L, R, x, nodeNum*2, nodeL, mid);
    add(L, R, x, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum] = merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

ll query(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    propagate(nodeNum, nodeL, nodeR);
    if(nodeR<L || R<nodeL) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum].sum;
    int mid=nodeL+nodeR>>1;
    return query(L, R, nodeNum*2, nodeL, mid)+query(L, R, nodeNum*2+1, mid+1, nodeR);
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    while(SZ<n) SZ<<=1;
    for(int i=0;i<n;i++) {
        int a; cin >> a;
        add(i, i, a);
    }

    int m; cin >> m;
    while(m--) {
        int op, l, r, x; cin >> op >> l >> r;
        if(op==1) {
            cin >> x;
            add(l-1, r-1, x);
        } else if(op==2) {
            sq(l-1, r-1);
        } else {
            cout << query(l-1, r-1) << '\n';
        }
    }
}