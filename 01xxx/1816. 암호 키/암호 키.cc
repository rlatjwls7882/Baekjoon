#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    while(N-->0) {
        ll S; cin >> S;
        bool chk=true;
        for(ll i=2;i<=1000000;i++) {
            if(S%i==0) {
                chk=false;
                break;
            }
        }
        if(chk) cout << "YES\n";
        else cout << "NO\n";
    }
}