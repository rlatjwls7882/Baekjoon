#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int K, C; cin >> K >> C;
    while(C-->0) {
        int M, N; cin >> M >> N;
        if(max(M-N-2, N-M-1)>=K+1-max(M, N)) cout << "0\n";
        else cout << "1\n";
    }
}