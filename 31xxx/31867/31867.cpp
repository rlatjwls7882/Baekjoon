#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; string K; cin >> N >> K;

    int cnt0=0, cnt1=0;
    for(int i=0;i<N;i++) {
        if((K[i]-'0')%2==0) {
            cnt0++;
        } else {
            cnt1++;
        }
    }

    if(cnt0>cnt1) {
        cout << 0;
    } else if(cnt0<cnt1) {
        cout << 1;
    } else {
        cout << -1;
    }
}