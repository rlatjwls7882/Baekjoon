#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'000;

int sz=1, res[MAX], a[MAX], arr[MAX*4];

void update(int i) {
    arr[i]--;
    while(i) {
        i>>=1;
        arr[i] = arr[i*2]+arr[i*2+1];
    }
}

void query(int k, int val) {
    int i=1;
    while(i<sz) {
        i<<=1;
        if(arr[i]<k) {
            k-=arr[i];
            i++;
        }
    }
    update(i);
    res[i-sz] = val;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    while(sz<n) sz<<=1;
    for(int i=sz;i<sz+n;i++) arr[i]=1;
    for(int i=sz-1;i>=0;i--) arr[i] = arr[i*2]+arr[i*2+1];
    for(int i=0;i<n;i++) cin >> a[i];

    for(int i=0;i<n;i++) query(a[i]+1, i+1);
    for(int i=0;i<n;i++) cout << res[i] << '\n';
}