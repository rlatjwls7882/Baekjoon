#include<bits/stdc++.h>
using namespace std;

int n, m, _size=1, arr[4'000'000];

int query(int L, int R) {
    int ret=0;
    L = max(0, L);
    R = min(R, n-1);
    for(L+=_size, R+=_size;L<=R;L>>=1, R>>=1) {
        if(L&1) ret = max(ret, arr[L++]);
        if(!(R&1)) ret = max(ret, arr[R--]);
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    while(_size<n) _size<<=1;
    for(int i=0;i<n;i++) cin >> arr[i+_size];
    for(int i=_size-1;i>0;i--) arr[i] = max(arr[i*2], arr[i*2+1]);
    for(int i=m-1;i<n-m+1;i++) cout << query(i-m+1, i+m-1) << ' ';
}