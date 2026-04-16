#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
const int MAX = 400'000;
const int INF = 0x3f3f3f3f;

struct node {
    ll mx, mn, sum;
};

int SZ=1;
node arr[MAX];
ll lazy1[MAX], lazy2[MAX];

node merge(node a, node b) {
    if(b.mn==INF) return a;
    return {max(a.mx, b.mx), min(a.mn, b.mn), a.sum+b.sum};
}

void propagate(int nodeNum, int nodeL, int nodeR) {
    if(!lazy1[nodeNum] && lazy2[nodeNum]==-INF) return;
    if(lazy2[nodeNum]==-INF) {
        arr[nodeNum].mx += lazy1[nodeNum];
        arr[nodeNum].mn += lazy1[nodeNum];
        arr[nodeNum].sum += (nodeR-nodeL+1)*lazy1[nodeNum];
        if(nodeL^nodeR) {
            lazy1[nodeNum<<1]+=lazy1[nodeNum];
            lazy1[(nodeNum<<1)|1]+=lazy1[nodeNum];
        }
    } else {
        arr[nodeNum].mx = arr[nodeNum].mn = lazy1[nodeNum]+lazy2[nodeNum];
        arr[nodeNum].sum = (nodeR-nodeL+1)*(lazy1[nodeNum]+lazy2[nodeNum]);
        if(nodeL^nodeR) {
            lazy1[nodeNum<<1]=lazy1[nodeNum];
            lazy1[(nodeNum<<1)|1]=lazy1[nodeNum];
            lazy2[nodeNum<<1]=lazy2[nodeNum];
            lazy2[(nodeNum<<1)|1]=lazy2[nodeNum];
        }
    }
    lazy1[nodeNum]=0; lazy2[nodeNum]=-INF;
}

void div(int L, int R, int x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    propagate(nodeNum, nodeL, nodeR);
    if(nodeR<L || R<nodeL) return;
    if(L<=nodeL && nodeR<=R) {
        int a = floor(arr[nodeNum].mn/(double)x);
        int b = floor(arr[nodeNum].mx/(double)x);
        if(a==b) {
            lazy2[nodeNum]=a;
            propagate(nodeNum, nodeL, nodeR);
            return;
        }
        if(arr[nodeNum].mn+1==arr[nodeNum].mx) {
            lazy1[nodeNum]=a-arr[nodeNum].mn;
            propagate(nodeNum, nodeL, nodeR);
            return;
        }
    }
    int mid = nodeL+nodeR>>1;
    div(L, R, x, nodeNum<<1, nodeL, mid);
    div(L, R, x, (nodeNum<<1)|1, mid+1, nodeR);
    arr[nodeNum] = merge(arr[nodeNum<<1], arr[(nodeNum<<1)|1]);
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
    add(L, R, x, nodeNum<<1, nodeL, mid);
    add(L, R, x, (nodeNum<<1)|1, mid+1, nodeR);
    arr[nodeNum] = merge(arr[(nodeNum<<1)], arr[(nodeNum<<1)|1]);
}

ll sumQuery(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    propagate(nodeNum, nodeL, nodeR);
    if(nodeR<L || R<nodeL) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum].sum;
    int mid=nodeL+nodeR>>1;
    return sumQuery(L, R, nodeNum<<1, nodeL, mid)+sumQuery(L, R, (nodeNum<<1)|1, mid+1, nodeR);
}

ll minQuery(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    propagate(nodeNum, nodeL, nodeR);
    if(nodeR<L || R<nodeL) return INF;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum].mn;
    int mid=nodeL+nodeR>>1;
    return min(minQuery(L, R, nodeNum<<1, nodeL, mid), minQuery(L, R, (nodeNum<<1)|1, mid+1, nodeR));
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, q; cin >> n >> q;
    SZ=1;
    while(SZ<n) SZ<<=1;
    fill(lazy2, lazy2+SZ*2, -INF);
    for(int i=SZ;i<SZ+n;i++) {
        int a; cin >> a;
        arr[i]={a, a, a};
    }
    for(int i=SZ+n;i<2*SZ;i++) arr[i]={INF, INF, INF};
    for(int i=SZ-1;i>0;i--) arr[i]=merge(arr[i*2], arr[i*2+1]);

    while(q--) {
        int op, l, r, c, d; cin >> op >> l >> r;
        if(op==1) {
            cin >> c;
            add(l, r, c);
        } else if(op==2) {
            cin >> d;
            div(l, r, d);
        } else if(op==3) {
            cout << minQuery(l, r) << '\n';
        } else {
            cout << sumQuery(l, r) << '\n';
        }
    }
}