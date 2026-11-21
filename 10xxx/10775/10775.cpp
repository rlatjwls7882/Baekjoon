#include<bits/stdc++.h>
using namespace std;

int _size=1;
int arr[400000] = {0, };
void construct() {
    for(int i=_size/2-1;i>0;i--) {
        arr[i] = max(arr[i*2], arr[i*2+1]);
    }
}

void update(int x) {
    x += _size/2;
    arr[x]=-1;
    while(x!=1) {
        x/=2;
        arr[x] = max(arr[x*2], arr[x*2+1]);
    }
}

int findMax(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return -1;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return max(findMax(L, R, nodeNum*2, nodeL, mid), findMax(L, R, nodeNum*2+1, mid+1, nodeR));
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int G, P; cin >> G >> P;
    while(_size<=G) {
        _size*=2;
    }
    _size*=2;

    for(int i=_size/2;i<_size/2+G;i++) {
        arr[i]=i-_size/2;
    }
    construct();

    int cnt=0;
    while(P-->0) {
        int g; cin >> g;
        int idx = findMax(0, g-1, 1, 0, _size/2-1);
        if(idx!=-1) {
            cnt++;
            update(idx);
        } else {
            break;
        }
    }
    cout << cnt;
}