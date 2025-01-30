#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    int cnt=0;
    while(n--) {
        int inp; cin >> inp;
        cnt += (inp+1)/2;
    }
    cout << cnt;
}