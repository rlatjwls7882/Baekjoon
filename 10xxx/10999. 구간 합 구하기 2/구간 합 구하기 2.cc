#include<bits/stdc++.h>
#define MAX 3000000

using namespace std;

int _size=1;
typedef long long ll;
ll arr[MAX] = {0, };
ll lazy[MAX] = {0, };

void construct() {
    for(int i=_size/2-1;i>0;i--) {
        arr[i]=arr[i*2]+arr[i*2+1];
    }
}

void updateLazy(int nodeL, int nodeR, int nodeNum) {
    if(lazy[nodeNum]!=0) {
        arr[nodeNum] += (nodeR-nodeL+1)*lazy[nodeNum];
        if(nodeL!=nodeR) {
            lazy[nodeNum*2]+=lazy[nodeNum];
            lazy[nodeNum*2+1]+=lazy[nodeNum];
        }
        lazy[nodeNum]=0;
    }
}

void updateRange(int L, int R, int nodeNum, int nodeL, int nodeR, ll val) {
    updateLazy(nodeL, nodeR, nodeNum);
    if(R<nodeL || nodeR<L) return;
    if(L<=nodeL && nodeR<=R) {
        arr[nodeNum] += (nodeR-nodeL+1)*val;
        if(nodeL!=nodeR) {
            lazy[nodeNum*2]+=val;
            lazy[nodeNum*2+1]+=val;
        }
    } else {
        int mid = (nodeL+nodeR)/2;
        updateRange(L, R, nodeNum*2, nodeL, mid, val);
        updateRange(L, R, nodeNum*2+1, mid+1, nodeR, val);
        arr[nodeNum]=arr[nodeNum*2]+arr[nodeNum*2+1];
    }
}

ll find(int L, int R, int nodeNum, int nodeL, int nodeR) {
    updateLazy(nodeL, nodeR, nodeNum);
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return find(L, R, nodeNum*2, nodeL, mid)+find(L, R, nodeNum*2+1, mid+1, nodeR);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, K; cin >> N >> M >> K;
    while(_size<=N) {
        _size<<=1;
    }
    _size<<=1;

    for(int i=_size/2;i<_size/2+N;i++) {
        cin >> arr[i];
    }
    construct();

    for(int i=0;i<M+K;i++) {
        int a, b, c; cin >> a >> b >> c;
        if(a==1) {
            ll d; cin >> d;
            updateRange(b-1, c-1, 1, 0, _size/2-1, d);
        } else {
            cout << find(b-1, c-1, 1, 0, _size/2-1) << '\n';
        }
    }
}