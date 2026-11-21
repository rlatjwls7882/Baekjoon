#include<bits/stdc++.h>
using namespace std;

const int MAX = 200'001;
long long x[MAX], preSum[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, l; cin >> n >> l;
    for(int i=1;i<=n;i++) {
        cin >> x[i];
        preSum[i] = preSum[i-1] + x[i];
    }

    for(int i=1;i<n;i++) {
        double mid = (preSum[n]-preSum[i])/(double)(n-i);
        if(mid<=x[i]-l || x[i]+l<=mid) {
            cout << "unstable";
            return 0;
        }
    }
    cout << "stable";
}