#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;

int sz=1, a[MAX], res[MAX], arr[MAX*4];

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
    res[i-sz]=val;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];

    while(sz<n) sz<<=1;
    for(int i=sz;i<sz+n;i++) arr[i]=1;
    for(int i=sz-1;i>0;i--) arr[i] = arr[i*2]+arr[i*2+1];

    for(int i=n-1;i>=0;i--) query(i-a[i]+1, i+1);
    for(int i=0;i<n;i++) cout << res[i] << ' ';
}