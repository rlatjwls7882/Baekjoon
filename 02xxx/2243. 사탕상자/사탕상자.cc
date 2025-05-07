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

int getSum(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return getSum(L, R, nodeNum*2, nodeL, mid) + getSum(L, R, nodeNum*2+1, mid+1, nodeR);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    init();

    while(n--) {
        int a, b; cin >> a >> b;
        if(a==1) {
            int left=0, right=MAX-1;
            while(left<right) {
                int mid = (left+right)/2;
                int sum = getSum(left, mid);
                if(sum<b) {
                    left=mid+1;
                    b -= sum;
                } else {
                    right=mid;
                }
            }
            cout << left+1 << '\n';
            update(left, -1);
        } else {
            int c; cin >> c;
            update(b-1, c);
        }
    }
}