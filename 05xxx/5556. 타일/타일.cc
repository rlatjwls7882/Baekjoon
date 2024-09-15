#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;

    while(K-->0) {
        int a, b; cin >> a >> b;
        if(N%2==0) {
            if(N/2<a && N/2<b) cout << (N/2-max(a-1-N/2, b-1-N/2)-1)%3+1 << '\n';
            else if(N/2<a) cout << (N/2-max(a-1-N/2, N/2-b)-1)%3+1 << '\n';
            else if(N/2<b) cout << (N/2-max(N/2-a, b-1-N/2)-1)%3+1 << '\n';
            else cout << (N/2-max(N/2-a, N/2-b)-1)%3+1 << '\n';
        } else {
            cout << ((N+1)/2-max(abs((N+1)/2-a), abs((N+1)/2-b))-1)%3+1 << '\n';
        }
    }
}