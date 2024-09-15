#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long N; cin >> N;

    for(long long r=2;1+r+r*r<=N;r++) {
        long long S=1+r;
        for(int i=3;;i++) {
            S += pow(r, i-1);
            if(S>N) break;
            if(N%S==0) {
                cout << i << '\n';
                long long a = N/S;
                for(int j=0;j<i;j++) {
                    cout << (long long)(a*pow(r, j)) << ' ';
                }
                return 0;
            }
        }
    }
    cout << -1;
}