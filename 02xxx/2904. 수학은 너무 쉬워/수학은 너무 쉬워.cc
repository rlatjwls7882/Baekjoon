#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
ll n, arr[100], divCnt[100];

ll gcdTotal() {
    ll gcdVal=arr[0];
    for(int i=1;i<n;i++) gcdVal = gcd(gcdVal, arr[i]);
    for(int i=0;i<n;i++) arr[i]/=gcdVal;
    return gcdVal;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    for(int i=0;i<n;i++) cin >> arr[i];

    ll res=gcdTotal(), cnt=0;
    for(int i=2;i*i<=1'000'000;i++) {
        int cur=0;
        memset(divCnt, 0, sizeof divCnt);
        for(int j=0;j<n;j++) {
            while(arr[j]%i==0) {
                cur++;
                divCnt[j]++;
                arr[j]/=i;
            }
        }

        cur/=n;
        if(cur) {
            for(int j=0;j<n;j++) cnt += max(cur-divCnt[j], 0LL);
            while(cur--) res*=i;
        }
    }
    cout << res << ' ' << cnt;
}