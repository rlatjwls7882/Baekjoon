#include<bits/stdc++.h>
#define MAX 3000001

using namespace std;
typedef long long ll;

int _size=1;
ll arr[MAX];
ll MOD = 1000000007;

void construct() {
    for(int i=_size/2-1;i>0;i--) {
        arr[i] = arr[i*2]*arr[i*2+1]%MOD;
    }
}

void update(int i, ll val) {
    i+=_size/2;
    arr[i]=val;
    while(i>1) {
        i/=2;
        arr[i] = arr[i*2]*arr[i*2+1]%MOD;
    }
}

ll mult(int nodeNum, int nodeL, int nodeR, int L, int R) {
    if(R<nodeL || nodeR<L) return 1;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return mult(nodeNum*2, nodeL, mid, L, R)*mult(nodeNum*2+1, mid+1, nodeR, L, R)%MOD;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, K; cin >> N >> M >> K;

    while(_size<N) {
        _size*=2;
    }
    _size*=2;

    fill(arr, arr+_size, 1);

    for(int i=_size/2;i<_size/2+N;i++) {
        cin >> arr[i];
    }

    construct();
    for(int i=0;i<M+K;i++) {
        ll a, b, c; cin >> a >> b >> c;
        if(a==1) {
            update(b-1, c);
        } else {
            cout << mult(1, 0, _size/2-1, b-1, c-1) << endl;
        }
    }
}