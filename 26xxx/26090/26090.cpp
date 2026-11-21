#include<bits/stdc++.h>
using namespace std;

int a[500];

bool isSosu(int n) {
    if(n<=1) return false;
    for(int i=2;i*i<=n;i++) {
        if(n%i==0) return false;
    }
    return true;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];

    int res=0;
    for(int i=0;i<n;i++) {
        int sum=0;
        for(int j=i;j<n;j++) {
            sum+=a[j];
            res+=isSosu(j-i+1) && isSosu(sum);
        }
    }
    cout << res;
}