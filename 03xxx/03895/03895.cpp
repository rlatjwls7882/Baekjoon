#include<bits/stdc++.h>
using namespace std;

const int MAX = 10'000;

int sz, arr[MAX*4];

void update(int i) {
    arr[i]=0;
    while(i) {
        i>>=1;
        arr[i] = arr[i*2]+arr[i*2+1];
    }
}

int query(int k) {
    int i=1;
    while(i<sz) {
        i<<=1;
        if(arr[i]<k) {
            k-=arr[i];
            i++;
        }
    }
    update(i);
    return i-sz+1;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    while(true) {
        int n, k, m; cin >> n >> k >> m;
        if(!n) break;
        sz=1;
        while(sz<n) sz<<=1;
        memset(arr, 0, sizeof arr);
        for(int i=sz;i<sz+n;i++) arr[i]=1;
        for(int i=sz-1;i>0;i--) arr[i] = arr[i*2]+arr[i*2+1];
        update(m-1+sz);

        int last=m, ret;
        while(arr[1]) {
            int cur = (last+k-2)%arr[1]+1;
            ret = query(cur);
            last = cur;
        }
        cout << ret << '\n';
    }
}