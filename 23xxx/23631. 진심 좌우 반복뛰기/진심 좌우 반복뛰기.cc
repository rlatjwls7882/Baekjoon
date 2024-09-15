#include<bits/stdc++.h>
using namespace std;

int moveX[2] = {1, 0};
int moveY[2] = {0, 1};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int N, K; cin >> N >> K;
        N--;

        int cnt=int(sqrt(N/(double)K*2+1/4.)-1/2.);
        if(cnt%2==0) {
            cout << -cnt/2*K+N-cnt*(cnt+1)/2*K << " R\n";
        } else {
            cout << (cnt+1)/2*K-N+cnt*(cnt+1)/2*K << " L\n";
        }
    }
}