#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, K; cin >> N >> M >> K;

    if(N+M-1>K) {
        cout << "NO";
    } else {
        cout << "YES\n";
        for(int i=0;i<N;i++) {
            for(int j=1;j<=M;j++) {
                cout << i+j << " ";
            }
            cout << '\n';
        }
    }
}