#include<bits/stdc++.h>
using namespace std;

const int MAX = 300'000;
int _size=1, arr[MAX];

void update(int nodeNum) {
    arr[nodeNum]--;
    while(nodeNum>1) {
        nodeNum>>=1;
        arr[nodeNum] = arr[nodeNum*2] + arr[nodeNum*2+1];
    }
}

int search(int nodeNum, int nodeL, int nodeR, int k) {
    if(nodeL==nodeR) {
        update(nodeNum);
        return nodeL+1;
    }
    int mid = (nodeL+nodeR)/2;
    if(k<=arr[nodeNum*2])return search(nodeNum*2, nodeL, mid, k);
    return search(nodeNum*2+1, mid+1, nodeR, k-arr[nodeNum*2]);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    while(_size<n) _size<<=1;
    _size<<=1;

    for(int i=_size/2;i<_size/2+n;i++) arr[i]=1;
    for(int i=_size/2-1;i>0;i--) arr[i] = arr[i*2]+arr[i*2+1];

    int last=1;
    for(int i=1;i<=n;i++) {
        if(i==1) cout << "<";
        else cout << ", ";

        int next = (last-2+k)%arr[1]+1;
        cout << search(1, 0, _size/2-1, next);
        last = next;

        if(i==n) cout << ">";
    }
}