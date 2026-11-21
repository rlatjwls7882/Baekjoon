#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int A[n];
    for(int i=0;i<n;i++) cin >> A[i];

    vector<int> diff;
    for(int i=0;i<n;i++) {
        for(int j=i+1;j<n;j++) {
            diff.push_back(abs(A[i]-A[j]));
        }
    }

    int gcdVal = diff[0];
    for(int i=1;i<diff.size();i++) gcdVal = gcd(gcdVal, diff[i]);
    cout << gcdVal;
}