#include<bits/stdc++.h>
using namespace std;

const int MAX = 65537;

int _size=1, arr[MAX*4], a[250'000];

void update(int i, int val) {
    i+=_size;
    arr[i]+=val;
    while(i>1) {
        i>>=1;
        arr[i] = arr[i*2]+arr[i*2+1];
    }
}

int query(int k) {
    int i=1;
    while(i<_size) {
        if(arr[i*2]<k) {
            k-=arr[i*2];
            i=i*2+1;
        } else {
            i*=2;
        }
    }
    return i-_size;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    while(_size<MAX) _size<<=1;

    long long res=0;
    for(int i=0;i<n;i++) {
        cin >> a[i];
        update(a[i], 1);
        if(i>=k) update(a[i-k], -1);
        if(i+1>=k) res += query((k+1)/2);
    }
    cout << res;
}