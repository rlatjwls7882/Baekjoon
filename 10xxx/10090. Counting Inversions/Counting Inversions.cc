#include<bits/stdc++.h>
using namespace std;

const int MAX = 1'000'001;
int sz=1, arr[MAX*4];

void update(int i) {
    i+=sz;
    arr[i]++;
    while(i>1) {
        i>>=1;
        arr[i] = arr[i*2]+arr[i*2+1];
    }
}

int query(int l, int r=MAX-1) {
    int ret=0;
    for(l+=sz, r+=sz;l<=r;l>>=1, r>>=1) {
        if(l&1) ret+=arr[l++];
        if(!(r&1)) ret+=arr[r--];
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(sz<MAX) sz<<=1;

    long long cnt=0;
    while(n--) {
        int a; cin >> a;
        cnt += query(a);
        update(a);
    }
    cout << cnt;
}