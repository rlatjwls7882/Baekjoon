#include<bits/stdc++.h>
using namespace std;

const int MAX = 200'000*4;
int sz=1, arr[MAX];

void update(int idx) {
    arr[idx]=0;
    while(idx) {
        idx>>=1;
        arr[idx] = arr[idx*2]+arr[idx*2+1];
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
    int n; cin >> n;
    while(sz<n) sz<<=1;
    for(int i=sz;i<sz+n;i++) cin >> arr[i];
    for(int i=sz-1;i>0;i--) arr[i] = arr[i*2]+arr[i*2+1];

    while(n--) {
        int p; cin >> p;
        cout << query(p) << ' ';
    }
}