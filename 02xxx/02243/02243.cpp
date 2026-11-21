#include<bits/stdc++.h>
using namespace std;

const int MAX = 1'000'000;

int _size, arr[MAX*4];

void init() {
    _size=1;
    while(_size<MAX) _size<<=1;
    _size<<=1;
}

void update(int quality, int val) {
    int nodeNum = _size/2+quality;
    arr[nodeNum] += val;
    while(nodeNum>1) {
        nodeNum/=2;
        arr[nodeNum] = arr[nodeNum*2] + arr[nodeNum*2+1];
    }
}

void findCandy(int nodeNum, int nodeL, int nodeR, int k) {
    if(nodeL==nodeR) {
        cout << nodeL+1 << '\n';
        update(nodeL, -1);
        return;
    }
    int mid = (nodeL+nodeR)/2;
    if(k>arr[nodeNum*2]) findCandy(nodeNum*2+1, mid+1, nodeR, k-arr[nodeNum*2]);
    else findCandy(nodeNum*2, nodeL, mid, k);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    init();

    while(n--) {
        int a, b; cin >> a >> b;
        if(a==1) {
            findCandy(1, 0, _size/2-1, b);
        } else {
            int c; cin >> c;
            update(b-1, c);
        }
    }
}