#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int K, L, N; string s; cin >> K >> L >> N >> s;

    int cnt=0;
    bool chk=false, use=false;
    for(int i=0;i<N || use;i++) {
        if(use) {
            if(i<N && s[i]=='1') {
                cnt=0;
            } else {
                if(++cnt==L) {
                    cout << i+1 << '\n';
                    cnt=0;
                    chk=true;
                    use=false;
                }
            }
        } else {
            if(s[i]=='1') {
                if(++cnt==K) {
                    use=true;
                    cnt=0;
                }
            } else {
                cnt=0;
            }
        }
    }
    if(!chk) cout << "NIKAD";
}