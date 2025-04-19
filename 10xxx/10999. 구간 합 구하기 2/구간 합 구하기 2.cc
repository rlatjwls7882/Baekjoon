/** https://www.acmicpc.net/problem/10999 제출 코드 */
#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 3'000'000;
int _size=1;
ll arr[MAX], lazy[MAX];

void construct(int N) {
    while(_size<N) _size<<=1;
    _size<<=1;

    for(int i=_size/2;i<_size/2+N;i++) cin >> arr[i];
    for(int i=_size/2-1;i>0;i--) arr[i]=arr[i*2]+arr[i*2+1];
}

void updateLazy(int nodeNum, int nodeL, int nodeR) {
    if(lazy[nodeNum]) {
        arr[nodeNum] += (nodeR-nodeL+1)*lazy[nodeNum];
        if(nodeL!=nodeR) {
            lazy[nodeNum*2] += lazy[nodeNum];
            lazy[nodeNum*2+1] += lazy[nodeNum];
        }
        lazy[nodeNum]=0;
    }
}

void updateRange(int L, int R, int nodeNum, int nodeL, int nodeR, ll val) {
    updateLazy(nodeNum, nodeL, nodeR);
    if(R<nodeL || nodeR<L) return;
    if(L<=nodeL && nodeR<=R) {
        lazy[nodeNum] += val;
        updateLazy(nodeNum, nodeL, nodeR);
        return;
    }
    int mid = (nodeL+nodeR)/2;
    updateRange(L, R, nodeNum*2, nodeL, mid, val);
    updateRange(L, R, nodeNum*2+1, mid+1, nodeR, val);
    arr[nodeNum] = arr[nodeNum*2] + arr[nodeNum*2+1];
}

ll search(int L, int R, int nodeNum, int nodeL, int nodeR) {
    updateLazy(nodeNum, nodeL, nodeR);
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return search(L, R, nodeNum*2, nodeL, mid) + search(L, R, nodeNum*2+1, mid+1, nodeR);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, K; cin >> N >> M >> K;
    construct(N);

    for(int i=0;i<M+K;i++) {
        int a, b, c; cin >> a >> b >> c;
        if(a==1) {
            ll d; cin >> d;
            updateRange(b-1, c-1, 1, 0, _size/2-1, d);
        } else {
            cout << search(b-1, c-1, 1, 0, _size/2-1) << '\n';
        }
    }
}