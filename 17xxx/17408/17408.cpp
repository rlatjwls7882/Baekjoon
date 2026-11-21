#include<bits/stdc++.h>
using namespace std;

typedef pair<int, int> pii;
const int MAX = 100'000*4;

int _size=1;
pii arr[MAX];

pii makePair(pii a, pii b) {
    pii ret;
    ret.first = max(a.first, b.first);
    ret.second = max({min(a.first, b.first), a.second, b.second});
    return ret;
}

void update(int i, int val) {
    i += _size/2;
    arr[i].first=val;
    while(i>1) {
        i>>=1;
        arr[i] = makePair(arr[i*2], arr[i*2+1]);
    }
}

pii query(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return {-1, -1};
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = nodeL+nodeR>>1;
    return makePair(query(L, R, nodeNum*2, nodeL, mid), query(L, R, nodeNum*2+1, mid+1, nodeR));
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(_size<n) _size<<=1;
    _size<<=1;

    for(int i=_size/2;i<_size/2+n;i++) {
        cin >> arr[i].first;
        arr[i].second=-1;
    }
    for(int i=_size/2-1;i>0;i--) {
        arr[i] = makePair(arr[i*2], arr[i*2+1]);
    }

    int m; cin >> m;
    while(m--) {
        int a, b, c; cin >> a >> b >> c;
        if(a==1) {
            update(b-1, c);
        } else {
            pii ret = query(b-1, c-1);
            cout << ret.first + ret.second << '\n';
        }
    }
}