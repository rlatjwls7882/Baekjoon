#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;

const ll LINF = 0x3f3f3f3f3f3f3f3f;

const int MAX = 2'000'000;

int SZ=1;

struct node {
    ll mx1, mx2, mxCnt, mn1, mn2, mnCnt, sum, lazy;
} arr[MAX];

node merge(node &a, node &b) {
    node ret = {max(a.mx1, b.mx1), max(a.mx2, b.mx2), a.mxCnt+b.mxCnt, min(a.mn1, b.mn1), min(a.mn2, b.mn2), a.mnCnt+b.mnCnt, a.sum+b.sum, 0};
    if(a.mx1>b.mx1) ret.mx2=max(a.mx2, b.mx1), ret.mxCnt=a.mxCnt;
    else if(a.mx1<b.mx1) ret.mx2=max(a.mx1, b.mx2), ret.mxCnt=b.mxCnt;
    if(a.mn1<b.mn1) ret.mn2=min(a.mn2, b.mn1), ret.mnCnt=a.mnCnt;
    else if(a.mn1>b.mn1) ret.mn2=min(a.mn1, b.mn2), ret.mnCnt=b.mnCnt;
    return ret;
}

void applyAdd(int i, ll x, int len) {
    arr[i].mn1+=x;
    if(arr[i].mn2!=LINF) arr[i].mn2+=x;
    arr[i].mx1+=x;
    if(arr[i].mx2!=-LINF) arr[i].mx2+=x;
    arr[i].sum+=len*x;
    arr[i].lazy+=x;
}

void applyMin(int i, ll x) {
    if(arr[i].mx1<=x) return;
    arr[i].sum-=(arr[i].mx1-x)*arr[i].mxCnt;
    if(arr[i].mx1==arr[i].mn1) arr[i].mn1=x;
    else if(arr[i].mx1==arr[i].mn2) arr[i].mn2=x;
    arr[i].mx1=x;
}

void applyMax(int i, ll x) {
    if(arr[i].mn1>=x) return;
    arr[i].sum-=(arr[i].mn1-x)*arr[i].mnCnt;
    if(arr[i].mn1==arr[i].mx1) arr[i].mx1=x;
    else if(arr[i].mn1==arr[i].mx2) arr[i].mx2=x;
    arr[i].mn1=x;
}

void propagate(int i, int l, int r) {
    if(i>=SZ) return;
    if(arr[i].lazy) {
        int mid=l+r>>1;
        applyAdd(i*2, arr[i].lazy, mid-l+1);
        applyAdd(i*2+1, arr[i].lazy, r-mid);
        arr[i].lazy=0;
    }
    for(int j:{i*2, i*2+1}) {
        if(arr[j].mx1>arr[i].mx1) applyMin(j, arr[i].mx1);
        if(arr[j].mn1<arr[i].mn1) applyMax(j, arr[i].mn1);
    }
}

void add(int L, int R, ll x, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeR<L || R<nodeL) return;
    if(L<=nodeL && nodeR<=R) {
        applyAdd(nodeNum, x, nodeR-nodeL+1);
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
        applyMin(nodeNum, x);
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
        applyMax(nodeNum, x);
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

ll minQuery(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeR<L || R<nodeL) return LINF;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum].mn1;
    propagate(nodeNum, nodeL, nodeR);
    int mid=nodeL+nodeR>>1;
    return min(minQuery(L, R, nodeNum*2, nodeL, mid), minQuery(L, R, nodeNum*2+1, mid+1, nodeR));
}

ll maxQuery(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=SZ-1) {
    if(nodeR<L || R<nodeL) return -LINF;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum].mx1;
    propagate(nodeNum, nodeL, nodeR);
    int mid=nodeL+nodeR>>1;
    return max(maxQuery(L, R, nodeNum*2, nodeL, mid), maxQuery(L, R, nodeNum*2+1, mid+1, nodeR));
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    while(SZ<n) SZ<<=1;
    for(int i=SZ;i<SZ+n;i++) {
        int a; cin >> a;
        arr[i] = {a, -LINF, 1, a, LINF, 1, a};
    }
    for(int i=SZ+n;i<2*SZ;i++) arr[i] = {-LINF, -LINF, 0, LINF, LINF, 0, 0};
    for(int i=SZ-1;i>0;i--) arr[i]=merge(arr[i*2], arr[i*2+1]);

    int m; cin >> m;
    while(m--) {
        int op, l, r, x; cin >> op >> l >> r;
        if(op==1) {
            cin >> x;
            setMin(l-1, r-1, x);
        } else if(op==2) {
            cin >> x;
            setMax(l-1, r-1, x);
        } else if(op==3) {
            cin >> x;
            add(l-1, r-1, x);
        } else if(op==4) {
            cout << minQuery(l-1, r-1) << '\n';
        } else if(op==5) {
            cout << maxQuery(l-1, r-1) << '\n';
        } else {
            cout << sumQuery(l-1, r-1) << '\n';
        }
    }
}