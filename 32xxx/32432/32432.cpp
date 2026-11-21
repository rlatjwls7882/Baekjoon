#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    int cnt=0;
    while(K>=2*N-1) {
        cnt++;
        K-=N;
    }
    cout << cnt;
}