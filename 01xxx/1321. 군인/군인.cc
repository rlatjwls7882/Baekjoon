#include<bits/stdc++.h>
using namespace std;

const int MAX = 500'000;

int _size=1, arr[MAX*4];

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
        i<<=1;
        if(arr[i]<k) {
            k-=arr[i];
            i++;
        }
    }
    return i-_size+1;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(_size<n) _size<<=1;
    for(int i=0;i<n;i++) cin >> arr[i+_size];
    for(int i=_size-1;i>0;i--) arr[i] = arr[i*2]+arr[i*2+1];

    int m; cin >> m;
    while(m--) {
        int x, i; cin >> x >> i;
        if(x==1) {
            int a; cin >> a;
            update(i-1, a);
        } else {
            cout << query(i) << '\n';
        }
    }
}