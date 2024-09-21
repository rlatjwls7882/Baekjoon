#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    double n; cin >> n;
    double res=0;
    for(int i=0;i<n;i++) res += n/(n-i);
    cout.precision(5);
    cout << fixed << res;
}