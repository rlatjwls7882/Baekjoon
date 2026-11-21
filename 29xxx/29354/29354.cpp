#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    long long sum=0, curMin=INT_MAX;
    for(int i=0;i<n-1;i++) {
        long long cur; cin >> cur;
        curMin = min(curMin, cur);
        sum += curMin;
    }
    cout << sum;
}