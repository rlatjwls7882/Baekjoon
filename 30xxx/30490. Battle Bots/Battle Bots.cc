#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long N; cin >> N;

    int cnt=0;
    while(N>1) {
        N -= N/2;
        cnt++;
    }
    cout << cnt + N;
}