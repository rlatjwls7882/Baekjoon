#include<bits/stdc++.h>
using namespace std;

const int MAX = 1'000'001;

int _size=1;
int idx[MAX], arr[MAX*4];

void update(int i) {
    i += _size/2;
    arr[i]++;
    while(i>1) {
        i>>=1;
        arr[i] = arr[i*2]+arr[i*2+1];
    }
}

int search(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return search(L, R, nodeNum*2, nodeL, mid) + search(L, R, nodeNum*2+1, mid+1, nodeR);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) {
        int num; cin >> num;
        idx[num]=i;
    }
    while(_size<MAX) _size<<=1;
    _size<<=1;

    long long cnt=0;
    for(int i=_size/2;i<_size/2+n;i++) {
        int num; cin >> num;
        cnt += search(idx[num], _size/2-1);
        update(idx[num]);
    }
    cout << cnt;
}