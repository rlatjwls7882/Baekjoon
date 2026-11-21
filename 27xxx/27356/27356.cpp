#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;

const ll LINF = 0x3f3f3f3f3f3f3f3f;
const int MAX = 1'200'000;
int SZ=1;

struct node {
    ll mx1, mx2, mxCnt, sum;
} arr[MAX];

node merge(node a, node b) {
    if(a.mx1==b.mx1) return {max(a.mx1, b.mx1), max(a.mx2, b.mx2), a.mxCnt+b.mxCnt, a.sum+b.sum};
    if(a.mx1<b.mx1) swap(a, b);
    return {a.mx1, max(a.mx2, b.mx1), a.mxCnt, a.sum+b.sum};
}

void propagate(int i) {
    if(i>=SZ) return;
    for(int j:{i*2, i*2+1}) {
        if(arr[i].mx1<arr[j].mx1) {
            arr[j].sum-=(arr[j].mx1-arr[i].mx1)*arr[j].mxCnt;
            arr[j].mx1=arr[i].mx1;
        }
    }
}

void setMin(int L, int R, ll x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeR<L || R<nodeL || arr[nodeNum].mx1<=x) return;
    if(L<=nodeL && nodeR<=R && x>arr[nodeNum].mx2) {
        arr[nodeNum].sum-=(arr[nodeNum].mx1-x)*arr[nodeNum].mxCnt;
        arr[nodeNum].mx1=x;
        return;
    }
    propagate(nodeNum);
    int mid=nodeL+nodeR>>1;
    setMin(L, R, x, nodeNum*2, nodeL, mid);
    setMin(L, R, x, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum]=merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

void point(int idx, ll x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeL==nodeR) {
        arr[nodeNum]={x, -LINF, 1, x};
        return;
    }
    propagate(nodeNum);
    int mid=nodeL+nodeR>>1;
    if(idx<=mid) point(idx, x, nodeNum*2, nodeL, mid);
    else point(idx, x, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum]=merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

ll query(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeR<L || R<nodeL) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum].sum;
    propagate(nodeNum);
    int m=nodeL+nodeR>>1;
    return query(L, R, nodeNum*2, nodeL, m)+query(L, R, nodeNum*2+1, m+1, nodeR);
}

node parNode(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeR<L || R<nodeL) return {-LINF, -LINF, 0, 0};
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    propagate(nodeNum);
    int m=nodeL+nodeR>>1;
    return merge(parNode(L, R, nodeNum*2, nodeL, m), parNode(L, R, nodeNum*2+1, m+1, nodeR));
}

ll cnt(int L, int R, ll x, ll k, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeR<L || R<nodeL || arr[nodeNum].mx1<k) return 0;
    if(L<=nodeL && nodeR<=R && arr[nodeNum].mx1==k) return arr[nodeNum].mxCnt;
    if(nodeL==nodeR) return arr[nodeNum].mx1==k;
    propagate(nodeNum);
    int m=nodeL+nodeR>>1;
    return cnt(L, R, x, k, nodeNum*2, nodeL, m) + cnt(L, R, x, k, nodeNum*2+1, m+1, nodeR);
}

ll pos(int L, int R, ll x, ll k, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeL==nodeR) return nodeL;
    propagate(nodeNum);
    int m=nodeL+nodeR>>1;
    int mxCnt = cnt(L, R, x, k, nodeNum*2, nodeL, m);
    if(mxCnt>=x) return pos(L, R, x, k, nodeNum*2, nodeL, m);
    else return pos(L, R, x-mxCnt, k, nodeNum*2+1, m+1, nodeR);
}

void initialise(int n, int q, int h[]) {
    while(SZ<n) SZ<<=1;
    for(int i=SZ;i<SZ+n;i++) arr[i]={h[i-SZ+1], -LINF, 1, h[i-SZ+1]};
    for(int i=SZ+n;i<SZ*2;i++) arr[i]={-LINF, -LINF, 0, 0};
    for(int i=SZ-1;i>0;i--) arr[i]=merge(arr[i*2], arr[i*2+1]);
}

void cut(int l, int r, int k) {
    while(k) {
        node cur = parNode(l-1, r-1);
        if(!cur.mx1) break;

        ll mx1 = cur.mx1;
        ll mx2 = max(0LL, cur.mx2);
        ll cnt = cur.mxCnt;
        ll need=(mx1-mx2)*cnt;
        if(k>=need) {
            k-=need;
            setMin(l-1, r-1, mx2);
        } else {
            mx1-=k/cnt;
            setMin(l-1, r-1, mx1);
            k%=cnt;
            if(k) {
                ll m = pos(l-1, r-1, k, mx1);
                setMin(l-1, m, mx1-1);
            }
            break;
        }
    }
}

void magic(int i, int x) {
    point(i-1, x);
}

ll inspect(int l, int r) {
    return query(l-1, r-1);
}