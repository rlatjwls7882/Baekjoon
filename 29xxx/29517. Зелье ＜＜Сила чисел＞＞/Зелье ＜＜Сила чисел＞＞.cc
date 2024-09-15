#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long N; cin >> N;

    int cnt=0;
    for(long long i=2;i<=N;i*=2) {
        for(long long j=i;j<=N;j*=3) {
            cnt++;
        }
    }
    cout << cnt;
}