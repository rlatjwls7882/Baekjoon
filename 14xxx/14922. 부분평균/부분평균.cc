#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll a[1'000'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];

    ll idx=0, sum=INT_MAX, size=1;
    for(int i=0;i<n-1;i++) {
        if((a[i]+a[i+1])*size<sum*2) {
            idx=i;
            size=2;
            sum=a[i]+a[i+1];
        }
        if(i+2<n && (a[i]+a[i+1]+a[i+2])*size<sum*3) {
            idx=i;
            size=3;
            sum=a[i]+a[i+1]+a[i+2];
        }
    }
    cout << idx;
}