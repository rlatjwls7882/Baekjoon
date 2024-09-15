#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int L[n];
    for(int i=0;i<n;i++) {
        cin >> L[i];
    }
    sort(L, L+n, greater<int>());

    int sum=0;
    for(int i=1;i<n;i++) {
        sum += L[0]+L[i];
    }
    cout << sum;
}