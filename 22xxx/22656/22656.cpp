#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int N, M, P; cin >> N >> M >> P;
        if(N==0) break;

        int sum=0;
        int X[N];
        for(int i=0;i<N;i++) {
            cin >> X[i];
            sum += X[i];
        }

        if(X[M-1]) cout << sum*(100-P)/X[M-1] << '\n';
        else cout << "0\n";
    }
}