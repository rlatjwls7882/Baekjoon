#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    bool chk[N+1];
    for(int i=1;i<=N;i++) {
        cin >> chk[i];
    }

    int M; cin >> M;
    while(M-->0) {
        int a, b; cin >> a >> b;
        if(a==1) {
            for(int i=b;i<=N;i+=b) {
                chk[i] = !chk[i];
            }
        } else {
            chk[b] = !chk[b];
            for(int i=1;;i++) {
                if(b-i<1 || b+i>N || chk[b-i]!=chk[b+i]) break;
                chk[b-i] = !chk[b-i];
                chk[b+i] = !chk[b+i];
            }
        }
    }

    for(int i=1;i<=N;i++) {
        cout << chk[i] << " ";
        if(i%20==0) cout << '\n';
    }
}