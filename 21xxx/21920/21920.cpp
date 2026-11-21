#include<bits/stdc++.h>
using namespace std;

int A[500000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> A[i];
    int X; cin >> X;

    double sum=0, cnt=0;
    for(int i=0;i<n;i++) {
        if(gcd(X, A[i])==1) {
            cnt++;
            sum += A[i];
        }
    }
    cout << sum/cnt;
}