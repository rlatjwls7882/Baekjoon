#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int n; cin >> n;
    
    int sum=0;
    int a[n];
    for(int i=0;i<n;i++) {
        cin >> a[i];
        sum += a[i];
    }
    sort(a, a+n, greater<int>());

    long long cost=0;
    for(int i=0;i<n;i++) {
        cost += (long long)a[i]*(sum-a[i]);
        sum -= a[i];
    }
    cout << cost;
}