#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; string s; cin >> n >> s;

    int Acnt=0, Ncnt=0, total=0;
    for(int i=0;i<n;i++) {
        if(s[i]=='N' && Acnt>0) Ncnt++;
        else if(s[i]=='A' && ++Acnt==2) {
            if(Ncnt==1) total++;
            Ncnt=0;
            Acnt=1;
        }
    }
    cout << total;
}