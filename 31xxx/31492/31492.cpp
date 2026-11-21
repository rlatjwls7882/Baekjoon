#include<bits/stdc++.h>
using namespace std;

const int MAX = 4'000'001;
int a[MAX], _size=1, arr[MAX*4];

void update(int x) {
    arr[x]=0;
    while(x>1) {
        x>>=1;
        arr[x] = arr[x*2]+arr[x*2+1];
    }
}

int search(int val, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(nodeL==nodeR) {
        update(nodeNum);
        return nodeL+1;
    }
    int mid = nodeL+nodeR>>1;
    if(val<=arr[nodeNum*2]) return search(val, nodeNum*2, nodeL, mid);
    return search(val-arr[nodeNum*2], nodeNum*2+1, mid+1, nodeR);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(_size<n) _size<<=1;
    _size<<=1;
    for(int i=0;i<n;i++) arr[i+_size/2]=1;
    for(int i=_size/2-1;i>0;i--) arr[i] = arr[i*2]+arr[i*2+1];

    for(int i=0;i<n;i+=2) cin >> a[i];
    for(int i=1;i<n;i+=2) cin >> a[i];

    vector<int> res1, res2;
    for(int i=0;i<n;i++) {
        if(i%2==0) res1.push_back(search(a[i]));
        else res2.push_back(search(a[i]));
    }
    for(int e:res1) cout << e << ' '; cout << '\n';
    for(int e:res2) cout << e << ' ';
}