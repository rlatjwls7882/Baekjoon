#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;

const ll LINF = 0x3f3f3f3f3f3f3f3f;

const int MAX = 2'000'000;

int SZ=1;

struct node {
    ll mx1, mx2, mxCnt, mn1, mn2, mnCnt, sum, lazy, lazyAdd, lazyMx, lazyMn;
} arr[MAX];

node merge(node &a, node &b) {
    node ret = {max(a.mx1, b.mx1), max(a.mx2, b.mx2), a.mxCnt+b.mxCnt, min(a.mn1, b.mn1), min(a.mn2, b.mn2), a.mnCnt+b.mnCnt, a.sum+b.sum};
    if(a.mx1>b.mx1) ret.mx2=max(a.mx2, b.mx1), ret.mxCnt=a.mxCnt;
    else if(a.mx1<b.mx1) ret.mx2=max(a.mx1, b.mx2), ret.mxCnt=b.mxCnt;
    if(a.mn1<b.mn1) ret.mn2=min(a.mn2, b.mn1), ret.mnCnt=a.mnCnt;
    else if(a.mn1>b.mn1) ret.mn2=min(a.mn1, b.mn2), ret.mnCnt=b.mnCnt;
    return ret;
}

void applyAdd(int i, ll x) {
    arr[i].lazy+=x;
    arr[i].mn1+=x;
    if(arr[i].mn2!=LINF) arr[i].mn2+=x;
    arr[i].mx1+=x;
    if(arr[i].mx2!=-LINF) arr[i].mx2+=x;
}

void applyMin(int nodeNum, int len, ll x) {
    arr[nodeNum].mx1=x;
    arr[nodeNum].mn1=min(arr[nodeNum].mn1, x);
    if(arr[nodeNum].mx1==arr[nodeNum].mn1) {
        arr[nodeNum].mn2=LINF;
        arr[nodeNum].mx2=-LINF;
        arr[nodeNum].mxCnt=arr[nodeNum].mnCnt=len;
    } else {
        arr[nodeNum].mn2=min(arr[nodeNum].mn2, x);
    }
}

void applyMax(int nodeNum, int len, ll x) {
    arr[nodeNum].mx1=max(arr[nodeNum].mx1, x);
    arr[nodeNum].mn1=x;
    if(arr[nodeNum].mn1==arr[nodeNum].mx1) {
        arr[nodeNum].mn2=LINF;
        arr[nodeNum].mx2=-LINF;
        arr[nodeNum].mxCnt=arr[nodeNum].mnCnt=len;
    } else {
        arr[nodeNum].mx2=max(arr[nodeNum].mx2, x);
    }
}

void cnt(int i, int j, int l, int r) {
    if(arr[i].mx1==arr[j].mx1) {
        arr[j].sum+=arr[j].mxCnt*arr[i].lazyMx;
        arr[j].lazyMx+=arr[i].lazyMx;
    }
    if(arr[i].mn1==arr[j].mn1) {
        arr[j].sum+=arr[j].mnCnt*arr[i].lazyMn;
        arr[j].lazyMn+=arr[i].lazyMn;
    }
    arr[j].sum+=arr[i].lazyAdd*(r-l+1);
    arr[j].lazyAdd+=arr[i].lazyAdd;
}

void propagate(int i, int l, int r) {
    if(i>=SZ) return;
    int mid=l+r>>1;
    if(arr[i].lazy) {
        applyAdd(i*2, arr[i].lazy);
        applyAdd(i*2+1, arr[i].lazy);
        arr[i].lazy=0;
    }
    if(arr[i*2].mx1>arr[i].mx1 && arr[i].mx1>arr[i*2].mx2) applyMin(i*2, mid-l+1, arr[i].mx1);
    if(arr[i*2].mn1<arr[i].mn1 && arr[i].mn1<arr[i*2].mn2) applyMax(i*2, mid-l+1, arr[i].mn1);
    if(arr[i*2+1].mx1>arr[i].mx1 && arr[i].mx1>arr[i*2+1].mx2) applyMin(i*2+1, r-mid, arr[i].mx1);
    if(arr[i*2+1].mn1<arr[i].mn1 && arr[i].mn1<arr[i*2+1].mn2) applyMax(i*2+1, r-mid, arr[i].mn1);
    if(arr[i].lazyAdd || arr[i].lazyMn || arr[i].lazyMx) {
        cnt(i, i*2, l, mid);
        cnt(i, i*2+1, mid+1, r);
        arr[i].lazyAdd=arr[i].lazyMx=arr[i].lazyMn=0;
    }
}

void add(int L, int R, ll x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeR<L || R<nodeL) return;
    if(L<=nodeL && nodeR<=R) {
        applyAdd(nodeNum, x);
        arr[nodeNum].sum+=(nodeR-nodeL+1);
        arr[nodeNum].lazyAdd++;
        return;
    }
    propagate(nodeNum, nodeL, nodeR);
    int mid=nodeL+nodeR>>1;
    add(L, R, x, nodeNum*2, nodeL, mid);
    add(L, R, x, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum]=merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

void setMin(int L, int R, ll x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeR<L || R<nodeL || arr[nodeNum].mx1<=x) return;
    if(L<=nodeL && nodeR<=R && arr[nodeNum].mx2<x) {
        applyMin(nodeNum, nodeR-nodeL+1, x);
        arr[nodeNum].sum+=arr[nodeNum].mxCnt;
        arr[nodeNum].lazyMx++;
        return;
    }
    propagate(nodeNum, nodeL, nodeR);
    int mid=nodeL+nodeR>>1;
    setMin(L, R, x, nodeNum*2, nodeL, mid);
    setMin(L, R, x, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum]=merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

void setMax(int L, int R, ll x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeR<L || R<nodeL || arr[nodeNum].mn1>=x) return;
    if(L<=nodeL && nodeR<=R && arr[nodeNum].mn2>x) {
        applyMax(nodeNum, nodeR-nodeL+1, x);
        arr[nodeNum].sum+=arr[nodeNum].mnCnt;
        arr[nodeNum].lazyMn++;
        return;
    }
    propagate(nodeNum, nodeL, nodeR);
    int mid=nodeL+nodeR>>1;
    setMax(L, R, x, nodeNum*2, nodeL, mid);
    setMax(L, R, x, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum]=merge(arr[nodeNum*2], arr[nodeNum*2+1]);
}

ll sumQuery(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeR<L || R<nodeL) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum].sum;
    propagate(nodeNum, nodeL, nodeR);
    int mid=nodeL+nodeR>>1;
    return sumQuery(L, R, nodeNum*2, nodeL, mid)+sumQuery(L, R, nodeNum*2+1, mid+1, nodeR);
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    while(SZ<n) SZ<<=1;
    for(int i=SZ;i<SZ+n;i++) {
        int a; cin >> a;
        arr[i] = {a, -LINF, 1, a, LINF, 1, 0};
    }
    for(int i=SZ+n;i<2*SZ;i++) arr[i] = {-LINF, -LINF, 0, LINF, LINF, 0};
    for(int i=SZ-1;i>0;i--) arr[i]=merge(arr[i*2], arr[i*2+1]);

    int m; cin >> m;
    while(m--) {
        int op, l, r, x; cin >> op >> l >> r;
        if(op==1) {
            cin >> x;
            if(x) add(l-1, r-1, x);
        } else if(op==2) {
            cin >> x;
            setMax(l-1, r-1, x);
        } else if(op==3) {
            cin >> x;
            setMin(l-1, r-1, x);
        } else {
            cout << sumQuery(l-1, r-1) << '\n';
        }
    }
}