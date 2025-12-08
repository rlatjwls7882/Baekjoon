#include<bits/stdc++.h>
using namespace std;

const int MAX = 200'001;

int sz, idx[MAX], arr[MAX*4];

void update(int i, int val) {
    i+=sz;
    arr[i]+=val;
    while(i) {
        i>>=1;
        arr[i] = arr[i*2]+arr[i*2+1];
    }
}

int query(int r) {
    int l=0, ret=0;
    for(l+=sz, r+=sz;l<=r;l>>=1, r>>=1) {
        if(l&1) ret += arr[l++];
        if(!(r&1)) ret += arr[r--];
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        int n, m; cin >> n >> m;
        sz=1;
        while(sz<n+m) sz<<=1;
        memset(arr, 0, sizeof arr);
        for(int i=1;i<=n;i++) idx[i]=i-1+m;
        for(int i=sz+m;i<sz+m+n;i++) arr[i]=1;
        for(int i=sz-1;i>0;i--) arr[i] = arr[i*2]+arr[i*2+1];

        for(int i=m-1;i>=0;i--) {
            int a; cin >> a;
            cout << query(idx[a])-1 << ' ';
            update(idx[a], -1);
            idx[a]=i;
            update(idx[a], 1);
        }
        cout << '\n';
    }
}