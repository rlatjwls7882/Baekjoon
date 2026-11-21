#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int G1, S1, B1; cin >> G1 >> S1 >> B1;
    int G2, S2, B2; cin >> G2 >> S2 >> B2;
    int cnt=0;
    while(B1<B2) {
        cnt++;
        S1--;
        B1+=9;
    }
    while(S1<S2) {
        cnt++;
        if(G1>G2) {
            G1--;
            S1+=9;
        } else {
            B1-=11;
            S1++;
        }
    }
    while(G1<G2) {
        while(S1<S2+11) {
            cnt++;
            S1++;
            B1-=11;
        }
        cnt++;
        S1-=11;
        G1++;
    }
    if(G1>=G2 && S1>=S2 && B1>=B2) cout << cnt;
    else cout << -1;
}