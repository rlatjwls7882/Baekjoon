#include<bits/stdc++.h>
#define MAX 3000000

using namespace std;
typedef long long ll;

int _size=1;
ll arr[MAX] = {0, };

void update(int idx, int val) {
    idx+=_size/2;
    arr[idx]=val;
    while(idx>1) {
        idx>>=1;
        arr[idx] = arr[idx*2]+arr[idx*2+1];
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
    int N, M; cin >> N >> M;

    while(_size<=N) {
        _size<<=1;
    }
    _size<<=1;

    while(M-->0) {
        int a, b, c; cin >> a >> b >> c;
        if(a==0) {
            if(b>c) {
                cout << sum(c-1, b-1, 1, 0, _size/2-1) << '\n';
            } else {
                cout << sum(b-1, c-1, 1, 0, _size/2-1) << '\n';
            }
        } else {
            update(b-1, c);
        }
    }
}