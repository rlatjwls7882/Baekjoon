#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 600'001*4;

ll _size=1, segMin[MAX], segMax[MAX], lazyMin[MAX], lazyMax[MAX];

void updateLazy(int nodeNum, int nodeL, int nodeR) {
    if(lazyMin[nodeNum]) {
        segMin[nodeNum] += lazyMin[nodeNum];
        segMax[nodeNum] += lazyMax[nodeNum];
        if(nodeL!=nodeR) {
            lazyMin[nodeNum*2] += lazyMin[nodeNum];
            lazyMin[nodeNum*2+1] += lazyMin[nodeNum];
            lazyMax[nodeNum*2] += lazyMax[nodeNum];
            lazyMax[nodeNum*2+1] += lazyMax[nodeNum];
        }
        lazyMin[nodeNum]=lazyMax[nodeNum]=0;
    }
}

void updateRange(int L, int R, ll val, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    updateLazy(nodeNum, nodeL, nodeR);
    if(R<nodeL || nodeR<L) return;
    if(L<=nodeL && nodeR<=R) {
        lazyMin[nodeNum] = lazyMax[nodeNum] = val;
        updateLazy(nodeNum, nodeL, nodeR);
    } else {
        int mid = nodeL+nodeR>>1;
        updateRange(L, R, val, nodeNum*2, nodeL, mid);
        updateRange(L, R, val, nodeNum*2+1, mid+1, nodeR);
        segMin[nodeNum] = min(segMin[nodeNum*2], segMin[nodeNum*2+1]);
        segMax[nodeNum] = max(segMax[nodeNum*2], segMax[nodeNum*2+1]);
    }
}

ll searchMin(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    updateLazy(nodeNum, nodeL, nodeR);
    if(R<nodeL || nodeR<L) return LONG_LONG_MAX;
    if(L<=nodeL && nodeR<=R) return segMin[nodeNum];
    int mid = nodeL+nodeR>>1;
    return min(searchMin(L, R, nodeNum*2, nodeL, mid), searchMin(L, R, nodeNum*2+1, mid+1, nodeR));
}

ll searchMax(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    updateLazy(nodeNum, nodeL, nodeR);
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return segMax[nodeNum];
    int mid = nodeL+nodeR>>1;
    return max(searchMax(L, R, nodeNum*2, nodeL, mid), searchMax(L, R, nodeNum*2+1, mid+1, nodeR));
}

struct element {
    char ch; ll l, p;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<element> v(n);
    vector<ll> vals;
    for(int i=0;i<n;i++) {
        cin >> v[i].ch >> v[i].l >> v[i].p;
        vals.push_back(v[i].p);
        if(v[i].ch=='-') {
            vals.push_back(v[i].p+v[i].l-1);
            vals.push_back(v[i].p+v[i].l);
        }
        else vals.push_back(v[i].p+1);
    }
    sort(vals.begin(), vals.end());
    vals.erase(unique(vals.begin(), vals.end()), vals.end());

    while(_size<vals.size()) _size<<=1;
    _size<<=1;

    for(auto [ch, l, p] : v) {
        int lo = lower_bound(vals.begin(), vals.end(), p)-vals.begin();
        if(ch=='|') {
            cout << 'S';
            updateRange(lo, lo, l);
        } else {
            int hi = lower_bound(vals.begin(), vals.end(), p+l-1)-vals.begin();
            if(searchMin(lo, hi)!=searchMax(lo, hi)) {
                cout << 'U';
            } else {
                cout << 'S';
                updateRange(lo, hi, 1);
            }
        }
    }
}