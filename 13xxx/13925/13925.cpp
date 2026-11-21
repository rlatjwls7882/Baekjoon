#include<bits/stdc++.h>
#define MAX 300000
using namespace std;
typedef long long ll;
const long long MOD = 1000000007;

int _size=1;
ll arr[MAX] = {0, };
ll lazyMul[MAX];
ll lazySum[MAX] = {0, };

void construct() {
    for(int i=_size/2-1;i>0;i--) {
        arr[i] = (arr[i*2]+arr[i*2+1])%MOD;
    }
}

void updateLazy(int nodeL, int nodeR, int nodeNum) {
    if(lazyMul[nodeNum]!=1 || lazySum[nodeNum]) {
        arr[nodeNum] = (arr[nodeNum]*lazyMul[nodeNum]%MOD+lazySum[nodeNum]*(nodeR-nodeL+1))%MOD;
        if(nodeL!=nodeR) {
            lazyMul[nodeNum*2] = lazyMul[nodeNum*2]*lazyMul[nodeNum]%MOD;
            lazySum[nodeNum*2] = (lazySum[nodeNum*2]*lazyMul[nodeNum]%MOD+lazySum[nodeNum])%MOD;
            lazyMul[nodeNum*2+1] = lazyMul[nodeNum*2+1]*lazyMul[nodeNum]%MOD;
            lazySum[nodeNum*2+1] = (lazySum[nodeNum*2+1]*lazyMul[nodeNum]%MOD+lazySum[nodeNum])%MOD;
        }
        lazyMul[nodeNum]=1;
        lazySum[nodeNum]=0;
    }
}

void updateRange(int L, int R, int nodeNum, int nodeL, int nodeR, ll mul, ll add) {
    updateLazy(nodeL, nodeR, nodeNum);
    if(R<nodeL || nodeR<L) return;
    if(L<=nodeL && nodeR<=R) {
        lazyMul[nodeNum] = lazyMul[nodeNum]*mul%MOD;
        lazySum[nodeNum] = (lazySum[nodeNum]*mul%MOD+add)%MOD;
        updateLazy(nodeL, nodeR, nodeNum);
        return;
    }
    int mid = (nodeL+nodeR)/2;
    updateRange(L, R, nodeNum*2, nodeL, mid, mul, add);
    updateRange(L, R, nodeNum*2+1, mid+1, nodeR, mul, add);
    arr[nodeNum] = (arr[nodeNum*2]+arr[nodeNum*2+1])%MOD;
}

ll searchVal(int L, int R, int nodeNum, int nodeL, int nodeR) {
    updateLazy(nodeL, nodeR, nodeNum);
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return (searchVal(L, R, nodeNum*2, nodeL, mid) + searchVal(L, R, nodeNum*2+1, mid+1, nodeR))%MOD;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    while(_size<N) {
        _size*=2;
    }
    _size*=2;

    for(int i=_size/2;i<_size/2+N;i++) {
        cin >> arr[i];
        arr[i]%=MOD;
    }
    construct();
    fill(lazyMul, lazyMul+_size, 1);

    int M; cin >> M;
    while(M-->0) {
        int a; cin >> a;
        if(a==1) {
            int x, y, v; cin >> x >> y >> v;
            updateRange(x-1, y-1, 1, 0, _size/2-1, 1, v%MOD);
        } else if(a==2) {
            int x, y, v; cin >> x >> y >> v;
            updateRange(x-1, y-1, 1, 0, _size/2-1, v%MOD, 0);
        } else if(a==3) {
            int x, y, v; cin >> x >> y >> v;
            updateRange(x-1, y-1, 1, 0, _size/2-1, 0, v%MOD);
        } else {
            int x, y; cin >> x >> y;
            cout << searchVal(x-1, y-1, 1, 0, _size/2-1) << '\n';
        }
    }
}