#include<bits/stdc++.h>
#define MAX 300000
#define INF 1000000000

using namespace std;

int _size=1;
int arr[MAX];

void construct() {
    for(int i=_size/2-1;i>0;i--) {
        arr[i] = min(arr[i*2], arr[i*2+1]);
    }
}

int findMin(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return INF;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return min(findMin(L, R, nodeNum*2, nodeL, mid), findMin(L, R, nodeNum*2+1, mid+1, nodeR));
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    
    while(_size<=N) {
        _size*=2;
    }
    _size*=2;
    
    fill(arr, arr+_size, INF);
    for(int i=_size/2;i<_size/2+N;i++) {
        cin >> arr[i];
    }
    construct();
    
    while(M-->0) {
        int a, b; cin >> a >> b;
        cout << findMin(a-1, b-1, 1, 0, _size/2-1) << '\n';
    }
}