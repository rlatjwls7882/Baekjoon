#include<bits/stdc++.h>
#define MAX 2000000

using namespace std;

int _size=1;
int arr[MAX] = {0, };
int lazy[MAX] = {0, };

void construct() {
    for(int i=_size/2-1;i>0;i--) {
        arr[i] = arr[i*2]^arr[i*2+1];
    }
}

void lazyUpdate(int nodeL, int nodeR,int nodeNum) {
    if(lazy[nodeNum]) {
        if(nodeL!=nodeR) {
            lazy[nodeNum*2]^=lazy[nodeNum];
            lazy[nodeNum*2+1]^=lazy[nodeNum];
        } else {
            arr[nodeNum]^=lazy[nodeNum];
        }
        lazy[nodeNum]=0;
    }
}

void lazyRange(int L, int R, int nodeNum, int nodeL, int nodeR, int val) {
    lazyUpdate(nodeL, nodeR, nodeNum);
    if(R<nodeL || nodeR<L) return;
    if(L<=nodeL && nodeR<=R) {
        lazy[nodeNum]^=val;
        lazyUpdate(nodeL, nodeR, nodeNum);
    } else {
        int mid = (nodeL+nodeR)/2;
        lazyRange(L, R, nodeNum*2, nodeL, mid, val);
        lazyRange(L, R, nodeNum*2+1, mid+1, nodeR, val);
        arr[nodeNum]=arr[nodeNum*2]^arr[nodeNum*2+1];
    }
}

int find(int L, int R, int nodeNum, int nodeL, int nodeR) {
    lazyUpdate(nodeL, nodeR, nodeNum);
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return find(L, R, nodeNum*2, nodeL, mid)^find(L, R, nodeNum*2+1, mid+1, nodeR);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    while(_size<=n) {
        _size<<=1;
    }
    _size<<=1;
    
    for(int i=_size/2;i<_size/2+n;i++) {
        cin >> arr[i];
    }
    construct();
    
    int M; cin >> M;
    while(M-->0) {
        int t, a; cin >> t >> a;
        if(t==1) {
            int b, c; cin >> b >> c;
            lazyRange(a, b, 1, 0, _size/2-1, c);
        } else {
            cout << find(a, a, 1, 0, _size/2-1) << '\n';
        }
    }
}