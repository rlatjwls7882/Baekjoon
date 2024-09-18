#include<bits/stdc++.h>
using namespace std;

void EEA(int r1, int r2) {
    int K = r1;
    int s1=1, s2=0, t1=0, t2=1;
    while(r2!=0) {
        int q = r1/r2;
        int tmp = r1-r2*q;
        r1 = r2;
        r2 = tmp;

        tmp = s1-s2*q;
        s1 = s2;
        s2 = tmp;

        tmp = t1-t2*q;
        t1 = t2;
        t2 = tmp;
    }

    if(r1!=1 || t1>1000000000) cout << "IMPOSSIBLE\n";
    else cout << t1+(t1<0?K:0) << '\n';
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int K, C; cin >> K >> C;
        if(C==1) {
            if(K==1000000000) cout << "IMPOSSIBLE\n";
            else cout << K+1 << '\n';
        } else if(K==1) {
            cout << "1\n";
        } else {
            EEA(K, C);
        }
    }
}