#include<bits/stdc++.h>
#define MAX 300000

using namespace std;

int _size=1;
int maxArr[MAX] = {0, };
int minArr[MAX];

void construct() {
    for(int i=_size/2-1;i>0;i--) {
        maxArr[i] = max(maxArr[i*2], maxArr[i*2+1]);
        minArr[i] = min(minArr[i*2], minArr[i*2+1]);
    }
}

int findMin(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return 1000000000;
    if(L<=nodeL && nodeR<=R) return minArr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return min(findMin(L, R, nodeNum*2, nodeL, mid), findMin(L, R, nodeNum*2+1, mid+1, nodeR));
}

int findMax(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return maxArr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return max(findMax(L, R, nodeNum*2, nodeL, mid), findMax(L, R, nodeNum*2+1, mid+1, nodeR));
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    while(_size<=N) {
        _size*=2;
    }
    _size*=2;
    fill(minArr, minArr+_size, 1000000000);

    for(int i=_size/2;i<_size/2+N;i++) {
        cin >> maxArr[i];
        minArr[i] = maxArr[i];
    }
    construct();

    while(M-->0) {
        int a, b; cin >> a >> b;
        cout << findMin(a-1, b-1, 1, 0, _size/2-1) << " " << findMax(a-1, b-1, 1, 0, _size/2-1) << '\n';
    }
}