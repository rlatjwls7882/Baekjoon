#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; string S; cin >> N >> S;

    if(N<=25) {
        cout << S;
    } else {
        bool chk=false;
        for(int i=12;i<S.length()-12;i++) {
            if(S[i]=='.') {
                chk=true;
                break;
            }
        }

        if(chk) {
            cout << S.substr(0, 9) + "......" + S.substr(S.length()-10, 10);
        } else {
            cout << S.substr(0, 11) + "..." + S.substr(S.length()-11, 11);
        }
    }
}