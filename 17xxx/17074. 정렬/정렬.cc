#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'000;

int a[MAX];
bool beforeSorted[MAX], afterSorted[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];

    for(int i=0;i<n;i++) {
        beforeSorted[i]=true;
        if(i && a[i-1]>a[i]) break;
    }
    for(int i=n-1;i>=0;i--) {
        afterSorted[i]=true;
        if(i<n-1 && a[i]>a[i+1]) break;
    }

    int cnt=0;
    for(int i=0;i<n;i++) {
        if(beforeSorted[i] && afterSorted[i] && (i==0 || i==n-1 || a[i-1]<=a[i+1])) cnt++;
    }
    cout << cnt;
}