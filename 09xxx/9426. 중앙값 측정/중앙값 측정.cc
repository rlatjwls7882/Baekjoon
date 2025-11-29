#include<bits/stdc++.h>
using namespace std;

int _size=1, a[250'000], arr[65536*4];

void update(int i, int val) {
    i+=_size;
    arr[i]+=val;
    while(i>1) {
        i>>=1;
        arr[i] = arr[i*2]+arr[i*2+1];
    }
}

int query(int k) {
    int nodeNum=1;
    while(nodeNum<_size) {
        nodeNum<<=1;
        if(k>arr[nodeNum]) {
            k-=arr[nodeNum];
            nodeNum++;
        }
    }
    return nodeNum-_size;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    while(_size<65536) _size<<=1;

    long long sum=0;
    for(int i=0;i<n;i++) {
        cin >> a[i];
        update(a[i], 1);
        if(i>=k) update(a[i-k], -1);
        if(i+1>=k) sum += query((k+1)/2);
    }
    cout << sum;
}