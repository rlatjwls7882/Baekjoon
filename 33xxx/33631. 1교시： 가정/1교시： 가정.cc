#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int Fs, Cs, Es, Bs, Fn, Cn, En, Bn, Q; cin >> Fs >> Cs >> Es >> Bs >> Fn >> Cn >> En >> Bn >> Q;

    int cookie=0;
    while(Q--) {
        int x, i; cin >> x >> i;

        if(x==1) {
            if(min({Fs/Fn, Cs/Cn, Es/En, Bs/Bn})>=i) {
                cookie += i;
                Fs -= Fn*i;
                Cs -= Cn*i;
                Es -= En*i;
                Bs -= Bn*i;
                cout << cookie << '\n';
            } else {
                cout << "Hello, siumii\n";
            }
        } else if(x==2) {
            Fs += i;
            cout << Fs << '\n';
        } else if(x==3) {
            Cs += i;
            cout << Cs << '\n';
        } else if(x==4) {
            Es += i;
            cout << Es << '\n';
        } else {
            Bs += i;
            cout << Bs << '\n';
        }
    }
}