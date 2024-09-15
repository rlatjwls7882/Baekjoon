#include<bits/stdc++.h>
#define MAX 300000

using namespace std;
typedef long long ll;

int _size=1;
ll arr[MAX] = {0, };

void construct() {
    for(int i=_size/2-1;i>0;i--) {
        arr[i] = arr[i*2]+arr[i*2+1];
    }
}

void update(int i, int val) {
    i+=_size/2;
    arr[i]=val;
    while(i>1) {
        i>>=1;
        arr[i] = arr[i*2]+arr[i*2+1];
    }
}

ll sum(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return sum(L, R, nodeNum*2, nodeL, mid) + sum(L, R, nodeNum*2+1, mid+1, nodeR);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, Q; cin >> N >> Q;

    while(_size<=N) {
        _size<<=1;
    }
    _size<<=1;

    for(int i=_size/2;i<_size/2+N;i++) {
        cin >> arr[i];
    }
    construct();

    while(Q-->0) {
        int x, y, a, b; cin >> x >> y >> a >> b;
        if(x<y) {
            cout << sum(x-1, y-1, 1, 0, _size/2-1) << '\n';
        } else {
            cout << sum(y-1, x-1, 1, 0, _size/2-1) << '\n';
        }
        update(a-1, b);
    }
}