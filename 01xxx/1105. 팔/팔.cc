#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string L, R; cin >> L >> R;

    int cnt=0;
    if(L.length()==R.length()) {
        for(int i=0;i<L.length();i++) {
            if(L[i]=='8' && R[i]=='8') cnt++;
            else if(L[i]<R[i]) break;
        }
    }
    cout << cnt;
}