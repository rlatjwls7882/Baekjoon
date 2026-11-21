#include<bits/stdc++.h>
#define MAX 300000

using namespace std;

int _size=1;
int arr[MAX] = {0, };
bool lazy[MAX] = {0, };

void updateLazy(int nodeNum, int nodeL, int nodeR) {
    if(lazy[nodeNum]) {
        if(nodeL!=nodeR) {
            lazy[nodeNum*2]^=lazy[nodeNum];
            lazy[nodeNum*2+1]^=lazy[nodeNum];
            int sum=0, size=(nodeR-nodeL+1)/2;
            if(lazy[nodeNum*2]) {
                sum += size-arr[nodeNum*2];
            } else {
                sum += arr[nodeNum*2];
            }
            if(lazy[nodeNum*2+1]) {
                sum += size-arr[nodeNum*2+1];
            } else {
                sum += arr[nodeNum*2+1];
            }
            arr[nodeNum]=sum;
        } else {
            arr[nodeNum]^=lazy[nodeNum];
        }
        lazy[nodeNum]=false;
    }
}

void updateRange(int L, int R, int nodeNum, int nodeL, int nodeR) {
    updateLazy(nodeNum, nodeL, nodeR);
    if(R<nodeL || nodeR<L) return;
    if(L<=nodeL && nodeR<=R) {
        lazy[nodeNum]^=true;
        updateLazy(nodeNum, nodeL, nodeR);
    } else {
        int mid = (nodeL+nodeR)/2;
        updateRange(L, R, nodeNum*2, nodeL, mid);
        updateRange(L, R, nodeNum*2+1, mid+1, nodeR);
        arr[nodeNum] = arr[nodeNum*2]+arr[nodeNum*2+1];
    }
}

int find(int L, int R, int nodeNum, int nodeL, int nodeR) {
    updateLazy(nodeNum, nodeL, nodeR);
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return find(L, R, nodeNum*2, nodeL, mid)+find(L, R, nodeNum*2+1, mid+1, nodeR);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    while(_size<=N) {
        _size<<=1;
    }
    _size<<=1;

    while(M-->0) {
        int a, i, j; cin >> a >> i >> j;
        if(a==0) {
            updateRange(i-1, j-1, 1, 0, _size/2-1);
        } else {
            cout << find(i-1, j-1, 1, 0, _size/2-1) << '\n';
        }
    }
}