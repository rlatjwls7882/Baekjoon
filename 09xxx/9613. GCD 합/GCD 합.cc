#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        int arr[n];
        for(int i=0;i<n;i++) {
            cin >> arr[i];
        }

        long long sum=0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                sum += gcd(arr[i], arr[j]);
            }
        }
        cout << sum << '\n';
    }
}