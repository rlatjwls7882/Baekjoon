#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int T, X, N; cin >> T >> X >> N;

    bool chk=true;
    while(N-->0) {
        int K; cin >> K;
        bool curChk=false;
        while(K-->0) {
            int cur; cin >> cur;
            if(cur==X) curChk=true;
        }
        chk &= curChk;
    }
    cout << (chk?"YES":"NO");
}